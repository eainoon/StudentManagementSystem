// University class stores details about the university and manages faculties, courses, clubs, etc.
public class University {

    private String name;
    private String location;
    private String state;
    private int totalStudents;
    private List<String> faculties;
    private List<String> courses;
    private List<Department> departments;
    private Library library;
    private List<Club> clubs;
    private List<Student> students;

    // Constructor to initialize university details
    public University(String name, String location, String state, int totalStudents) {
        this.name = name;
        this.location = location;
        this.state = state;
        this.totalStudents = totalStudents;
        this.faculties = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.departments = new ArrayList<>();
        this.clubs = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    // Method to add a faculty to the university
    public void addFaculty(String faculty) {
        faculties.add(faculty);
    }

    // Method to add a course to the university
    public void addCourse(String course) {
        courses.add(course);
    }

    // Method to add a department to the university
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to set the library for the university
    public void setLibrary(Library library) {
        this.library = library;
    }

    // Method to add a club to the university
    public void addClub(Club club) {
        clubs.add(club);
    }

    // Method to add a student to the university
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to display all university details
    public void displayUniversityDetails() {
        System.out.println("University Name: " + name);
        System.out.println("Location: " + location + ", " + state);
        System.out.println("Total Students: " + totalStudents);
    }

    // Method to display all faculties
    public void displayFaculties() {
        System.out.println("\nFaculties:");
        for (String faculty : faculties) {
            System.out.println("- " + faculty);
        }
    }

    // Method to display all courses
    public void displayCourses() {
        System.out.println("\nCourses Offered:");
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }
}

//In Assignment 2, Marsha is continuing this from Marsha in Assignment 1
