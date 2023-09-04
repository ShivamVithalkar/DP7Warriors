package com.ifelse;
import java.util.Scanner;

public class PrimeNumber
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		boolean flag=false;
		//flag or int count =0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=true;    //int count=1
				break;
			}
		}
			if (flag==false) //flag or (count==0)
			{
				System.out.println("Is a Prime number");	
			}
			else
			{
				System.out.println("Is not a Prime number");
			}	

	}

}
