package com.ifelse;
import java .util.Scanner;

public class StudentGrade
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks of student:");
		float marks =sc.nextFloat();
		
		if(marks>=90)
		{
			System.out.println("Student get 'A' Grade");
		}
		else if(marks>=75)
		{
			System.out.println("Student get 'B' Grade");
		} 
		else if (marks>=60)
		{
			System.out.println("Student get 'C' Grade");
		}
		else if(marks>=40)
		{
			System.out.println("Student get 'D' Grade");
		}
		else
		{
			System.out.println("Student is FAIL");
		}
	}
}
