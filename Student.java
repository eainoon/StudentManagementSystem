// Student class representing a student in the university system
public class Student {
    private String studentId;
    private String name;
    private String course;

    // Constructor to initialize student details
    public Student(String studentId, String name, String course) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
    }

    // Getter for studentId
    public String getStudentId() {
        return studentId;
    }

    // Getter for student name
    public String getName() {
        return name;
    }

    // Getter for course enrolled
    public String getCourse() {
        return course;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("\nStudent Info:");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}
//In Assignment 2, Ui is continuing this from Ui in Assignment 1
