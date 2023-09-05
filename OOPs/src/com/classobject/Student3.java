package com.classobject;
import java.util.Scanner;

public class Student3
{
	int stuid;
	String name;
	float mark1;
	float mark2;
	float mark3;
	float per;
	char grade;
	
	void grade()
	{
		if(per>=90)
			grade='A';
		else if(per>=80)
			grade='B';
		else if(per>=70)
			grade='C';
		else if(per>=50)
			grade='D';
		else
			grade='F';		
	}
	
	void percentage()
	{
		per=((mark1+mark2+mark3)/300)*100;
	}
	
	void display()
	{
		System.out.println("ID:"+stuid+ " "+"Name:"+name+"  "+"per:"+per+"%"+" "+"grade: "+grade);
		if(grade=='F')
		 System.out.println("You are failed .....Try hard next time");
		else
		 System.out.println("Congrats!!! You are Passed with grade "+grade);
	}
	
	public static void main(String[] args)
	{
		Student3 s1=new Student3();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter student name:");
		s1.name=sc.next();
		
		System.out.println("Enter stuID :");
		s1.stuid=sc.nextInt();
		
		System.out.println("Enter mark1:");
		s1.mark1=sc.nextFloat();
		
		System.out.println("Enter mark2:");
		s1.mark2=sc.nextFloat();
		
		System.out.println("Enter mark3:");
		s1.mark3=sc.nextFloat();
		
		s1.percentage();
		s1.grade();
		System.out.println();
		
		
		s1.display();
		
		
	}

}
