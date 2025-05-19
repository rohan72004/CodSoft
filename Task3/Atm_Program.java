package Rohan;
import java.util.Scanner;
import java.util.*;
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance can't be negative. Setting to 0.");
            this.balance = 0;
        }
    }
    public double getBalance() {
        return balance;
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }
}
class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }
    public void start() {
        int choice;
        do {
            showMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            handleChoice(choice);
        } while (choice != 4);
    }
    private void showMenu() {
        System.out.println("\n=== ATM MENU ===");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
    }
    private void handleChoice(int choice) {
        switch (choice) {
            case 1:
                checkBalance();
                break;
            case 2:
                deposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                System.out.println("Thank you for using the ATM!");
                break;
            default:
                System.out.println("Invalid choice. Please select again.");
        }
    }
    private void checkBalance() {
        System.out.printf("Your current balance is: Rs %.2f%n", account.getBalance());
    }
    private void deposit() {
        System.out.print("Enter amount to deposit: Rs ");
        double amount = scanner.nextDouble();
        if (account.deposit(amount)) {
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }
    private void withdraw() {
        System.out.print("Enter amount to withdraw: Rs ");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}
public class Atm_Program {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(0.0);
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
