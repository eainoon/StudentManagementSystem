public class Lecturer {
    private String id;
    private String name;
    private int experience; // in years

    // Constructor to initialize a lecturer with id, name, and years of experience
    public Lecturer(String id, String name, int experience) {
        this.id = id;
        this.name = name;
        this.experience = experience;
    }

    // Getter method for lecturer's ID
    public String getId() {
        return id;
    }

    // Getter method for lecturer's name
    public String getName() {
        return name;
    }

    // Getter method for years of experience
    public int getExperience() {
        return experience;
    }

    // Method to display lecturer's details
    public void displayLecturerInfo() {
        System.out.println("\nLecturer ID: " + id);
        System.out.println("Lecturer Name: " + name);
        System.out.println("Years of Experience: " + experience);
    }
}

//In Assignment 2, Mira is continuing this from Mira in Assignment 1
