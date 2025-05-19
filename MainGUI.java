import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;

public class MainGUI {

    static ArrayList<String> registeredStudents = new ArrayList<>();
    static HashMap<String, String> lecturerAssignments = new HashMap<>();
    static HashMap<String, ArrayList<String>> clubMembers = new HashMap<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("MSU University System");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(900, 600);
            frame.setLocationRelativeTo(null);

            JPanel cardPanel = new JPanel(new CardLayout());

            // Navigation
            JPanel navPanel = new JPanel(new GridLayout(4, 1, 10, 10));
            navPanel.setPreferredSize(new Dimension(200, 0));
            navPanel.setBackground(new Color(40, 55, 71));

            JButton btnStudent = new JButton("Student Registration");
            JButton btnLecturer = new JButton("Lecturer Assignment");
            JButton btnClub = new JButton("Club Management");
            JButton btnExit = new JButton("Exit");

            for (JButton btn : new JButton[]{btnStudent, btnLecturer, btnClub, btnExit}) {
                btn.setFocusPainted(false);
                btn.setBackground(new Color(93, 109, 126));
                btn.setForeground(Color.WHITE);
                navPanel.add(btn);
            }

            // STUDENT PAGE
            JPanel studentPage = new JPanel(new BorderLayout(10, 10));
            studentPage.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
            JTextField studentIdField = new JTextField();
            JTextField studentNameField = new JTextField();
            JTextField studentAgeField = new JTextField();
            JComboBox<String> courseBox = new JComboBox<>(new String[]{"BCS", "BCF", "BBC"});
            JRadioButton club1 = new JRadioButton("Cyber Synergy Club");
            JRadioButton club2 = new JRadioButton("Choir Club");
            ButtonGroup clubGroup = new ButtonGroup();
            clubGroup.add(club1); clubGroup.add(club2);
            JCheckBox newsletterCheckbox = new JCheckBox("Receive Newsletter");
            JButton studentSubmit = new JButton("Register Student");
            JTextArea studentOutput = new JTextArea(8, 40);
            studentOutput.setEditable(false);
            JPanel studentForm = new JPanel(new GridLayout(7, 2, 10, 10));
            studentForm.add(new JLabel("Student ID:")); studentForm.add(studentIdField);
            studentForm.add(new JLabel("Name:")); studentForm.add(studentNameField);
            studentForm.add(new JLabel("Age:")); studentForm.add(studentAgeField);
            studentForm.add(new JLabel("Course:")); studentForm.add(courseBox);
            studentForm.add(new JLabel("Club:"));
            JPanel clubPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            clubPanel.add(club1); clubPanel.add(club2);
            studentForm.add(clubPanel);
            studentForm.add(new JLabel("Newsletter:")); studentForm.add(newsletterCheckbox);
            studentPage.add(studentForm, BorderLayout.NORTH);
            studentPage.add(studentSubmit, BorderLayout.CENTER);
            studentPage.add(new JScrollPane(studentOutput), BorderLayout.SOUTH);

            studentSubmit.addActionListener(e -> {
                String id = studentIdField.getText().trim();
                String name = studentNameField.getText().trim();
                String age = studentAgeField.getText().trim();
                String course = (String) courseBox.getSelectedItem();
                String club = club1.isSelected() ? club1.getText() : (club2.isSelected() ? club2.getText() : "None");
                boolean newsletter = newsletterCheckbox.isSelected();
                if (id.isEmpty() || name.isEmpty() || age.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill in all fields.");
                    return;
                }
                String studentInfo = String.format("ID: %s | Name: %s | Age: %s | Course: %s | Club: %s | Newsletter: %s\n",
                        id, name, age, course, club, newsletter ? "Yes" : "No");
                registeredStudents.add(studentInfo);
                studentOutput.setText(String.join("\n", registeredStudents));
                // Clear fields
                studentIdField.setText(""); studentNameField.setText(""); studentAgeField.setText("");
                clubGroup.clearSelection(); newsletterCheckbox.setSelected(false);
            });

