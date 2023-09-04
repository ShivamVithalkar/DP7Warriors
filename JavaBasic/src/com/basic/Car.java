package com.basic;
import java.util.Scanner;

public class Car
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Distance covered in km :");
		float dist= sc.nextFloat();
		
		System.out.println("Enter Time taken in hour :");
		float time=sc.nextFloat();
		
		
		System.out.println("Speed of car is :" +(dist/time) +"km/hr");
	}

}
