package Assignment3;
import java.util.*;
public class BankingSystem {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = null;

        System.out.println("Enter account holder name:");
        String name = sc.nextLine();

        System.out.println("Enter initial balance:");
        double balance = sc.nextDouble();

        System.out.println("Choose account type (1 - Savings, 2 - Checking):");
        int choice = sc.nextInt();

        if (choice == 1) {
            account = new SavingAccount(name, balance);
        } else if (choice == 2) {
            account = new CheckingAccount(name, balance);
        } else {
            System.out.println("Invalid account type.");
            System.exit(0);
        }

        Transaction tx = new Transaction();

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int op = sc.nextInt();

            if (op == 1) {
                System.out.print("Enter amount to deposit: ");
                double amt = sc.nextDouble();
                tx.performTransaction(account, amt, "deposit");
            } else if (op == 2) {
                System.out.print("Enter amount to withdraw: ");
                double amt = sc.nextDouble();
                tx.performTransaction(account, amt, "withdraw");
            } else if (op == 3) {
                System.out.println("Balance: ₹" + account.getBalance());
            } else if (op == 4) {
                break;
            } else {
                System.out.println("Invalid option!");
            }
        }

        System.out.println("\nTotal accounts created: " + Bank.getTotalAccounts());
        sc.close();
    }
}
