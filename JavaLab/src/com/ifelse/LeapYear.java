package com.ifelse;
import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year :");
		int year= sc.nextInt();
		
		//year divisible by 4 but not divisible by 100
		//year should be divisible by 400
		
		if((year%4==0 && year%100!=0 ) || (year%400==0))   /*%400 is use to calculate century year
																											//%100 It is use to check year come in future like-2024,32,36...*/
		{
			System.out.println(year+ " is Leap year");
		}
		else      
		{
			System.out.println(year+ " is not Leap year");
		}
	}

}
