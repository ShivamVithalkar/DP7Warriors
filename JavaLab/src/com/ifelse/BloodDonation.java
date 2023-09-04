package com.ifelse;
import java.util.Scanner;

public class BloodDonation 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age of person:");
		int age =sc.nextInt();
		
		System.out.println("Enter weight of person:");
		int weight=sc.nextInt();
		
		if (age>=18)
		{
			if (weight>=70)
			{
				System.out.println("Eligible for blood donation");
			}
			else
			{
				System.out.println(" Your are under weight not eligible for blood donation");
			}	
		}
		else
		{
			System.out.println("Your are under age not eligible");
		}
		
	}

}
