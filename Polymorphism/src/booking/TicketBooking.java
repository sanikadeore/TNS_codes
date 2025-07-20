package booking;

import java.util.Scanner;

class TicketBooking {
    
    private String customerName;
    private String event;
    private int numberOfTickets;
    private double ticketPrice;

    public TicketBooking(String customerName, String event, int numberOfTickets, double ticketPrice) {
        this.customerName = customerName;
        this.event = event;
        this.numberOfTickets = numberOfTickets;
        this.ticketPrice = ticketPrice;
    }

    private double calculateAmount() {
        return numberOfTickets * ticketPrice;
    }
    
    public void makePayment(double cashPaid) {
        double amount = calculateAmount();
        System.out.println("\n--- Cash Payment Receipt ---");
        System.out.println("Customer: " + customerName);
        System.out.println("Event: " + event);
        System.out.println("Tickets: " + numberOfTickets);
        System.out.println("Total Amount: ₹" + amount);
        System.out.println("Cash Paid: ₹" + cashPaid);
        System.out.println("Balance: ₹" + (cashPaid - amount));
    }

    public void makePayment(String walletName, String walletNumber) {
        double amount = calculateAmount();
        System.out.println("\n--- Wallet Payment Receipt ---");
        System.out.println("Customer: " + customerName);
        System.out.println("Event: " + event);
        System.out.println("Wallet: " + walletName);
        System.out.println("Wallet Number: " + walletNumber);
        System.out.println("Total Amount Debited: ₹" + amount);
    }

    public void makePayment(String cardHolderName, long cardNumber, String expiryDate) {
        double amount = calculateAmount();
        System.out.println("\n--- Credit Card Payment Receipt ---");
        System.out.println("Customer: " + customerName);
        System.out.println("Event: " + event);
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Number: **** **** **** " + (cardNumber % 10000));
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Total Amount Charged: ₹" + amount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Event Name: ");
        String event = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();

        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        TicketBooking booking = new TicketBooking(name, event, tickets, price);

        System.out.println("\nSelect Payment Method:");
        System.out.println("1. Cash");
        System.out.println("2. Online Wallet");
        System.out.println("3. Credit Card");
        System.out.print("Choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // clear buffer

        switch (choice) {
            case 1:
                System.out.print("Enter cash amount paid: ₹");
                double cash = sc.nextDouble();
                booking.makePayment(cash);
                break;

            case 2:
                System.out.print("Enter Wallet Name: ");
                String wallet = sc.nextLine();
                System.out.print("Enter Wallet Number: ");
                String walletNumber = sc.nextLine();
                booking.makePayment(wallet, walletNumber);
                break;

            case 3:
                System.out.print("Enter Card Holder Name: ");
                String holder = sc.nextLine();
                System.out.print("Enter Card Number: ");
                long cardNum = sc.nextLong();
                sc.nextLine(); // clear buffer
                System.out.print("Enter Expiry Date (MM/YY): ");
                String expiry = sc.nextLine();
                booking.makePayment(holder, cardNum, expiry);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
