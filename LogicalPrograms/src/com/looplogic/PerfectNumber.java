package com.looplogic;
import java.util.Scanner;

public class PerfectNumber
{
	static void checkPerfect(int num)
	{
		int sum=0;
		
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println(num+"is a perfect number");
		}
		else
		{
			System.out.println(num+"is not a perfect number");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();

		checkPerfect(num);
	}

}
