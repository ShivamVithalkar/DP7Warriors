package com.loops;
import java.util.Scanner;

public class CalculatorSwitch 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number1:");
		int num1=sc.nextInt();
		System.out.println("Enter Number2:");
		int num2=sc.nextInt();
		System.out.println("Enter calculator choice +,-,*,/= ");
		char choice =sc.next().charAt(0);
		
		switch(choice)
		{
		case  '+':System.out.println(num1+num2);
			break;
		case '-'  :System.out.println(num1-num2);
			break;
		case '*':System.out.println(num1*num2);
			break;
		case '/':System.out.println(num1/num2);
			break;	
		
		
		}
		

	}

}
