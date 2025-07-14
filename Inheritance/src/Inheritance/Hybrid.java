package Inheritance;

class Person1{
	
	long phno;
    String name;
    
    public void PersonDetails()
    {
    	System.out.println(name+ " "+phno);
    }
}

class Employee1 extends Person1
{
	int empid;
	String position;
	float salary;
	
	public void EmployeeDetails()
	{
		System.out.println(empid+" "+position+" "+salary);
	}
}

class Manager extends Employee1
{
	String authority;
	
	public void managerauthority()
	{
		System.out.println(authority);
	}
}

class Client extends Person1 
{
	String bond;
	String projects;
	
	public void clientdetails()
	{
		System.out.println();
	}
}

public class Hybrid{

	public static void main(String[] args) {
		
		Manager m = new Manager();
		m.EmployeeDetails();
		m.managerauthority();
		
		Client c = new Client();
		c.PersonDetails();
		c.clientdetails();

		
	}

}