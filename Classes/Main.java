// Question 1 (Concept: Constructors & Object Creation)
// a) A coffee shop wants a class to store information about a coffee order.Write a Java class called CoffeeOrder with:

// i. Two attributes: size (String) and price (double)
// ii. A constructor that sets both attributes

// b) In the main() method:
// i. Create two CoffeeOrder objects using the constructor
// ii. Display the details of each order
import java.util.Scanner;

class CoffeeOrder{
    String size;
    double price;
    
    CoffeeOrder(String size, double price){
        this.size=size;
        this.price=price;
    }
    void displayOrderDetails(){
        System.out.println("size:" + size);
        System.out.println("price :"+ price);
    }
}
// b) In the main() method:
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
 // i. Create two CoffeeOrder objects using the constructor
    CoffeeOrder order1 = new CoffeeOrder("Small", 3.50);
    CoffeeOrder order2 = new CoffeeOrder("Large", 5.75);
        
// ii. Display the details of each order
        System.out.println("Order 1 - Size: " + order1.size + ", Price: $" + order1.price);
        System.out.println("Order 2 - Size: " + order2.size + ", Price: $" + order2.price);
        }
       
    
}
