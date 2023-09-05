package com.encapsulation;

public class Employee 
{
	//instance variable
	
	private int empId;
	private String empName;
	private String empDepartment;
	private float empSalary;
	
	//getters and setters 
	
	public void setempId(int empId)
	{
		this.empId=empId;
	}
	public int getempId()
	{
		return empId;
	} 
	
	public void setempName(String empName)
	{
		this.empName=empName;
	}
	public String getempName()
	{
		return empName;
	}
	
	public void setempDepartment(String empDept)
	{
		this.empDepartment=empDepartment;
	}
	public String getempDepartment()
	{
		return empDepartment;
	}
	
	public void setempSalary(float empSalary)
	{
		this.empSalary=empSalary;
	}
	public float getempSalary()
	{
		return empSalary;
	}
	
	public String toString()
	{
		return "EmpId:"+empId+ "EmpName :"+empName+"EmpDept :"+empDepartment+"EmpSalary :"+empSalary;
	}
}