            // LECTURER PAGE
            JPanel lecturerPage = new JPanel(new BorderLayout(10, 10));
            lecturerPage.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
            JTextField lecturerNameField = new JTextField();
            JComboBox<String> lecturerCourseBox = new JComboBox<>(new String[]{"BCS", "BCF", "BBC"});
            JButton assignLecturerButton = new JButton("Assign Lecturer");
            JTextArea lecturerOutput = new JTextArea(8, 40);
            lecturerOutput.setEditable(false);
            JPanel lecturerForm = new JPanel(new GridLayout(3, 2, 10, 10));
            lecturerForm.add(new JLabel("Lecturer Name:")); lecturerForm.add(lecturerNameField);
            lecturerForm.add(new JLabel("Course:")); lecturerForm.add(lecturerCourseBox);
            lecturerForm.add(new JLabel()); lecturerForm.add(assignLecturerButton);
            lecturerPage.add(lecturerForm, BorderLayout.NORTH);
            lecturerPage.add(new JScrollPane(lecturerOutput), BorderLayout.CENTER);

            assignLecturerButton.addActionListener(e -> {
                String name = lecturerNameField.getText().trim();
                String course = (String) lecturerCourseBox.getSelectedItem();
                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter lecturer name.");
                    return;
                }
                lecturerAssignments.put(course, name);
                StringBuilder sb = new StringBuilder();
                for (String c : lecturerAssignments.keySet()) {
                    sb.append("Course: ").append(c)
                      .append(" | Lecturer: ").append(lecturerAssignments.get(c)).append("\n");
                }
                lecturerOutput.setText(sb.toString());
                lecturerNameField.setText("");
            });

            // CLUB PAGE
            JPanel clubPage = new JPanel(new BorderLayout(10, 10));
            clubPage.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
            JTextField memberNameField = new JTextField();
            JComboBox<String> clubSelectBox = new JComboBox<>(new String[]{"Cyber Synergy Club", "Choir Club"});
            JButton addMemberButton = new JButton("Add Member");
            JTextArea clubOutput = new JTextArea(8, 40);
            clubOutput.setEditable(false);
            JPanel clubForm = new JPanel(new GridLayout(3, 2, 10, 10));
            clubForm.add(new JLabel("Member Name:")); clubForm.add(memberNameField);
            clubForm.add(new JLabel("Club:")); clubForm.add(clubSelectBox);
            clubForm.add(new JLabel()); clubForm.add(addMemberButton);
            clubPage.add(clubForm, BorderLayout.NORTH);
            clubPage.add(new JScrollPane(clubOutput), BorderLayout.CENTER);

            addMemberButton.addActionListener(e -> {
                String member = memberNameField.getText().trim();
                String club = (String) clubSelectBox.getSelectedItem();
                if (member.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter member name.");
                    return;
                }
                clubMembers.putIfAbsent(club, new ArrayList<>());
                clubMembers.get(club).add(member);
                StringBuilder sb = new StringBuilder();
                for (String c : clubMembers.keySet()) {
                    sb.append("Club: ").append(c).append("\n");
                    for (String m : clubMembers.get(c)) {
                        sb.append(" - ").append(m).append("\n");
                    }
                }
                clubOutput.setText(sb.toString());
                memberNameField.setText("");
            });

            // Add to card layout
            cardPanel.add(studentPage, "Student");
            cardPanel.add(lecturerPage, "Lecturer");
            cardPanel.add(clubPage, "Club");

            // Add to frame
            frame.add(navPanel, BorderLayout.WEST);
            frame.add(cardPanel, BorderLayout.CENTER);

            // Navigation
            CardLayout cl = (CardLayout) cardPanel.getLayout();
            btnStudent.addActionListener(e -> cl.show(cardPanel, "Student"));
            btnLecturer.addActionListener(e -> cl.show(cardPanel, "Lecturer"));
            btnClub.addActionListener(e -> cl.show(cardPanel, "Club"));
            btnExit.addActionListener(e -> System.exit(0));

            frame.setVisible(true);
        });
    }
}

//In Assignment 3 Eainan is doing this 
