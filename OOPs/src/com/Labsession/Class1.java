package com.Labsession;


class Student
{
	private int id;
	private String name;
	private float marks;
	private String course;
	
	Student(int id,String name,float marks,String course)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.course=course;
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
	public String setName(String name)
	{
		return name;
	}
	
	public float getMarks()
	{
		return marks;
	}
	public void getMarks(float marks)
	{
		this.marks=marks;
	}
	
	public String getCourse()
	{
		return course;
	}
	public void setCourse(String course)
	{
		this.course=course;
	}
	public String toString()
	{
		return id+" "+name+" "+marks+" "+course;
	}
}

public class Class1 
{
	public static void main(String[] args) 
	{
		Student s1=new Student(11,"Akash",80,"Science");
		Student s2=new Student(12,"Amit",75,"Arts");
		Student s3=new Student(11,"Anil",80,"Commerce");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		

	}

}
