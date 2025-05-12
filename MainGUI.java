import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGUI {

    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("Student Registration System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLocationRelativeTo(null); // Center on screen

        // Main panel with padding
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Form panel
        JPanel formPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createTitledBorder("Student Information"));

        // Input components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel idLabel = new JLabel("Student ID:");
        JTextField idField = new JTextField();

        JLabel courseLabel = new JLabel("Course:");
        JTextField courseField = new JTextField();

        JCheckBox club1 = new JCheckBox("Cyber Synergy Club");
        JCheckBox club2 = new JCheckBox("Choir Club");

        // Add form inputs to formPanel
        formPanel.add(nameLabel);    formPanel.add(nameField);
        formPanel.add(idLabel);      formPanel.add(idField);
        formPanel.add(courseLabel);  formPanel.add(courseField);
        formPanel.add(new JLabel("Clubs:")); formPanel.add(new JLabel()); // spacing
        formPanel.add(club1);        formPanel.add(club2);

        // Output area
        JTextArea outputArea = new JTextArea(10, 40);
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Registration Output"));

        // Submit button
        JButton submitButton = new JButton("Register Student");

        // Button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitButton);

        // Add panels to main layout
        panel.add(formPanel, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.CENTER);
        panel.add(scrollPane, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);

        // Action for submit button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String id = idField.getText();
                String course = courseField.getText();

                Student student = new Student(id, name, course);

                String clubs = "";
                if (club1.isSelected()) clubs += "- " + club1.getText() + "\n";
                if (club2.isSelected()) clubs += "- " + club2.getText() + "\n";

                outputArea.setText("== STUDENT REGISTERED ==\n");
                outputArea.append("Name: " + student.getName() + "\n");
                outputArea.append("ID: " + student.getStudentId() + "\n");
                outputArea.append("Course: " + student.getCourse() + "\n");
                outputArea.append("Clubs Joined:\n" + (clubs.equals("") ? "None" : clubs));
            }
        });
    }
}


//In Assignment 3 Eainan is doing this 

//In Assignment 3 Eainan is doing this 
