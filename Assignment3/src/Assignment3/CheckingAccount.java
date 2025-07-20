package Assignment3;

public class CheckingAccount extends Account {
	public CheckingAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " into Checking Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from Checking Account.");
        } else {
            System.out.println("Insufficient balance in Checking Account.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
