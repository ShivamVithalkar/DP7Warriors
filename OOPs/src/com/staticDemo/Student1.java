package com.staticDemo;

public class Student1 
{ 

	private int id;
	String name;
	float marks;
	static String scName; //first loaded
	
	Student1()
	{
		scName="st joseph";
	}
	Student1(int id,String name,float marks)
	{
		this();
		this.id=id;
		this.name=name;
		this.marks=marks;
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
	
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	public float getMarks()
	{
		return marks;
	}
	
	public void setScName(String scName)
	{
		this.scName=scName;
	}
	public String getScName()
	{
		return scName;
	}
	
	public String toString() 
	{
		return id+" "+name+" "+marks;
	}
	public static void main(String[] args)
	{
		Student1 s1=new Student1();
		System.out.println(s1.scName);
		
		Student1 s2=new Student1();
		System.out.println(s2.scName);
	}
}
