package com.looplogic;
import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		int sum=0;
		int rem;
		int num1=num;
		
		while(num!=0)
		{
			rem=num%10;
			sum+=rem;
			num/=10;
		}
			if(num1%sum==0)
			{
				System.out.println("It is a harshad number");
			}
			else
			{
				System.out.println("It is not harshad number");
			}
	}

}
