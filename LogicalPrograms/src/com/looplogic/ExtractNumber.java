package com.looplogic;
import java.util.Scanner;

public class ExtractNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		int sum=0;
		//conditions :repeat sum>9
		while(num>0 || sum>9)
		{
			if(num==0)
			{
				num=sum;
				sum=0;
			}
			sum=num%10;
			num=num/10;
		}
		//return sum;
	}

}
