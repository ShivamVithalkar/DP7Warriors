package com.revision;

public class Fibonnaci
{
	
	public static void main(String[] args) 
	{
		
		// 10 fibonnaci series
		//0 1 (0+1)1 (1+1)2 (1+2)3.....
		int n1,n2,n3;
		n1=0;
		n2=1;
		
		int count=10;
		
		System.out.print(n1+"  "+n2+"  ");//for starting from 0..1....
		
		for(int i=2;i<=count;i++)
		{
			n3=n1+n2;
			System.out.print(n3+"  ");
			n1=n2;
			n2=n3;	
		}
	}

}
