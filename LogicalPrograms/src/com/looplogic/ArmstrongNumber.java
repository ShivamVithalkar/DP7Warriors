package com.looplogic;
import java.util.Scanner;

public class ArmstrongNumber    //153,370,371,407
{
	static void arm(int num)
	{
		
		int num1=num;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;  	   //remainder
			num=num/10;			  //quotient
			int result=rem*rem*rem;
			sum=sum+result;		
		}
		if(sum==num1)
		{
			System.out.println("The number is armstrong:"+num1);
		}
		else
		{
			System.out.println("The number is not armstrong:"+num1);
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		arm(num);
		
	}
}
