package com.LabAssign;
import java.util.Scanner;

public class InterviewQue 
{
	
	public static void main(String[] args)
	{  
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int rev = 0;
		int num1=num;
	
		while(num != 0)   
		{  
			int remainder = num % 10;  
			rev = rev * 10 + remainder;  
			num = num/10;  
		}
		System.out.println("The reverse is: " +rev);
		
		int sub=num1-rev;
		if(sub<=0)
		{
		System.out.println("Final output:"+"0");
		}
		else
		{
			System.out.println("Final output:"+sub);
		}
		
	}
}
		/*int num2=num-rev;
		if(num2<=0)
		{
			System.out.println("Final output is:"+"0");
		}
		else
		{
			System.out.println("Final output is :"+num2);  
		} */ 


