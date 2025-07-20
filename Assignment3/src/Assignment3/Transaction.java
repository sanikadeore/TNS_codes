package Assignment3;

public class Transaction {
	 private final double transactionFee = 5.0;

	    public final void performTransaction(Account acc, double amount, String type) {
	        System.out.println("Performing " + type + " of ₹" + amount);
	        if (type.equalsIgnoreCase("deposit")) {
	            acc.deposit(amount);
	        } else if (type.equalsIgnoreCase("withdraw")) {
	            acc.withdraw(amount + transactionFee);
	            System.out.println("₹" + transactionFee + " transaction fee applied.");
	        }
	        System.out.println("Current Balance: ₹" + acc.getBalance());
	    }

}
