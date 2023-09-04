package com.basic;
import java.util.Scanner;

public class Billing 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantity of item:");
		int qua=sc.nextInt();
		
		System.out.println("Price of item is:");
		float price =sc.nextFloat();
		
		float bill=(qua*price);
		
		System.out.println("Price of item is:"+bill);

	}

}
