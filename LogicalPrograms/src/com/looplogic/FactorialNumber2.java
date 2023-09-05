package com.looplogic;

public class FactorialNumber2
{
	static long factNumber(int n)
	{
		long fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;  //last statement
	}
	
	public static void main(String[] args) 
	{
		long ans;
		
		ans=factNumber(7);
		System.out.println("Factorial of 7 is:"+ans);
		
		ans=factNumber(9);
		System.out.println("Factorial of 9 is:"+ans);
		
		System.out.println("Factorial of 5 is:"+factNumber(5));
	}

}
