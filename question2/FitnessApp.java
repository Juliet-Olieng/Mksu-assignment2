// A fitness app tracks users’ progress. It needs a method to determine a user’s fitness levelbased on the number of steps taken daily.
// Task:
// Write a Java method named getFitnessLevel that takes an integer steps as input and returns:
// • "Excellent" if steps ≥ 10000
// • "Good" if steps ≥ 7000 and < 10000
// • "Average" if steps ≥ 4000 and < 7000
// • "Poor" otherwise

// Then, in the main method, prompt the user to enter their steps for the day and print the fitness level returned by the method.
import java.util.Scanner;

public class FitnessApp {

    // Method to determine fitness level based on steps
    public static String getFitnessLevel(int steps) {
        if (steps >= 10000) {
            return "Excellent";
        } else if (steps >= 7000) {
            return "Good";
        } else if (steps >= 4000) {
            return "Average";
        } else {
            return "Poor";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input the number steps
        System.out.print("Enter your steps for today: ");
        int steps = scanner.nextInt();

        // Get display fitness level
        String fitnessLevel = getFitnessLevel(steps);
        System.out.println("Your fitness level: " + fitnessLevel);

        scanner.close();
    }
}

