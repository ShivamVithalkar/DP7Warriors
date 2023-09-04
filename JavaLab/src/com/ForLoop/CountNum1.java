package com.ForLoop;
import java.util.Scanner;

public class CountNum1
{
	static void count1(int num,int luckynumber)
	{	
		
		int count=0;
		while(num>0)
		{	
				int rem=num%10;
				if(rem==luckynumber)
				{
					count++;
					num=num/10;	
				}
		}
		System.out.println("Count of number is:"+count);
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter car number:");
		int num=sc.nextInt();
		System.out.println("Enter lucky number:");
		int luckynumber=sc.nextInt();
		count1(num,luckynumber);
		
	}

}
