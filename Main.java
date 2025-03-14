// Interface Showable
interface Showable {
    void show();
}

// Class Person
class Person {
    String name;
    String gender;
    String phoneNo;

    // Constructor
    Person(String name, String gender, String phoneNo) {
        this.name = name;
        this.gender = gender;
        this.phoneNo = phoneNo;
    }
}

// Class Student that extends Person
class Student extends Person {
    String course;
    double score;

    // Constructor
    Student(String name, String gender, String phoneNo, String course, double score) {
        super(name, gender, phoneNo);
        this.course = course;
        this.score = score;
    }
}

// Class PGStudent that extends Student
class PGStudent extends Student {
    String researchArea;
    String guide;

    // Constructor
    PGStudent(String name, String gender, String phoneNo, String course, double score, String researchArea, String guide) {
        super(name, gender, phoneNo, course, score);
        this.researchArea = researchArea;
        this.guide = guide;
    }

    // Overriding the show() method from Showable interface
    @Override
    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phoneNo);
        System.out.println("Course: " + course);
        System.out.println("Score: " + score);
        System.out.println("Research Area: " + researchArea);
        System.out.println("Guide: " + guide);
        System.out.println("-------------------------------");
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create N PGStudents
        List<PGStudent> pgStudents = new ArrayList<>();
        
        pgStudents.add(new PGStudent("John", "Male", "1234567890", "Computer Science", 89.5, "AI", "Dr. Smith"));
        pgStudents.add(new PGStudent("Alice", "Female", "0987654321", "Mathematics", 95.0, "Topology", "Dr. Johnson"));
        pgStudents.add(new PGStudent("Bob", "Male", "1122334455", "Physics", 92.3, "Quantum Mechanics", "Dr. Williams"));

        // Rank based on score (descending order)
        pgStudents.sort((pg1, pg2) -> Double.compare(pg2.score, pg1.score));

        // Sort based on researchArea (alphabetically)
        pgStudents.sort((pg1, pg2) -> pg1.researchArea.compareTo(pg2.researchArea));

        // Display student details using show()
        for (PGStudent student : pgStudents) {
            student.show();
        }
    }
}
