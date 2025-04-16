// This class represents a Course in the university system
public class Course {
    private String courseName;

    // Constructor to initialize the course with its name
    public Course(String name) {
        this.courseName = name;
    }

    // Getter for the course name
    public String getCourseName() {
        return courseName;
    }

    // Method to display course details
    public void displayCourseInfo() {
        System.out.println("Course: " + courseName);
    }
}

//In Assignment 2, Marsha is continuing this from Eainan in Assignment 1
