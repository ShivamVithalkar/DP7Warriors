package com.revision;
import java.util.Scanner;

public class KrishnaMurthy1 
{
	
	static void checkKrishna(int num)
	{
		int original= num;
		int sum=0;
		do
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
			
			//System.out.println(sum);
			
			
		}while(num!=0);
		
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
