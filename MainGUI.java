import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGUI {

    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Simple Student Registration System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 500);
        frame.setLayout(new FlowLayout());

        // GUI Components
        JLabel nameLabel = new JLabel("Student Name:");
        JTextField nameField = new JTextField(20);

        JLabel idLabel = new JLabel("Student ID:");
        JTextField idField = new JTextField(20);

        JLabel courseLabel = new JLabel("Course:");
        JTextField courseField = new JTextField(20);

        JCheckBox club1 = new JCheckBox("Cyber Synergy Club");
        JCheckBox club2 = new JCheckBox("Choir Club");

        JButton submitButton = new JButton("Submit");
        JTextArea outputArea = new JTextArea(10, 35);
        outputArea.setEditable(false);

        // Add components to frame
        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(idLabel);
        frame.add(idField);

        frame.add(courseLabel);
        frame.add(courseField);

        frame.add(new JLabel("Select Clubs:"));
        frame.add(club1);
        frame.add(club2);

        frame.add(submitButton);
        frame.add(new JScrollPane(outputArea));

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

        frame.setVisible(true);
    }
}

//In Assignment 3 Eainan is doing this 
