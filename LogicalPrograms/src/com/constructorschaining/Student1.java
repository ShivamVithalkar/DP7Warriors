package com.constructorschaining;

public class Student1 
{
	int id;
	String name;
	
	Student1()   //constructor calling another consturctor
	{
		this(11,"shivam");
		System.out.println("Default constructor");
	}
		
	Student1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	void display()	
	{				
		this.show();
		System.out.println("Student id:"+id);
		System.out.println("Student name:"+name);
	
	}
	void show()
	{
		System.out.println("Student info is:");
		
	}
	
	public static void main (String args[])
	{
		Student1 s1=new Student1();
		s1.display();	
	}
}
