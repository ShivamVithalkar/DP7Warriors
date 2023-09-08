package com.LabSession1;
import java.util.Scanner;

public class CubeofNumber 
{
	
    static int square(int num)
    {
	return num*num;
    }
    //method call inside same class-sqr() call in cube()
    static int cube(int num)
    {
	return num*square(num);
    }
    
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		System.out.println(cube(num));
	}
}

