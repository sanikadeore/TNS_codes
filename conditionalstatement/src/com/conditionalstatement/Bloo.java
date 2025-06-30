package com.conditionalstatement;

public class Bloo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 19;
		int weight=34;
		
		if (age >= 18 && age <=60 )
		{
			if(weight >= 50 )
			{
				System.out.print("Eligible for Blood Donating");
			}
			else
			{
				System.out.print("Not Eligible for Blood Donating");
			}

		}
		else
		{
			System.out.print("Not Eligible for Blood Donating");
		}

	}

}
