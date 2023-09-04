package com.ForLoop;

import java.util.Scanner;

public class AddofEven 
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
			if(i%2==0)
			{
				sum = sum+i;
				count++;  ////count is use to count no.of even number
			}
		}
		System.out.println("Addition of Even number:"+sum);
		System.out.println("count of even number"+count);
	}

}
