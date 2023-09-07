package com.constructors;


class Bank
{
	private int accountid;
	private String name;
	private float balance;
	//private String status;
	
	Bank(int accountId,String name,float balance)
	{
		this.accountid=accountId;
		this.name=name;
		this.balance=balance;
	//	this.status=status;
	}
	public int getAccountId()
	{
		return accountid;
	}
	public void setAccountId(int accountId)
	{
		this.accountid=accountId;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public float getBalance()
	{
		return balance;
	}
	public void setBalace(float balance)
	{
		this.balance=balance;
	}
	
  /*  public String getStatus()
	{
		return status;
	}
	public void setStatus(String status)
	{
		this.status=status;
	}   */
	public String toString()
	{
		return accountid+" "+name+" "+balance;
	}

}

public class Account 
{
	static void CheckBalance(Bank b)
	{
		if(b.getBalance()>=500)
		{
			System.out.println("Account is Active");
			System.out.println(b);
		}else
		{
			System.out.println("Account is Inactive----");
			System.out.println(b);
		}
	}
	
	public static void main(String[] args) 
	{
		Bank b1=new Bank(123,"Manoj",15000f);
		Bank b2=new Bank(156,"Akshay",2000f);
		Bank b3=new Bank(134,"Mangesh",200f);
		Bank b4=new Bank(127,"Nehal",1500f);
		Bank b5=new Bank(345,"Amit",1000f);
		
		CheckBalance(b1);
		CheckBalance(b2);
		CheckBalance(b3);
		CheckBalance(b4);
		CheckBalance(b5);
	}

}
