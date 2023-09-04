package com.loops;
import java.util.Scanner;

public class ChoiseCourse {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your stream:");
		String stream =sc.next();
		
		System.out.println("Enter the percentage:");
		int percentage=sc.nextInt();
		
		if(percentage>=75)
		{
		switch(stream)
		{
			case "MBA" : System.out.println("You get admission to MBA");
			break;
			
			case "MCA" : System.out.println("You get admission to MCA");
			break;
			default:
				System.out.println("Better luck next time");
			
			if(percentage>=70)
			{
				switch(percentage)
				{
				case 75 :System.out.println("Congrats You get admission to MBA");
				break;
				
				case 70 :System.out.println("Congrats You get admission to MCA");
				break;
			
				
				}
			}	

		}
	}
	}
}

