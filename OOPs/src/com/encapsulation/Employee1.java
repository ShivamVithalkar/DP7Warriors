package com.encapsulation;

public class Employee1 {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		
		e1.setempId(111);
		e1.setempName("Ram");
		e1.setempDepartment("Developer");
		e1.setempSalary(45000);
		
		System.out.println(e1.getempId()+" "+e1.getempName()+ " " +e1.getempDepartment()+ " " +e1.getempSalary()+ " ");
		
		//e1.display();
		
		System.out.println(e1);

	}

}
