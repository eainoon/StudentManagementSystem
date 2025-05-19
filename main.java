// This is the main class where the program starts
public class main {

    public static void main(String[] args) {
        // Creating a University object with basic details
        University msu = new University("MSU", "Shah Alam", "Selangor", 17000);

        // Adding faculties to the university
        msu.addFaculty("FISE");
        msu.addFaculty("FBMP");
        msu.addFaculty("FHLS");
        msu.addFaculty("IMS");
        msu.addFaculty("SHCA");
        msu.addFaculty("SESS");

        // Adding courses to the university
        msu.addCourse("Bachelor in Computer Science (BCS)");
        msu.addCourse("Bachelor in Computer Forensics (BCF)");
        msu.addCourse("Bachelor in Business Computing (BBC)");
        msu.addCourse("Bachelor in Graphic Design (BGD)");
        msu.addCourse("Bachelor in Computing Technology (BICT)");

        // Creating a Department and adding it to the university
        Department itDept = new Department("Information Sciences and Computing");
        msu.addDepartment(itDept);

        // Creating and adding a library to the university
        Library lib = new Library("MSU Central Library", "9AM - 6PM");
        msu.setLibrary(lib);

        // Creating clubs and adding them to the university
        Club techClub = new Club("Cyber Synergy Club", "Tech-related events & SDG activities");
        Club choirClub = new Club("Melodia Choir Club", "Singing and performing arts");
        msu.addClub(techClub);
        msu.addClub(choirClub);

        // Creating a lecturer and adding to the department
        Lecturer drJamal = new Lecturer("L1023", "Dr. Jamal", 12);
        itDept.addLecturer(drJamal);

        // Creating a student and assigning them to a course
        Student student1 = new Student("S1234", "Aina", "Bachelor in Computer Science (BCS)");
        msu.addStudent(student1);

        // Enrolling the student into the Cyber Synergy Club
        techClub.addMember(student1.getName());

        // Displaying university overview
        msu.displayUniversityDetails();

        // Displaying list of faculties
        msu.displayFaculties();

        // Displaying courses offered
        msu.displayCourses();

        // Displaying department and lecturers
        itDept.displayDepartmentDetails();

        // Displaying library info
        lib.displayLibraryInfo();

        // Displaying all club details and their members
        techClub.displayClubDetails();
        choirClub.displayClubDetails();

        // Showing student info
        student1.displayStudentInfo();
    }
}
//In Assignment 2, Eainan is continuing this from Eainan in Assignment 1
