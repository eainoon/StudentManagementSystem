import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class University {  
    private String name;
    private String location;
    private int totalStudents;
    private int ranking;
    private List<String> faculties;
    private List<String> programmes;

    // Default Constructor
    public University() {
        this.name = "MSU";
        this.location = "Shah Alam, Selangor, Malaysia";
        this.totalStudents = 17000;
        this.ranking = 580;
        this.faculties = new ArrayList<>(Arrays.asList("FISE", "FBMP", "FHLS", "IMS", "SHCA", "SESS"));
        this.programmes = new ArrayList<>(Arrays.asList("BCS", "BCF", "BBC", "BGD", "BICT"));
    }

    // Parameterized Constructor
    public University(String name, String location, int totalStudents, int ranking, List<String> faculties, List<String> programmes) {
        this.name = name;
        this.location = location;
        this.totalStudents = totalStudents;
        this.ranking = ranking;
        this.faculties = faculties;
        this.programmes = programmes;
    }

    // Getters
    public String getName() { return name; }
    public String getLocation() { return location; }
    public int getTotalStudents() { return totalStudents; }
    public int getRanking() { return ranking; }
    public List<String> getFaculties() { return faculties; }
    public List<String> getProgrammes() { return programmes; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setLocation(String location) { this.location = location; }
    public void setTotalStudents(int totalStudents) { this.totalStudents = totalStudents; }
    public void setRanking(int ranking) { this.ranking = ranking; }
    public void setFaculties(List<String> faculties) { this.faculties = faculties; }
    public void setProgrammes(List<String> programmes) { this.programmes = programmes; }

    // Method 1 - Display total students
    public void displayTotalStudents() {
        System.out.println("The total number of students in the university is " + totalStudents);
    }

    // Method 2 - List faculties
    public void listFaculties() {
        System.out.println("The available faculties in the university are: " + String.join(", ", faculties));
    }

    // Method 3 - List programmes
    public void listProgrammes() {
        System.out.println("The programmes offered here are: " + String.join(", ", programmes));
    }

    // Method 4 - Display university name and location
    public void displayUniversityDetails() {
        System.out.println("== University Details ==");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Ranking: " + ranking);
    }
}
//In Assignment 2, Marsha is continuing this from Marsha in Assignment 1
