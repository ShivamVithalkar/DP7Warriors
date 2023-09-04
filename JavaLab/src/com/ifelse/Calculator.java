package com.ifelse;

import java.util.Scanner;

public class Calculator
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter num1 :");
		float num1=sc.nextFloat();
		
		System.out.println("Enter num2 :");
		float num2=sc.nextFloat();
		
		float sum=num1+num2;
		float sub=num1+num2;
		float div=num1*num2;
		float multi=num1*num2;
		
		System.out.println("Addition of number:" +sum+"\n"+
				"Subtraction of number:"+sub +"\n"+
				"Division of number :"+div +"\n"+ 
				"Multiplication of number :"+multi);
				
	}

}
