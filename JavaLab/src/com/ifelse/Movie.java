package com.ifelse;

import java.util.Scanner;
class Movie
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of pizza bought: ");
		int pizza =sc.nextInt();
		
		System.out.println("Enter no of puffs bought:");
		int puffs =sc.nextInt();
		
		System.out.println("Enter no of colddrinks bought:");
		int colddrinks =sc.nextInt();
		
		System.out.println("Bill Details:");
		System.out.println("Number of pizza:"+pizza);
		System.out.println("Number of puffs:"+puffs);
		System.out.println("Number of colddrinks:"+colddrinks);
		System.out.println("Total price:"+((pizza*100)+(puffs*20)+(colddrinks*10)));
		System.out.println("ENJOY THE SHOW!!!");
	}
}
