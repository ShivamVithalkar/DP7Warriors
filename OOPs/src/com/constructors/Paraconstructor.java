package com.constructors;

class Student {
	
	private int id;
	private String name;
	private int age;
	
/*	Student (int sid,String sname,int sage)
	{
		id=sid;
		name=sname;
		age=sage;
	}
	*/
	//default constructor
	Student()
	{
		
	}
	
	//parametrized constructor
	Student(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public String toString()
	{
		return id+" "+name+" "+age;
	}
}	
		//paramconstrucotrs()
public class Paraconstructor
{
	public static void main(String args[])
	{
		Student s1=new Student(101,"Akash",24);
		Student s2=new Student(102,"Vaibhav",25);
		Student s3=new Student(103,"Amit",26);
		
		Student s4=new Student();
		s4.setId(104);
		s4.setName("Shivam");
		s4.setAge(27);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}
}

