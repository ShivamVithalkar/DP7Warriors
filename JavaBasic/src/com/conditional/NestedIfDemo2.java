package com.conditional;
import java.util.Scanner;

public class NestedIfDemo2 
{

	public static void main(String[] args) 
	{
		//perct great>65 college admission
		//>=80 have sci and commerce stream
		//<80 -only commerce stream
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student percentage:");
		float per= sc.nextFloat();
		
		if(per>=65)
		{
			System.out.println("Eligible for admission..");
			
			if(per>=80)
			{
				System.out.println("can have opt science and commerce");
			}
			else
			{
				System.out.println("Can opt only commerce");
			}
			
		}
		else
		{
			System.out.println("Not eligible for college admission");
		}
		
		}
	}


