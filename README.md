# Student Management System – OOP Assignment 2

## Project Overview
This project is a continuation of Assignment 1 by a group of four members. It demonstrates the use of Object-Oriented Programming (OOP) principles to build a Student Management System in Java.

The program features inheritance, polymorphism, encapsulation, method overriding, constructor overloading, and practical class interactions through a real-world university context.

## Group Members & Responsibilities

### Assignment 1
| Name     | Contribution                  |
|----------|-------------------------------|
| Eainan   | Main.java, Course.java        |
| Ui       | Student.java                  |
| Marsha   | University.java               |
| Mira     | Lecturer.java                 |

### Assignment 2
| Name     | Role Description                             |
|----------|----------------------------------------------|
| Ui       | Person 1: Person.java, Student.java          |
| Mira     | Person 2: Lecturer.java                      |
| Marsha   | Person 3: Course.java, University.java       |
| Eainan   | Person 4: Department.java, Club.java, Library.java, Main.java |

## Project Structure
StudentManagementSystem/
├── Main.java  
├── Person.java  
├── Student.java  
├── Lecturer.java  
├── Course.java  
├── University.java  
├── Department.java  
├── Club.java  
├── Library.java  
├── README.md  

## OOP Concepts Demonstrated

| Concept            | Where It's Used                           |
|--------------------|--------------------------------------------|
| Inheritance        | Student and Lecturer extend Person         |
| Polymorphism       | Person p = new Student();                  |
| Encapsulation      | All attributes are private with access via getters/setters |
| Method Overriding  | displayInfo() in Student and Lecturer      |
| Object Interaction | Student ↔ Course ↔ Lecturer ↔ University   |
| Extra Classes      | Club, Library, Department                  |
| Looping & Conditions | for, while, and if in Main.java           |

## System Features
- Student GPA tracking, attendance, and course/university enrollment
- Lecturer profile management with salary, experience, and courses taught
- Course creation, details, and student enrollment
- University with list of faculties and academic programmes
- Department listing with a static method for common departments
- Club management with member registration
- Library system with book borrowing and return functionality

## How to Run the Program

1. Open your terminal or IDE terminal in the project folder.
2. Compile all Java files using:
   javac *.java
3. Run the compiled Main class:
   java Main

## Sample Output Recommendations
For documentation purposes, include screenshots of:
- Student and lecturer information being displayed
- GPA and attendance updates
- Course and university details
- Department, club, and library functionality
- Demonstrations of loops and conditional logic

## Submission Instructions
- Zip the full project folder containing all .java files and README
- Include a report (PDF) with explanation and screenshots
- Submit the ZIP file and the report to eKLAS before 18 April 2025

## Authors
- Eainan  
- Ui  
- Marsha  
- Mira  

Faculty of Information Sciences & Engineering  
MSU
