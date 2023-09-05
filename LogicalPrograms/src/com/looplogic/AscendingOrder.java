package com.looplogic;
import java.util.Scanner;

public class AscendingOrder 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		boolean isincreasing = true;
		for(int i=0;i<=num-1;i++)
		//Compare the current digit with the next digit
		{
			if(num>=num+1)
				isincreasing=false;
				break;
				//Exit the loop early since it is not incresing
		}
	

	if(isincreasing)
	{
		System.out.println("The enterd number is in increasing order");
	}else
	{
		System.out.println("Is not in increasing order");
	}
}
}
