package com.classobject;

public class Student2
{
	int stuid;
	String Name;
	float Mark1;
	float Mark2;
	float Mark3;
	float per;
	
	void calpercentage()
	{
		per=((Mark1+Mark2+Mark3)/300)*100;
	}
	
	void display()
	{
		System.out.println(stuid+ " "+Name+"  "+per+"%");
	}
	
	public static void main(String[] args)
	{
		Student2 s1=new Student2();
		s1.stuid=10;
		s1.Name="Ram";
		s1.Mark1=90f;
		s1.Mark2=75f;
		s1.Mark3=85f;
		
		Student2 s2=new Student2();
		s2.stuid=11;
		s2.Name="vinayak";
		s2.Mark1=90f;
		s2.Mark2=70f;
		s2.Mark3=80f;
		
		s1.calpercentage();
		s2.calpercentage();
		s1.display();
		s2.display();
		
	}

}
