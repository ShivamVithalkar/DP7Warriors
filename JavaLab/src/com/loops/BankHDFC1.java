package com.loops;
import java.util.Scanner;
public class BankHDFC1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("WELCOME TO HDFC BANK");
		
		System.out.println("Enter PIN of Account:");
		int pin=sc.nextInt();
			
		int balance=10000;
		
		if (pin==2023)
		{
			System.out.println("1-Deposit \n 2-Withdraw \n3-Check balance \n4-Exit");
			System.out.println("Enter choice :");
			int choice =sc.nextInt();	
			
			switch(choice)
			{
				case 1:
					
				System.out.println("Enter amount to deposit :");
				int deposit=sc.nextInt();
				balance=deposit+balance;   //balance+=deposit---to write in shorthand method
				System.out.println("Balance:"+balance);
				break;
				
				case 2:
			
				System.out.println("Enter withdraw amount:");
				int withdraw=sc.nextInt();
				balance =balance-withdraw;   //balance-=amount;	
				System.out.println("Current balance:"+balance);
				break;
				
				case 3:
			
				System.out.println("Check Balance is :"+balance);	
				break;
				
				case 4:
			
				System.out.println("Thank You for Banking");
				break;
			}
			   
			}else
				   System.out.println("Enter PIN is incorrect");
		}
	}
