package com.ternary;
import java.util.Scanner;

public class GreatNumof3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter num1:");
		int num1=sc.nextInt();
		System.out.println("Enter num2:");
		int num2=sc.nextInt();
		System.out.println("Enter num3:");
		int num3=sc.nextInt();
		
		
		int max= (num1>num2)&&(num1>num3)?num1:(num2>num3)?num2:num3;
		
		System.out.println("Greatest number is:"+max);
		
	}

}
