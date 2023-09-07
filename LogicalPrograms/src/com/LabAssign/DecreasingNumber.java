package com.LabAssign;
import java.util.Scanner;

public class DecreasingNumber 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int flag=0;
		
		while(num>0)
		{
			int inc=num%10;
			
			int temp=num;
			while(inc>0) 
		while(temp>0)		
		{
			int rem=temp%10;
			if(rem<inc)
			{
				flag=1;
				break;
			}
			temp=temp/10;
		}
		num=num/10;
		
		if(flag==0)
		{
			System.out.println("Decreasing number");
		}
		else
		{
			System.out.println("Bouncy number");
		}
	}

}
}
