package com.atm;

import java.util.Scanner;

public class ATM {
	
	double balance = 10000;
	double amount;
	
	Scanner sc = new Scanner(System.in);
	
	void ShowMenu()
	{
		System.out.println("***********ATM SYSTEM**********");
		System.out.println("1.Check balance");
		System.out.println("2.Withdraw ");
		System.out.println("3.Deposit ");
		System.out.println("4.Exit");
	}
	void CheckBalance()
	{
		System.out.println("Your Current Balance is Rs : "+balance);
	}
	void Withdraw()
	{
		System.out.println("Enter Amount to withdraw : ");
		amount=sc.nextDouble();
		
		if (amount > balance)
		{
			System.out.println("Insufficient Balance");
		}
		else if (amount == 0)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			balance -= amount;
			System.out.println("Successfully withdraw amount of Rs : "+amount);
		}
	}
	void Deposit()
	{
		System.out.println("Enter Amount to Deposit: ");
		amount=sc.nextDouble();
		
		if (amount == 0)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			balance += amount;
			System.out.println("Succesfully deposite amount of Rs "+ amount);
		}
	}
	
	public static void main(String[] args) 
	{
		ATM a = new ATM();
		int choice;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to ATM System...");
		
		do
		{
			a.ShowMenu();
			System.out.println("Choose an option");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				a.CheckBalance();
				break;
				
			case 2:
				a.Withdraw();
				break;
				
			case 3:
				a.Deposit();
				break;
				
			case 4:
				System.out.println("Thank you for using ATM System");
				break;
				
			default:
				System.out.println("Invalid Option");
				break;
			}
		}
		while (choice != 0);
	}

}