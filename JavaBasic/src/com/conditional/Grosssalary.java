package com.conditional;
import java.util.Scanner;

public class Grosssalary
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter basic salary:");
		float salary=sc.nextFloat();
		
		if(salary<=10000)
		{
			System.out.println("Gross salary of emp:"+((salary *0.20)+(salary*0.80)));
		}
		else if(salary<=20000)
		{
			System.out.println("Gross salary of emp:"+((salary*0.25)+(salary*0.90)));
		}
		if(salary>20000)
		{
			System.out.println("Gross salary of emp:"+((salary*0.30)+(salary*.95)));
		}
	}
	
}
