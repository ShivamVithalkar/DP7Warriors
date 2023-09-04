package com.operators;
import java.util.Scanner;

public class AreaofCircle 
{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner (System.in);
		
		double radius,area,perimeter;
		
		System.out.println("Enter the radius:");
		radius= sc.nextDouble();
		
		area= Math.PI*radius*radius;
		
		perimeter=2*Math.PI*radius;
		
		System.out.println("Area of cirlce is:"+area);
		System.out.println("Perimeter of cirlce is :"+perimeter);
		
		sc.close();

	}

}
