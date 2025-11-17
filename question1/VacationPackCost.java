// A travel agency wants a Java program that calculates the total price of a vacation package.The package includes the cost of accommodation, meals, and activities.
// Task:
// Write a Java method named calculateTotalCost that takes three parameters:
// • double accommodationCost,
// • double mealCost, and
// • double activityCost,
// and returns the total cost.
// In the main method, call this method with sample data and display the result.

public class VacationPackCost {
      public static double calculateTotalCost(double accommodationCost, double mealCost, double activityCost) {
        double vacationCost=accommodationCost + mealCost + activityCost;
        return vacationCost;
    }

    public static void main(String[] args) {
        // Sample data
        double accommodation = 900.50;
        double meals = 350.25;
        double activities = 200.00;

        // Calling the method
        double totalCost = calculateTotalCost(accommodation, meals, activities);

        // Displaying the result
        System.out.println("Total Vacation Cost: $" + totalCost);
    }
    
}
