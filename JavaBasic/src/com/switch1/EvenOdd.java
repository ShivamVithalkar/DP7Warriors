package com.switch1;
import java.util.Scanner;

public class EvenOdd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		switch(num%2)
		{
		case   0 : System.out.println("Number is even");					
							break;
		case   1 :  System.out.println("Number is odd");
							break;
		}
		
	}

}
