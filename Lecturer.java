// This class represents a Lecturer in the university system
public class Lecturer extends Person {
    private String lecturerID;
    private int experienceYears;

    // Constructor to initialize the Lecturer with ID, name, and years of experience
    public Lecturer(String id, String name, int experience) {
        super(name);  // Call the superclass constructor (Person) to set the name
        this.lecturerID = id;
        this.experienceYears = experience;
    }

    // Getter for Lecturer ID
    public String getLecturerID() {
        return lecturerID;
    }

    // Getter for Lecturer's years of experience
    public int getExperienceYears() {
        return experienceYears;
    }

    // Method to display Lecturer's information
    public void displayLecturerInfo() {
        System.out.println("\nLecturer Info:");
        System.out.println("Name: " + getName());
        System.out.println("Lecturer ID: " + lecturerID);
        System.out.println("Years of Experience: " + experienceYears);
    }
}

//In Assignment 2, Mira is continuing this from Mira in Assignment 1
