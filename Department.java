
import java.util.*;

public class Department {
    private String name;
    private List<Lecturer> lecturers;

    public Department(String name) {
        this.name = name;
        this.lecturers = new ArrayList<>();
    }

    public String getName() { return name; }
    public void addLecturer(Lecturer lecturer) {
        lecturers.add(lecturer);
    }

    public List<Lecturer> getLecturers() { return lecturers; }
}


//Eainan is doing this in Assignment 2
