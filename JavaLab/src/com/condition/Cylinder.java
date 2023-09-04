package com.condition;
import java.util.Scanner;

public class Cylinder
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter radius of cyclinder:");
		double radius =sc.nextDouble();
		
		System.out.println("Enter height of cyclinder:");
		double height =sc.nextDouble();
		
		double Volume =Math.PI*radius*radius*height;
		
		System.out.println("Volume of cyclinder:" +Volume);
		

	}

}
