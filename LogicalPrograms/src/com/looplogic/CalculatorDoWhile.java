package com.looplogic;
import java.util.Scanner;

public class CalculatorDoWhile
{

	public static void main(String[] args) 
	{	
		char ch1;
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number1:");
			int num1=sc.nextInt();
			System.out.println("Enter Number2:");
			int num2=sc.nextInt();
			System.out.println("Enter calculator choice +,-,*,/,%= ");
			char choice =sc.next().charAt(0);
			
			switch(choice)
			{
			case  '+':System.out.println(num1+num2);
			break;
			case '-' :System.out.println(num1-num2);
			break;
			case '*' :System.out.println(num1*num2);
			break;
			case '/' :System.out.println(num1/num2);
			break;
			case '%' :System.out.println(num1%num2);
			break;	
			default:
				System.out.println("Enter valid operator");
			}
			System.out.println("Do you want to continue..Y or N");
			ch1=sc.next().charAt(0);
		}
		while(ch1!='N');
	}

}
