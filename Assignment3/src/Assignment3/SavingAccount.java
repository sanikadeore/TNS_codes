package Assignment3;

public class SavingAccount extends Account {
	public SavingAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " into Savings Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
