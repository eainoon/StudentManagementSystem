import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private String courseCode;
    private int credits;
    private Lecturer lecturer;
    private List<Student> enrolledStudents;

    // Constructor
    public Course(String courseName, String courseCode, int credits, Lecturer lecturer) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
        this.lecturer = lecturer;
        this.enrolledStudents = new ArrayList<>();
    }

    // Getters
    public String getCourseName() { return courseName; }
    public String getCourseCode() { return courseCode; }
    public int getCredits() { return credits; }
    public Lecturer getLecturer() { return lecturer; }
    public List<Student> getEnrolledStudents() { return enrolledStudents; }

    // Methods
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println(student.getName() + " has enrolled in " + courseName);
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
        System.out.println(student.getName() + " has been removed from " + courseName);
    }

    public void getCourseDetails() {
        System.out.println("\n== Course Info ==");
        System.out.println("Course: " + courseName + " (" + courseCode + ")");
        System.out.println("Credits: " + credits);
        System.out.println("Lecturer: " + lecturer.getName() + " (" + lecturer.getDepartment() + ")");
        System.out.println("Total Enrolled Students:");
        if (enrolledStudents.isEmpty()) {
            System.out.println("No enrolled students yet!");
        } else {
            for (Student s : enrolledStudents) {
                System.out.println("- " + s.getName() + " [" + s.getId() + "]");
            }
        }
    }
}
//In Assignment 2, Marsha is continuing this from Eainan in Assignment 1
