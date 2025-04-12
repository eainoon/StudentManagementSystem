public class Student {
    private String name;
    private String id;
    private int age;
    private double gpa;
    private Course course;
    private int attendance;
    private University university;

    // Default Constructor
    public Student() {
        this.name = "unknown";
        this.id = "0";
        this.age = 0;
        this.gpa = 0.0;
        this.course = null;
        this.attendance = 0;
        this.university = null;
    }

    // Parameterized Constructor
    public Student(String name, String id, int age, double gpa, Course course, int attendance, University university) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gpa = gpa;
        this.course = course;
        this.attendance = attendance;
        this.university = university;
    }

    // Getter Methods
    public String getName() { return name; }
    public String getId() { return id; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
    public Course getCourse() { return course; }
    public int getAttendance() { return attendance; }
    public University getUniversity() { return university; }

    // Setter Methods
    public void setName(String name) { this.name = name; }
    public void setId(String id) { this.id = id; }
    public void setAge(int age) { this.age = age; }
    public void setGpa(double gpa) { this.gpa = gpa; }
    public void setCourse(Course course) { this.course = course; }
    public void setAttendance(int attendance) { this.attendance = attendance; }
    public void setUniversity(University university) { this.university = university; }

    // Update GPA
    public void updateGpa(double gpa) {
        this.gpa = gpa;
        System.out.println("Student " + id + ", " + name + ": New GPA: " + gpa);
    }

    // Record Attendance
    public void recordAttendance() {
        this.attendance += 1;
        System.out.println("Student " + id + ", " + name + ": Updated number of attendance days: " + attendance);
    }

    // Display Student Information
    public void displayStuInfo() {
        System.out.println("\n=== Student Information ===");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa); // Moved outside of if-check to always print
        System.out.println("Attendance: " + attendance); // Moved outside of if-check to always print
        if (course != null) {
            System.out.println("Course: " + course.getCourseCode() + " (" + course.getCourseName() + ")");
        }
        if (university != null) {
            System.out.println("University: " + university.getName());
        }
    }
}
