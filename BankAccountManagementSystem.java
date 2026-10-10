import java.util.Scanner;

public class BankAccountManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static String accountNumber, customerName;
    static double balance;

    static void entry() {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLine();

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    static void deposit() {
        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful!");
        } else {
            System.out.println("Amount must be greater than 0.");
        }
    }

    static void withdraw() {
        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0)
            System.out.println("Amount must be greater than 0.");
        else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        } else
            System.out.println("Insufficient Balance");
    }

    static void returnBalance() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
    }

    static void exit() {
        System.out.println("Thank you for using Bank Account System!");
    }

    public static void main(String[] args) {
        entry();
        int choice;

        do {
            System.out.println("\n1.Deposit  2.Withdraw  3.Balance  4.Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: deposit(); break;
                case 2: withdraw(); break;
                case 3: returnBalance(); break;
                case 4: exit(); break;
                default: System.out.println("Invalid Choice");
            }
        } while (choice != 4);

        sc.close();
    }
}