package com.LabSession1;

public class PellNumber1 
{
	static void pellSeries(int num)
	{
		int a=0;
		int b=1;
		System.out.println(a+" "+b+" ");
		for(int i=1;i<=num;i++)
		{
			int sum=b*2+a;   //a+b*2;
			System.out.println(sum+" ");
			a=b;
			b=sum;
		}
	}

	public static void main(String[] args) 
	{
		int num=10;
		pellSeries(num);

	}

}
