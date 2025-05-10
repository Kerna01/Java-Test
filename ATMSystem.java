
import java.util.Scanner;

public class ATMSystem {
    static double balance = 10000.00;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> checkBalance();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> System.out.println("Thank you for using the ATM. Goodbye!");
                default -> System.out.println("Invalid option. Try again.");
            }
        } while (choice != 4);
    }

    static void checkBalance() {
        System.out.println("Your current balance is: ₦" + balance);
    }

    static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited successfully. New balance: ₦" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: ₦" + balance);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }
}
