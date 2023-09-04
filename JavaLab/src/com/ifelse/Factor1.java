package com.ifelse;
import java.util.Scanner;

public class Factor1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Enter factor number:");
		int factor=sc.nextInt();
		
		if((factor<num) && (num%factor==0))
		{
			System.out.println(factor+"is a factor of "+num);
		}
		else if((factor<num) && (num%factor!=0))
			{
			System.out.println(factor+"is not a factor of "+num);
			}else
			{
				System.out.println(factor+"Factor is greater than number"+num);
			}
		
		 
		}
		
	}
