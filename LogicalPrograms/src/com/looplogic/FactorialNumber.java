package com.looplogic;

public class FactorialNumber
{
		static void factNumber(int n)
		{
			long fact=1;
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of "+n+"is"+fact);
		}
		
	public static void main(String[] args) 
	{
//		int num=7;
//		int num=9;

		factNumber(7);
		factNumber(8);
	}
}
