package com.looplogic;

import java.util.Scanner;

public class AdditionofNumber1to10 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		while(true)
		{
			System.out.println("Enter a number:");
			int num=sc.nextInt();
			sum=sum+num;
			if(num==0)
			{
				break;
			}
			
		}	
		System.out.println("Sum of number is:"+sum);
	}
}

/*to get output enter number ,again number ..again 
 * to get sum of enter number -enter 0(zero)..we
 * will get sum ofnumber
 */