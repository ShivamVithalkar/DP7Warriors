package com.LabSession1;
import java.util.Scanner;

public class GuessNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num1=35;
		int count=0;
		
		while(num1!=0)
		{
		System.out.println("Guess number :");
		int num=sc.nextInt();
		count++;
		
		if(num>num1)
		{
			System.out.println("You have enter higher number..Enter next number");
		}
		else if(num<num1)
		{
			System.out.println("You have enter lower number..Enter next number");
		}
		else if(num==num1)
		{
			System.out.println("Congrats!! Your Guess is correct");
			System.out.println("No of Guesses is:"+count);
			break;
		}
		
		}
	}

}
