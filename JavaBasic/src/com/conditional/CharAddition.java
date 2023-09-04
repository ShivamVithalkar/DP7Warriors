package com.conditional;

public class CharAddition
{

	public static void main(String[] args) 
	{
		char c1=65;
		char c2=2;
		
		char c3=(char) (c1+c2);
		System.out.println(c3);     //----print --c
		
		int i1=97;
		int i2=3;
		
		char ch=(char) (i1+i2);
		System.out.println(ch);   //---print--d
		
		char ch1='0';    //48
		char ch2='5';   //53
		
		//48+53=101          101 is ascii value of - e	
		char result=(char)(ch1+ch2);   //adds ascill value
		
		System.out.println(result);       //----print --e

	}

}
