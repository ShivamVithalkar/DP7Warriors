package com.looplogic;
import java.util.Scanner;

public class PellSeries     //P0 = 0 ,P1 = 1,P2 = 1 * 2 + 0 = 2,  P3 = 2 *(3-1) + (3-2) = 5
							//P4 = 5 * 2 + 2 = 12----p4=5*(5-3)+(5-3)
{  
	public static int pellNumber(int num)  //0,1,2,5,12.....
	{  
		if (num <= 2)  
			return num;  
  
		return 2 * pellNumber(num - 1) + pellNumber(num - 2);  
	}  
  
		public static void main(String args[])  
		{  
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the term to print:"); //int num(term) = 4; ans=12
			int num=sc.nextInt();
			 
			//calling the function and prints the pell number   
			System.out.println("The " +num+"-th" +" term of the series is: " +pellNumber(num));  
		}  
}  