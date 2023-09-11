package com.revision;

public class Prime1to50
{
	
	static boolean checkPrime(int num)
	{
		boolean status=true;
		
		// 0 and 1 > not prime
		if((num==0)||(num==1))
		{
			status=false;
			
		}
		// every num is divisible by 0 and 1 >> i=2
		// num is divisible by itself <num
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0) // num is divisible by i
			{
			   status=false;
			   break;
			}
		}
		return status;
}

public static void main(String args[])
{
	System.out.println("Prime numbers from 1 to 50 are:");
	
	for(int i=1;i<=50;i++)
	{
		if(checkPrime(i))
		{
			System.out.println(i);
		}
	}
 }
}