package com.ifelse;
import java.util.Scanner;
public class BankHdfc 

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
			if(choice==1)
			{
				System.out.println("Enter amount to deposit :");
				int deposit=sc.nextInt();
				balance=deposit+balance;   //balance+=deposit---to write in shorthand method
				System.out.println("Balance:"+balance);
			}
			if(choice==2)
			{
				System.out.println("Enter withdraw amount:");
				int withdraw=sc.nextInt();
				balance =balance-withdraw;   //balance-=amount;	
				System.out.println("Current balance:"+balance);
			}
			if(choice==3)
			{
				System.out.println("Check Balance is :"+balance);	
			}else if(choice==4)
			{
				System.out.println("Thank You for Banking");
			}		
			}
		   else
		   {
			   System.out.println("Enter PIN is incorrect");
		   }
			
			}
	}

