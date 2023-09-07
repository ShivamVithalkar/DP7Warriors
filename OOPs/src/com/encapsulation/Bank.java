package com.encapsulation;

public class Bank 
{
	private int customerId;
	private String Name;
	private int accountno;
	private double balance= 10000;
	
	public void setCustomerId(int customerId)
	{
		this.customerId=customerId;
	}
	public int getCustomerId()
	{
		return customerId;
	}
	
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public String getName()
	{
		return Name;
	}
	
	public void setAccountno(int accountno)
	{
		this.accountno=accountno;
	}
	public int getAccountno()
	{
		return accountno;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
	
	
}
