import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create University object
        University msu = new University("MSU", "Shah Alam, Selangor, Malaysia", 17000, 580, 
                                         "FISE, FBMP, FHLS, IMS, SHCA, SESS", 
                                         "BCS, BCF, BBC, BGD, BICT");

        // Create Lecturer object
        Lecturer drJamal = new Lecturer("Dr. Jamal", "L1023", "FISE (ISC)", 7500.00, 
                                         Arrays.asList("Computer Architecture", "Software Analysis and Modelling"), 12);

        // Create Course objects (Assigning Dr. Jamal)
        Course bcs = new Course("Bachelor in Computer Science", "BCS101", 3, drJamal);
        Course bcf = new Course("Bachelor in Computer Forensics", "BCF101", 3, drJamal);

        // Create Student objects
        Student student1 = new Student("Alice", "S001", 20, 3.8, bcs, 10, msu);
        Student student2 = new Student("Bob", "S002", 21, 3.5, bcf, 8, msu);

        // Enroll students in their courses
        bcs.enrollStudent(student1);
        bcf.enrollStudent(student2);

        // Display University Information
        System.out.println("\n--- University Information ---");
        msu.displayUniversityDetails();
        msu.displayTotalStudents();
        msu.listFaculties();

        // Display Lecturer Details
        System.out.println("\n--- Lecturer Information ---");
        drJamal.displayLecturerDetails();
        
        // Display Course Details
        System.out.println("\n--- Course Details ---");
        bcs.getCourseDetails();
        bcf.getCourseDetails();

        // Display Student Information
        System.out.println("\n--- Student Information ---");
        student1.displayStuInfo();
        student2.displayStuInfo();

        // Lecturer updates (add new course & increase salary)
        drJamal.addCourse("Artificial Intelligence");
        drJamal.increaseSalary(500);

        // Student updates (update GPA & record attendance)
        student1.updateGpa(3.9);
        student2.recordAttendance();

        // Remove a student from a course
        bcs.removeStudent(student1);

        // Display updated student list
        System.out.println("\n--- Updated Enrolled Students in " + bcs.getCourseName() + " ---");
        for (Student s : bcs.getEnrolledStudents()) {
            System.out.println("- " + s.getName());
        }
    }
}
