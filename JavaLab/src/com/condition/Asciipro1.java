package com.condition;
import java.util.Scanner;

public class Asciipro1 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a char:");
		char  ch=sc.next().charAt(0);
		
		if((ch>='a' && ch<='z') ||  (ch>='A' && ch<='Z') )
		{
			System.out.println("It is a alphabet");
		}
		else if (ch>='0' && ch<='9')
		{
			System.out.println("It is a digit");
		}
		else 
		{
			System.out.println("It is a special character");
		}
	}

}
