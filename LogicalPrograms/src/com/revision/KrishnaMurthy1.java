package com.revision;
import java.util.Scanner;

public class KrishnaMurthy1 
{
	static void checkKrishna(int num)
	{
		int original= num;
		int sum=0;
		while(num!=0)
		{
			int r= num%10;
			// logic of fact
			long fact=1;
			for(int i=1;i<=r;i++)
			{
				fact*=i;
			}
			sum+=fact;
			num/=10;			
		}
		
		if(sum==original)
		{
			System.out.println(original+" is a Krishnamurthy number");
		}
		else
		{
			System.out.println(original+" is not a Krishnamurthy number");
		}
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");//145
		int num=sc.nextInt();
		
		checkKrishna(num);
		
	}
}
//factorial=145=4-1*2*3*4=24
//5- 1*2*3*4*5=120
//145=1+24+120
