package com.revision;
import java.util.Scanner;
// 153
// count number of digits:3
// 1^3 +5^3 +3^3 === if this is equal to 153 

// 1456
// count=4
// 1^4 +4^4+ 5^4+ 6^4= 

public class ArmStrong1 //153,370,371,1634, 8208, 9474 
{
	
	static int countdigits(int num)
	{
		int count=0;
		do
		{
			count++;
			num/=10;
			
		}while(num!=0);
		
		return count;
	}
	
	static void checkArmstrong(int num, int count)
	{
	    int original=num;
	    double sum=0;
	    do
	    {
	    	int r=num%10;
	    	sum= sum+ Math.pow(r, count);
	    	num/=10;
	    	
	    }while(num!=0);
	    
	    System.out.println("Sum using logic:"+sum);
	    
	    if(sum==original)
	    {
	    	System.out.println("Armstrong number");
	    }
	    else
	    {
	    	System.out.println("Not an armstrong number");
	    }
		
	}
	
	static void checkArmstrong1(int num, int count)
	{
	    int original=num;
	    double sum=0;
	    do
	    {
	    	int r=num%10;
	        // to calculate r raise to power count
	    	// r - base , count-power
	    	// pro- result
	    	int pro=1;
	    	for(int i=1;i<=count;i++)
	    	{
	    		pro= pro*r;
	    	}
	    	////////////////////////////////
	    	sum+=pro;
	    	//System.out.println(sum);
	    	
		    num/=10;
	    	
	    }while(num!=0);
	    
	    System.out.println("Sum using logic:"+sum);
	    
	    if(sum==original)
	    {
	    	System.out.println("Armstrong number");
	    }
	    else
	    {
	    	System.out.println("Not an armstrong number");
	    }
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		int n= countdigits(num);
		
		checkArmstrong1(num, n);
		
	}

}
