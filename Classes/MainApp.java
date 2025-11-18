import java.util.Scanner;
// You are tasked with designing a Java program that consists of three classes:
// 1. Student Class:
class Student{
// i. Contains attributes name (String) and marks (double).
    String name;
    double marks;
// ii. Has a constructor to initialize the attributes.
    Student(String name, double marks){
        this .name=name;
        this .marks=marks;
    }
// iii. Includes a method displayDetails() to print the student's details.
    void displayDetails(){
        System.out.println("Name" +name);
        System.out.println("marks: "+ marks);
    }
}
// 2. GradeCalculator Class:
class GradeCalculator{
    // • Contains a method calculateGrade(double marks) that returns the grade based on the following criteria:
// i. "A" for marks greater than or equal to 90.
// ii. "B" for marks greater than or equal to 75 but less than 90.
// iii. "C" for marks greater than or equal to 50 but less than 75.
// iv. "D" for marks less than 50.
    String calculateGrade(double marks){
            if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "D";
        }
    }   
    }
// 3. MainApp Class:
public class MainApp {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // i. Accept user input to create a Student object
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter student marks: ");
        double marks = scanner.nextDouble();
        
        // Create Student object
        Student student = new Student(name, marks);
        
        // Create GradeCalculator object
        GradeCalculator gradeCalculator = new GradeCalculator();
        
        // ii. Use GradeCalculator to compute grade
        String grade = gradeCalculator.calculateGrade(marks);
        // iii. Display student details along with calculated grade
        System.out.println("\n=== Student Report ===");
        student.displayDetails();
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
