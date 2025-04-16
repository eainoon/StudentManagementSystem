import java.util.ArrayList;
import java.util.List;

public class Lecturer {  
    private String name;
    private String lecturerID;
    private String department;
    private double salary;
    private List<String> coursesTaught;
    private int experience;

    // Default Constructor
    public Lecturer() {
        this.name = "Dr. Jamal";
        this.lecturerID = "L1023";
        this.department = "FISE (ISC)";
        this.salary = 7500.00;
        this.coursesTaught = new ArrayList<>();
        this.coursesTaught.add("Computer Architecture");
        this.coursesTaught.add("Software Analysis and Modelling");
        this.experience = 12;
    }

    // Parameterized Constructor
    public Lecturer(String name, String lecturerID, String department, double salary, List<String> coursesTaught, int experience) {
        this.name = name;
        this.lecturerID = lecturerID;
        this.department = department;
        this.salary = salary;
        this.coursesTaught = coursesTaught;
        this.experience = experience;
    }

    // Getter Methods
    public String getName() { return name; }
    public String getLecturerID() { return lecturerID; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public List<String> getCoursesTaught() { return coursesTaught; }
    public int getExperience() { return experience; }

    // Setter Methods
    public void setName(String name) { this.name = name; }
    public void setLecturerID(String lecturerID) { this.lecturerID = lecturerID; }
    public void setDepartment(String department) { this.department = department; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setCoursesTaught(List<String> coursesTaught) { this.coursesTaught = coursesTaught; }
    public void setExperience(int experience) { this.experience = experience; }

    // Method 1 - Display Lecturer Details
    public void displayLecturerDetails() {
        System.out.println("\n== Lecturer Details ==");
        System.out.println("Name: " + name);
        System.out.println("ID: " + lecturerID);
        System.out.println("Department: " + department);
        System.out.println("Salary: RM" + salary);
        System.out.println("Courses Taught: " + String.join(", ", coursesTaught));
        System.out.println("Years of Experience: " + experience);
    }

    // Method 2 - Increase Salary
    public void increaseSalary(double amount) {
        this.salary += amount;
        System.out.println(name + "'s salary increased by RM" + amount + ". New salary: RM" + salary);
    }

    // Method 3 - Add New Course
    public void addCourse(String newCourse) {
        this.coursesTaught.add(newCourse);
        System.out.println(name + " is now teaching: " + String.join(", ", coursesTaught));
    }
}
import java.util.ArrayList;
import java.util.List;

public class Lecturer extends Person {
    private double salary;
    private String department;
    private int experience;
    private List<String> coursesTaught;

    // Default Constructor
    public Lecturer() {
        super(); // calls default constructor from Person
        this.salary = 0.0;
        this.department = "Unknown";
        this.experience = 0;
        this.coursesTaught = new ArrayList<>();
    }

    // Parameterized Constructor
    public Lecturer(String name, String id, int age, double salary, String department, int experience) {
        super(name, id, age);
        this.salary = salary;
        this.department = department;
        this.experience = experience;
        this.coursesTaught = new ArrayList<>();
    }

    // Getters
    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getExperience() {
        return experience;
    }

    public List<String> getCoursesTaught() {
        return coursesTaught;
    }

    // Setters
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setCoursesTaught(List<String> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    // Method 1: Add a course to the list
    public void addCourse(String courseCode) {
        coursesTaught.add(courseCode);
        System.out.println("Lecturer " + getName() + " is now teaching: " + courseCode);
    }

    // Method 2: Increase salary
    public void increaseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
            System.out.println("Lecturer " + getName() + "'s new salary: RM" + salary);
        } else {
            System.out.println("Invalid salary increment.");
        }
    }

    // Overridden Method: Display lecturer details
    @Override
    public void displayInfo() {
        System.out.println("\n=== Lecturer Information ===");
        super.displayInfo(); // Call Person's displayInfo
        System.out.println("Department: " + department);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Salary: RM" + salary);
        if (coursesTaught.isEmpty()) {
            System.out.println("Courses Taught: None yet.");
        } else {
            System.out.println("Courses Taught: ");
            for (String course : coursesTaught) {
                System.out.println("- " + course);
            }
        }
    }
}
