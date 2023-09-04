package com.ifelse;
import java.util.Scanner;

public class divisible
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int num= sc.nextInt();
		
		if(num%5==0 && num%11==0)
		{
			System.out.println("Number Divisble by 5 or 11");
		}
		else
		{
			System.out.println("Not divisible ");
		}	
	}

}
