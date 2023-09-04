package com.conditional;
import java.util.Scanner;

public class ElectricityBill 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Electricity consumption unit:");
		float unit=sc.nextFloat();
		
	/*	double bill=(unit*0.50);
		double addcharge =(bill*0.2);
		double totalbill=unit+addcharge;*/
				
		if (unit<=50 )
		{
			System.out.println("Electrity bill is Rs.:"+((unit*0.50)+((unit*0.50)*0.20)));
		
		}
		else
		{
			if(unit<=150)
			{
				System.out.println("Electrity bill is Rs.:"+((25+(unit-50)*0.75)+(25+(unit-50)*0.75)*0.20));
			}
			else
			{
				if (unit<=250)
				{
					System.out.println("Electrity bill is Rs.:"+((100+(unit-150)*1.20)+(100+(unit-150)*1.20)*0.20));
				}
				else
				{
					if(unit>=250)
				{
					System.out.println("Electrity bill is Rs.:"+((220+(unit-250)*1.50)+(220+(unit-250)*1.50)*0.20));
				}
				}
			}
			
		}
		

	}

}
