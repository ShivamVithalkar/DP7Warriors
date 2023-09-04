package com.ternary;

public class BiggerNumber 
{

	public static void main(String[] args)
	{
		int num1=90;
		int num2=78;
		
		int max;
		max=(num1>num2)?num1:num2;    //ternary operator-variable=(condition)?expr1:expr2
		
		System.out.println(max+  "is greater number");

	}

}
