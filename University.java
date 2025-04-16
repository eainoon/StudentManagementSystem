import java.util.*;

public class University {
    private String name, city, state;
    private int studentCount;
    private List<String> faculties = new ArrayList<>();
    private List<String> courses = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private List<Department> departments = new ArrayList<>();
    private List<Club> clubs = new ArrayList<>();
    private Library library;

    // Constructor to initialize the university with name, city, state, and student count
    public University(String name, String city, String state, int studentCount) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.studentCount = studentCount;
    }

    // Method to add a faculty to the university
    public void addFaculty(String faculty) {
        faculties.add(faculty);
    }

    // Method to add a course to the university
    public void addCourse(String course) {
        courses.add(course);
    }

    // Method to add a student to the university
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to add a department to the university
    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    // Method to set the university's library
    public void setLibrary(Library lib) {
        this.library = lib;
    }

    // Method to add a club to the university
    public void addClub(Club club) {
        clubs.add(club);
    }

    // Method to display university details
    public void displayUniversityDetails() {
        System.out.println("\nUniversity Name: " + name);
        System.out.println("Location: " + city + ", " + state);
        System.out.println("Total Students: " + studentCount);
    }

    // Method to display the faculties of the university
    public void displayFaculties() {
        System.out.println("\nFaculties:");
        for (String f : faculties) {
            System.out.println("- " + f);
        }
    }

    // Method to display the courses offered by the university
    public void displayCourses() {
        System.out.println("\nCourses Offered:");
        for (String c : courses) {
            System.out.println("- " + c);
        }
    }

    // Method to display all departments in the university
    public void displayDepartments() {
        System.out.println("\nDepartments:");
        for (Department dept : departments) {
            System.out.println("- " + dept.getDepartmentName());
        }
    }

    // Method to display the library info
    public void displayLibraryInfo() {
        if (library != null) {
            library.displayLibraryInfo();
        } else {
            System.out.println("No library information available.");
        }
    }

    // Method to display all clubs in the university
    public void displayClubs() {
        System.out.println("\nClubs:");
        for (Club club : clubs) {
            club.displayClubDetails();
        }
    }
}

//In Assignment 2, Marsha is continuing this from Marsha in Assignment 1
//In Assignment 2, Marsha is continuing this from Marsha in Assignment 1
