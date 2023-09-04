package com.loops;
import java.util.Scanner;

public class MinNumber 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int digit=9;
		while(num!=0)
		{
			int rem=num%10;
			if(rem<digit)
			{
				digit=rem;
			}
			num=num/10;
		}
		System.out.println(digit+ "is the smallest number");
		
	}

}
