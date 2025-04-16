public class Club {
    private String clubName;
    private String category; // academic, sports, culture
    private int totalMembers;

    // Constructor
    public Club(String clubName, String category, int totalMembers) {
        this.clubName = clubName;
        this.category = category;
        this.totalMembers = totalMembers;
    }

    // Register a new member
    public void registerMember() {
        totalMembers++;
        System.out.println(clubName + ": 1 new member registered. Total members: " + totalMembers);
    }

    // Display club info
    public void showClubInfo() {
        System.out.println("Club Info:");
        System.out.println("Name: " + clubName);
        System.out.println("Category: " + category);
        System.out.println("Total Members: " + totalMembers);
    }
}
//Eainan is doing this in Assignment 2
