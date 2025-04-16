// This class represents a Library in the university system
public class Library {
    private String name;
    private String openingHours;

    // Constructor to initialize the Library's name and opening hours
    public Library(String name, String openingHours) {
        this.name = name;
        this.openingHours = openingHours;
    }

    // Getter for Library's name
    public String getName() {
        return name;
    }

    // Getter for Library's opening hours
    public String getOpeningHours() {
        return openingHours;
    }

    // Method to display the Library's information
    public void displayLibraryInfo() {
        System.out.println("\nLibrary Info:");
        System.out.println("Name: " + name);
        System.out.println("Opening Hours: " + openingHours);
    }
}

//Eainan is doing this in Assignment 2
