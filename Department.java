import java.util.*;

// This class represents a Department in the university system
public class Department {
    private String departmentName;
    private List<Lecturer> lecturers = new ArrayList<>();

    // Constructor to initialize the department with its name
    public Department(String name) {
        this.departmentName = name;
    }

    // Method to add a lecturer to the department
    public void addLecturer(Lecturer lecturer) {
        lecturers.add(lecturer);
    }

    // Method to display the details of the department and its lecturers
    public void displayDepartmentDetails() {
        System.out.println("\nDepartment: " + departmentName);
        if (lecturers.isEmpty()) {
            System.out.println("No lecturers assigned to this department yet.");
        } else {
            System.out.println("Lecturers:");
            for (Lecturer lecturer : lecturers) {
                lecturer.displayLecturerInfo();  // Display each lecturer's info
            }
        }
    }

    // Getter for the department name
    public String getDepartmentName() {
        return departmentName;
    }
}

//Eainan is doing this in Assignment 2
