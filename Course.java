
public class Course {
    private String code;
    private String name;

    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() { return code; }
    public String getName() { return name; }

    public String toString() {
        return code + " - " + name;
    }
}
//In Assignment 2, Marsha is continuing this from Eainan in Assignment 1
