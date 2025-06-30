package com.conditionalstatement;

public class Prime {
	public static void main (String [] args)
	{
		int a= 15;
	    boolean flag = false;

			    if (a == 0 || a == 1)
			    {
			        flag = true;
			    }

			    for (int i = 2; i <= a / 2; ++i) 
			    {
			    	if (a % i == 0) 
			    	{
			            flag = true;
			            break;
			    	}
			    }

			    if (!flag)
			    {
			      System.out.println(a + " is a prime number.");
			    }
			    else
			    {
			      System.out.println(a + " is not a prime number.");
			    }
	 }
}

