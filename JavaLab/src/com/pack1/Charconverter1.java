package com.pack1;

public class Charconverter1 
{

	public static void main(String[] args)
	{
		char ch='S';
		
		char ch1=(char) (ch+32);         //implicit casting
		System.out.println(ch1);
		
		char ch2='t';
		
		char ch3=(char) (ch2-32);        //expliit casting
		System.out.println(ch3);
		
	
		/*String s="A";
		 * String s2=s.tplowerCase();
		 * System.out.println(s2);
		 * String s3=s2.toUperCase();
		 * System.out.println(s3); 
		 */
	}

}
