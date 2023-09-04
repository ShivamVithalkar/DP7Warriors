package com.ForLoop;

import java.util.Scanner;

public class AddofOdd 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		
		int sum=0;
		int count=0;
		for(int i=1;i<num;i++)
		{
			if(i%2!=0)
			{
				sum = sum+i;
				count++;  //count is use to count no.of odd number 
			}
		}
		System.out.println("Addition of Odd number:"+sum);
		System.out.println("count of Odd number"+count);
	}

}
