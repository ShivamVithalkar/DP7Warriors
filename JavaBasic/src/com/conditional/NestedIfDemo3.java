package com.conditional;
import java.util.Scanner;

public class NestedIfDemo3
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter marks of student:");
		float mark=sc.nextFloat();
		
		System.out.println("Enter PCM marks of student:");
		float pcm=sc.nextFloat();
		
		if(mark>=90 || pcm>=85)
		{
			System.out.println("Eligible for admission");
		}
		else
		{
			System.out.println("Not eligible for admission");
		}
	}

}
