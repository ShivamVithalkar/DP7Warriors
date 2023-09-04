package com.ifelse;
import java.util.Scanner;
public class BookMovieTicket
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("WELCOME TO BOOKMYSHOW!!!");
		
		System.out.println("Enter Movie name:");
		String movie=sc.next();
		System.out.println("Enter Movie rating:");
		float rating=sc.nextFloat();
		System.out.println("Enter Movie ticket price:");
		int price=sc.nextInt();
		System.out.println("Enter coupon code:");
		int code=sc.nextInt();
		
		
		if (code==0)
		{
			System.out.println("Code is valid you will get rs.50 off on ticket: "+(price-50));
			System.out.println("Your ticket is booked" + movie  +rating  +price+ "Enjoy the show!!!");
		}else if(code==1)
		{
			System.out.println("Code is valid you will get rs.100 off on ticket:"+(price-100));
			System.out.println("Your ticket is booked"+"\n"+"Movie name is--"+movie+"\n"+"Rating is--"+rating+"\n"+"Ticket Price--"+price+"\n"+"Enjoy the show!!!");
			
	    } 
	  else
    	{
		System.out.println("Your code does not match ticket is booked" + movie +"\n"+ rating +"\n"+ price+"\n"+ "Enjoy the show!!!");
	   }
		}	
	}
	

