package com.pack1;
import java.util.Scanner;

public class Conversion2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any character:");
		char c=sc.next().charAt(0);
		
		char ch1=(char) (c-32);
		System.out.println(ch1);
		
		char ch2=(char) (c+32);
		System.out.println(ch2);			
	}

}
