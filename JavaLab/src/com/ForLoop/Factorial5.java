//WAP to findout factorial of given number:-
package com.ForLoop;

import java.util.Scanner;

public class Factorial5
{	

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial of number is"+fact);

	}

}
