package com.looplogic;

public class PrimeNumber 
{
	static boolean checkPrime(int n)
	{
		boolean status =true;
		if((n==0)||(n==1))
			status=false;
		else
		{
			for(int i=2;i<=n/2;i++)  //i<n
			{
				if(n%i==0)
				{
					status=false;
					break;
				}
				
			}
		}
		return status;
	}
	public static void main(String[] args)
	{
		System.out.println(checkPrime(23));
		
		//series print price numbers from 1 to 50
		
		System.out.println("Prime number from 1 to 50");
		System.out.println();
		for(int i=1;i<=50;i++)
		{
			if(checkPrime(i))  //if(checkPrime(i))
			{
				System.out.println(i);
			}
		}
	}

}
