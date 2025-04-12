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

    // Getter Methods
    public String getCourseName() { return courseName; }
    public String getCourseCode() { return courseCode; }
    public int getCredits() { return credits; }
    public Lecturer getLecturer() { return lecturer; }
    public List<Student> getEnrolledStudents() { return enrolledStudents; }

    // Methods to Add/Remove Students
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println(student.getName() + " has enrolled in " + courseName);
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
        System.out.println(student.getName() + " has been removed from " + courseName);
    }

    public void getCourseDetails() {
        System.out.println("\nCourse: " + courseName + " (" + courseCode + ")");
        System.out.println("Credits: " + credits);
        System.out.println("Lecturer: " + lecturer.getName() + " (" + lecturer.getDepartment() + ")");
        System.out.println("Total Enrolled Students: " + enrolledStudents.size());
    }
}
