import java.util.Scanner;
// a) An online store needs a program to calculate discounts for products.
// Write a Java program with a class Product that includes: 
class Product{
// i. Private attributes: name (String), price (double)
    private String name;
    private double price;
// ii. A constructor to set both attributes
   public Product(String name, double price){
        this.name=name;
        this.price=price;
    }
// iii. A method applyDiscount(double percentage) that reduces the price by the given percentage
    void applyDiscount(double percentage){
      price -= price*percentage/100;  
    }
// iv. A method getPrice() that returns the updated price
    double getPrice() {
        return price;
    }
// b) In the main() method:
}
public class Main2 {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
// i. Create a Product object.
    Product product=new Product("Laptop",45000.0 );
// ii. Ask the user to enter a discount percentage.
    System.err.println("Enter discount Percentage:");
// iii. Apply the discount using the method.
    double discount=scanner.nextDouble();
    System.out.println("Original Price: $" + product.getPrice());
    product.applyDiscount(discount);
// iv. Display the new price of the product.
    System.out.println("New Price: $" + product.getPrice());

    scanner.close();  }  
}
