package com.switch1;
import java.util.Scanner;

public class NumberofDays 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the month name(lower case):");
		String mName=sc.next();
		
		switch(mName)
		{
		case "january":
		case "march":
		case "may":
		case "jully":
		case "august":
		case "octomber":
		case "december":  System.out.println("31 days");
										break;
		case "april":
		case "june":
		case "september":
		case "november": System.out.println("30 days");
		 								break;
		case "february" : System.out.println("Enter the year:");
		 							int year=sc.nextInt();
		 							if((year%4==0 || year%100!=0 ) && (year%400==0))
		 							{
		 								System.out.println("28 days");
		 							}
		 							else
		 							{
		 								System.out.println("Leap Year having 29 days");
		 							}
		 							break;
		 	default: System.out.println("Error in input");
		}
		sc.close();
	}

}
