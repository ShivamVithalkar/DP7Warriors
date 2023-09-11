package com.staticDemo;

class Employee 
{
	private int id;
	private String name;
	private float salary;
	private static String compName;
	static int icount=0;
	
	Employee()
	{
		
	}
	static
	{
		compName="Think Quotient";
		
	}
	{
		icount++;
	}
	
	static void changeName(String cName)
	{
		compName=cName;
	}
	
	Employee(int id,String name,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	public float getSalary()
	{
		return salary;
	}
	
	public static void setCName(String cName)
	{
		Employee.compName=cName;
	}
	public static String getCompName()
	{
		return compName;
	}
	public String toString()
	{
		return "Empid:"+id+"\nEmp Name:"+name+"\nEmp Salary "+salary+"\ncompany name:"+compName;
	}
	
}
public class Company
{
	
	public static void main(String[] args)
	{	
		Employee e1=new Employee(11,"Abhi",25000);
		Employee e2=new Employee(12,"Akash",30000);
		Employee e3=new Employee(13,"Sumit",35000);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		System.out.println("-------------------------------");
		Employee.changeName("Think Big");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		System.out.println("Number of employee in company:"+Employee.icount);
		
	}

}
