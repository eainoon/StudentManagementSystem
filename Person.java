// This class represents a Person in the university system (base class for Student and Lecturer)
public class Person {
    private String id;
    private String name;

    // Constructor to initialize the Person's id and name
    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for ID
    public String getId() {
        return id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Method to display person's information
    public void displayPersonInfo() {
        System.out.println("\nPerson Info:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

//Ui is doing this in Assignment 2
