public class University {  
    private String name;
    private String location;
    private int totalStudents;
    private int ranking;
    private String faculties;
    private String programmes;

    // Default Constructor
    public University() {
        this.name = "MSU";
        this.location = "Shah Alam, Selangor, Malaysia";
        this.totalStudents = 17000;
        this.ranking = 580;
        this.faculties = "FISE, FBMP, FHLS, IMS, SHCA, SESS";
        this.programmes = "BCS, BCF, BBC, BGD, BICT";
    }

    // Parameterized Constructor
    public University(String name, String location, int totalStudents, int ranking, String faculties, String programmes) {
        this.name = name;
        this.location = location;
        this.totalStudents = totalStudents;
        this.ranking = ranking;
        this.faculties = faculties;
        this.programmes = programmes;
    }

    // Getter Methods
    public String getName() { return name; }
    public String getLocation() { return location; }
    public int getTotalStudents() { return totalStudents; }
    public int getRanking() { return ranking; }
    public String getFaculties() { return faculties; }
    public String getProgrammes() { return programmes; }

    // Setter Methods
    public void setName(String name) { this.name = name; }
    public void setLocation(String location) { this.location = location; }
    public void setTotalStudents(int totalStudents) { this.totalStudents = totalStudents; }
    public void setRanking(int ranking) { this.ranking = ranking; }
    public void setFaculties(String faculties) { this.faculties = faculties; }
    public void setProgrammes(String programmes) { this.programmes = programmes; }

    // Method 1 - Display total students
    public void displayTotalStudents() {
        System.out.println("The total number of students in the university is " + totalStudents);
    }

    // Method 2 - List faculties
    public void listFaculties() {
        System.out.println("The available faculties in the university are: " + faculties);
    }

    // Method 3 - Display university name and location
    public void displayUniversityDetails() {
        System.out.println("== University Details ==");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Ranking: " + ranking);
    }
}
