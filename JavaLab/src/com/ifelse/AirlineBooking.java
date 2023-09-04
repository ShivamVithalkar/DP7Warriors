package com.ifelse;
import java.util.Scanner;

public class AirlineBooking
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to Airgo Airlines..");
		
		System.out.println("Enter customer Name :");
		String name = sc.next();
		
		System.out.println("Enter Departure place :");
		String place=sc.next();
		
		System.out.println("Enter Destination spot :");
		String spot =sc.next();
		
		System.out.println("Enter the coupon code if you have :");
		int code=sc.nextInt();
		
		if  (code==2023)
		{
			double price =30000;
			System.out.println("Your code is valid");
			System.out.println("Congrats we are providing you 10% discount on ticket..");
			
			double discount =price*0.1;    //is use to find discount
			double newprice=(discount-price);
			System.out.println("Your discount price on ticket is:"+discount);
			
			System.out.println("Your  Newprice of ticket is:"+newprice);
			System.out.println("Your ticket is booked ...Enjoy the Journey!!!");
			
		}
		else
		{
			double price=30000;
			System.out.println("Code is unvalid..");
			System.out.println("Your price of ticket is:"+price);
			System.out.println("Your ticket is booked ...Enjoy the Journey!!!");
			
		}
		
	}

}
