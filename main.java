import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create University
        University msu = new University();
        msu.displayUniversityDetails();
        msu.listFaculties();
        msu.listProgrammes();
        msu.displayTotalStudents();

        // Create Lecturer
        Lecturer drJamal = new Lecturer("Dr. Jamal", "L1023", 45, 7500.0, "FISE", 12);
        drJamal.addCourse("BCS101");
        drJamal.addCourse("BCF102");
        drJamal.increaseSalary(500);

        // Create Course and link lecturer
        Course bcs = new Course("Bachelor of Computer Science", "BCS101", 3, drJamal);
        Course bcf = new Course("Bachelor of Computer Forensics", "BCF102", 3, drJamal);

        // Create Student using polymorphism
        Person p1 = new Student("Ariana", "S001", 20, 3.75, bcs, 8, msu);
        Person p2 = new Student("Daniel", "S002", 21, 3.9, bcf, 10, msu);

        // Cast back to Student to call specific methods
        if (p1 instanceof Student) {
            Student s = (Student) p1;
            s.recordAttendance();
            s.updateGpa(3.8);
            bcs.enrollStudent(s);
        }

        if (p2 instanceof Student) {
            Student s = (Student) p2;
            s.recordAttendance();
            s.updateGpa(4.0);
            bcf.enrollStudent(s);
        }

        // Display all persons (demonstrate polymorphism)
        p1.displayInfo();
        p2.displayInfo();

        // Display course info
        bcs.getCourseDetails();
        bcf.getCourseDetails();

        // Display lecturer info
        drJamal.displayInfo();

        // --- Support Classes ---

        // Department
        Department dp = new Department("Information Sciences and Computing", "FISE", "Dr. Zahirah");
        dp.displayDepartmentInfo();
        Department.displayAvailableDepartments();

        // Club
        Club techClub = new Club("Tech Enthusiasts", "Academic", 25);
        techClub.showClubInfo();
        techClub.registerMember();

        // Library
        Library lib = new Library("Main Campus", 2000, true);
        lib.status();
        lib.borrowBook();
        lib.returnBook();

        // --- Loops & Conditionals Demo ---

        System.out.println("\n== Loop: Display Faculty Codes ==");
        for (String faculty : msu.getFaculties()) {
            System.out.println("Faculty: " + faculty);
        }

        System.out.println("\n== While Loop: Show attendance count ==>");
        int attendance = 5;
        while (attendance <= 7) {
            System.out.println("Attendance so far: " + attendance);
            attendance++;
        }

        System.out.println("\n== If Condition Check ==");
        if (drJamal.getExperience() > 10) {
            System.out.println("Dr. Jamal is a senior lecturer.");
        } else {
            System.out.println("Dr. Jamal is a junior lecturer.");
        }

        System.out.println("\n🎓 End of Student Management System Demo 🎓");
    }
}
