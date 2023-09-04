package com.ifelse;
import java.util.Scanner;

public class Marks
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student name:");
		String name= sc.next();
		
		System.out.println("Enter sub1 mark:");
		int sub1= sc.nextInt();
		System.out.println("Enter sub2 mark:");
		int sub2= sc.nextInt();
		System.out.println("Enter sub3 mark:");
		int sub3= sc.nextInt();
		System.out.println("Enter sub4 mark:");
		int sub4= sc.nextInt();
		System.out.println("Enter sub5 mark:");
		int sub5= sc.nextInt();
		
		float total=(sub1+sub2+sub3+sub4+sub5);
		float percentage=(total/500)*100;
		
		if(percentage>40)
		{
			System.out.println( name + "has scored" +percentage+"% congrats!! Passed and promoted");
		}
		else
		{
			System.out.println(percentage+"You are failed!!Try hard next time");
		}
		
	}

}
