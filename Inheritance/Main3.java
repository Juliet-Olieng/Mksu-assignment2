// A university system manages employees using inheritance.
// 2. Creates a Lecturer object,
// 3. Displays all information using the overridden method.

// Create a superclass Employee with attributes name and salary, and a method
// displayInfo().

import java.util.Scanner;

class Employee{
    String name;
    double salary;

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
// Create a subclass Lecturer that adds an attribute department and overrides displayInfo()
// to include department information.
class Lecturer extends Employee{
    String department;
    
    @Override
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}
//  Write a Java program that:
public class Main3 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        // 1. Accept input from user
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();  // consume newline

        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        // 2. Create Lecturer object
        Lecturer lecturer = new Lecturer();
        lecturer.name = name;
        lecturer.salary = salary;
        lecturer.department = department;

        // 3. Display information using overridden method
        System.out.println("\n--- Lecturer Information ---");
        lecturer.displayInfo();

        scanner.close();   
    }

   
}
