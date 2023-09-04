package com.switch1;
import java.util.Scanner;
public class WeekDay
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter weekday number:");
		int weekday=sc.nextInt();
		
		switch(weekday)
		{
		case 1:System.out.println("Monday");
				break;
		case 2:System.out.println("Tuesday");
				break;
		case 3:System.out.println("Wednesday");
				break;
		case 4:System.out.println("Thursday");
				break;
				/* default :System.out.println("Error in input");
				 break;            (We can write this any where in switch case) */				  
		case 5:System.out.println("Friday");
				break;
		case 6:System.out.println("Saturday");
		 		break;
		case 7:System.out.println("Sunday");
		 		break;
		 default :System.out.println("Error in input");
		}
		System.out.println("Enjoy the day....");
	}

}
