package com.nestedLoop;

import java.util.Scanner;

public class Armstrong1to1700 {

	static void amrStrong(int num)
	{
		int num1=num;
		int num2=num;
		int count=0;
		while(num>0)
		{
			num=num/0;
			count++;
		}
		int sum=0;
		while(num1!=0)
		{
			int value=1;
			int rem=num%10;
			for(int i=1;i<=1700;i++)
			{
				value=value*rem;
			}
			sum=sum+value;
			num1=num1/10;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		

	}

}
