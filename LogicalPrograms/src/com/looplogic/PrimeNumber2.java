package com.looplogic;

public class PrimeNumber2 
{	
	
	public static void main(String[] args) {
		
		//System.out.println(checkPrime(23));
		
		//Series print prime numbers from 1 to 50
		boolean status;
		
		System.out.println("Prime numbers from 1 to 50");
		System.out.println();
		for(int n=1;n<=50;n++)
		{
			status= true;
			
			if((n==0)||(n==1))
				status= false;
			else
			{
				for(int j=2;j<=n/2;j++)
				{
					if(n%j==0)
					{
						status=false;
						break;
					}
				}
			}
			
			if(status) // (status==true) (!status)--->(status==false)
			{
				System.out.println(n);
			}
			
				
		}
		
		
	}
	
}
