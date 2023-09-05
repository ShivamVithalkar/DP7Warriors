package com.classobject;

public class Student1
{
	int stuid;
	String Name;
	float Marks;
	
	void display()
	{
		System.out.println(stuid+ " "+Name+"  "+Marks);
	}
	public static void main(String[] args)
	{
		Student1 s1=new Student1();
		s1.stuid=10;
		s1.Name="Ram";
		s1.Marks=90f;
		
		Student1 s2=new Student1();
		s2.stuid=11;
		s2.Name="vinayak";
		s2.Marks=92f;
		
		s1.display();
		s2.display();
	}

}
