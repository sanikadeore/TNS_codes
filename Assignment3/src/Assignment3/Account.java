package Assignment3;
import java.util.*;

abstract class Account {
	protected String accountHolder;
    protected double balance;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        Bank.incrementTotalAccounts();
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

}
