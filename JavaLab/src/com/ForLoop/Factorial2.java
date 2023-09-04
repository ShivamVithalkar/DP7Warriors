package com.ForLoop;
import java.util.Scanner;

public class Factorial2
{
	
	static void showfact(int num)
	{	
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of number is:"+fact); //return fact;
			
	}
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		showfact(num);
		//System.out.println("Factorial of number is:"+fact)
	}

}
