// A car rental company wants to keep track of different types of vehicles.
// Create a parent class Vehicle with attributes brand and year.
// Then create a child class Car that inherits from Vehicle and adds an attribute seats.
// Write a Java program that:
// 2. Assigns values to all attributes,
// 3. Prints all the details.
class Vehicle {
    String brand;
    int year;
}
class Car extends Vehicle{
    int seats;
}
public class Main{
    public static void main(String[] args) {
        // 1. Creates a Car object,
        Car myCar=new Car();
        // 2. Assign values to all attributes
        myCar.brand = "Toyota Tx";
        myCar.year = 2020;
        myCar.seats = 5;

        // 3. Print all the details
        System.out.println("Car Details:");
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Year: " + myCar.year);
        System.out.println("Seats: " + myCar.seats);
    }
    
}
