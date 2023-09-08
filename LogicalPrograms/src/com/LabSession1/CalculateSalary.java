package com.LabSession1;

class Employee 
{
	private int empID;
	private String empName;
	private String designation;
	double salary;     //we dont use private if use then set get method need to use
	
	Employee(int empId,String empName,String designation,double salary)
	{
		this.empID=empId;
		this.empName=empName;
		this.designation=designation;
		this.salary=salary;
	}
	
	public double getSalary()
	{
		return salary;
	}
	public String toString()
	{
		return empID+" "+empName+" "+designation+" "+salary;
	}
	
}

public class CalculateSalary	
{	
	public static void main(String[] args) 
	{
		Employee e1=new Employee(102,"Shivam","Developer",30000);
		
		System.out.println(e1);  //emp e2 data to show we need to write salary logic many time
								//to this we want to use array
		double salary=e1.getSalary();
		salary=salary+(salary*0.1);
		e1.salary=salary;
		
		System.out.println("Net Salary="+salary);
		
	}

}
