package com.conditional;

public class Shorthand 
{

	public static void main(String[] args) 
	{
		byte b1=70;
		byte b2=12;
		
		b1=(byte)(b1+b2);      //using type casting	
		System.out.println(b1);
		
		
		byte num1=23;
		byte num2=10;
		//num1=num1+nm2;
		
		num1+=num2;    //removes type casting
		
		System.out.println(num1);
		
		short s1=67;
		short s2=3;
		
		s1*=s2;				//removes type casting   it can use for all arithmetic op
		System.out.println(s1);
		//s1=s1*s2;
	}

}
