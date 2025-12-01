// A bank needs a program to manage different types of accounts.
// Create a superclass BankAccount with an attribute balance and a method deposit().
// Then create a subclass SavingsAccount that inherits from BankAccount and adds a
// method addInterest() that increases the balance by 5%.

import java.util.Scanner;

// Superclass
class BankAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
    }
}

// Subclass
class SavingsAccount extends BankAccount {
// 5% intrest
    void addInterest() {
        balance = balance + (balance * 0.05);
    }
}

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Create a SavingsAccount object
        SavingsAccount account = new SavingsAccount();

        // 2. Deposit an amount entered by the user
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);

        // 3. Apply interest
        account.addInterest();

        // 4. Display the final balance
        System.out.println("Final balance: " + account.balance);

        scanner.close();
    }
}

