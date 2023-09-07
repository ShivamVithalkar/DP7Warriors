package com.looplogic;
import java.util.Scanner;
public class Ascending1
{
	public static boolean assending(int num) 
	{
	        String numStr = Integer.toString(num);
	        int l = numStr.length();
	        
	        for (int i = 0; i < l - 1; i++) 
	        {
	            int digit1 = numStr.charAt(i) - '0';  // Convert char to int
	            int digit2 = numStr.charAt(i + 1) - '0';
	            
	            if (digit1 > digit2) 
	            {
	                return false;  // Digits are not in ascending order
	            }
	        }
	        
	        return true;  // All digits are in ascending order
	    }
		
		    public static void main(String[] args)
		    {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter a number: ");
		        int num = scanner.nextInt();
		        
		        if (assending(num))
		        {
		            System.out.println("The number is assending");
		        } else 
		        {
		            System.out.println("The number is not assending");
		        }
		        
		        scanner.close();
		    }

	}
