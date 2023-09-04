package com.conditional;

public class CharDatatype
{
	public static void main(String[] args)
	{
		//char =int
		
		char ch='z';
		System.out.println(ch);
		
		int value=ch;
		System.out.println(value);
		
		//character :ASCII value
		//American Standard code for information interchange
		
		//A-Z :65-90
		//a-z :97-122
		//0-9 :48-57
		
		char c1='8';
		
		int vi1=c1;          //8 ascii value is 56
				
		System.out.println(c1);
		System.out.println(vi1);
		
		char c2=48;    //48 is taken as ascii value
		char c3=97;
		
		System.out.println(c2+"    "+c3);
		
		char char1=1;    //here 1 is treated as in : ascii value
		char char2='1';  //here 1 us treated as char
		
		System.out.println(char1+"   "+char2);
	}

}
