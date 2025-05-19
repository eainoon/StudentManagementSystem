import java.util.*;

public class Club {
    private String name;
    private List<String> members;

    public Club(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public String getName() { return name; }
    public List<String> getMembers() { return members; }

    public void addMember(String studentName) {
        members.add(studentName);
    }
}
//Eainan is doing this in Assignment 2
