public class Department {
    private String name;
    private String faculty;
    private String head;

    // Constructor
    public Department(String name, String faculty, String head) {
        this.name = name;
        this.faculty = faculty;
        this.head = head;
    }

    // Getters
    public String getName() { return name; }
    public String getFaculty() { return faculty; }
    public String getHead() { return head; }

    // Display individual department info
    public void displayDepartmentInfo() {
        System.out.println("\nDepartment Info:");
        System.out.println("Name: " + name);
        System.out.println("Faculty: " + faculty);
        System.out.println("Head of Department: " + head);
    }

    // Static method to display default available departments
    public static void displayAvailableDepartments() {
        System.out.println("\nAvailable Departments:");
        System.out.println("1. Engineering and Technology (ENT)");
        System.out.println("2. Information Sciences and Computing (ISC)");
        System.out.println("3. Media Sciences and Graphics (MSG)");
    }
}
