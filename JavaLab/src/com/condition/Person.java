package com.condition;
import java.util.Scanner;

public class Person 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name:");
		String name=sc.next();
		
		System.out.println("Enter age:");
		int age=sc.nextInt();
		
		System.out.println("Enter Height:");
		double Height=sc.nextDouble();
		
		System.out.println("Enter gender:");
		char gender=sc.next().charAt(0);
		
		System.out.println("Name-"+name);
		System.out.println("Age"+age );
		System.out.println("Height"+Height);
		System.out.println("Gender is "+ gender );			

	}

}
