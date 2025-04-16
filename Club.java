import java.util.ArrayList;
import java.util.List;

// This class represents a Club in the university system
public class Club {
    private String clubName;
    private String description;
    private List<String> members;

    // Constructor to initialize the club with its name, description, and an empty list of members
    public Club(String name, String description) {
        this.clubName = name;
        this.description = description;
        this.members = new ArrayList<>();
    }

    // Method to add a member to the club
    public void addMember(String memberName) {
        members.add(memberName);
    }

    // Method to display club details along with its members
    public void displayClubDetails() {
        System.out.println("\nClub Name: " + clubName);
        System.out.println("Description: " + description);
        System.out.println("Members:");
        if (members.isEmpty()) {
            System.out.println("- No members yet.");
        } else {
            for (String member : members) {
                System.out.println("- " + member);
            }
        }
    }
}

//Eainan is doing this in Assignment 2
