package com.LabSession1;



public class Student 
{
	int id;
	String name;
	int marks;
	
	Student(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	void display()	//we call show method in display using this
	{				//use of this keyword
		this.show();
		System.out.println("Student id:"+id);
		System.out.println("Student name:"+name);
		System.out.println("Student marks:"+marks);
	}
	void show()
	{
		System.out.println("Student info is:");
		
	}
	
	public static void main (String args[])
	{
		Student s1=new Student(11,"Akshay",80);
		Student s2=new Student(14,"Abhi",78);
		
		s1.display();
		System.out.println("-------------------");
		s2.display();
	}
}
