package com.constructors;

class Acct
{ 
	private int id;
	private String name;
	private float balance;

 Acct()
{
	
}
 Acct(int id,String name,float balance)
 {
	 this.id=id;
	 this.name=name;
	 this.balance=balance;
 }
 void display()
 {
	 String name="Shivam";
	 System.out.println("Name:"+name);
	 System.out.println(this.name);
 }
 void show()
 {
	 System.out.println("Welcome to Bank:"+this.id+" "+this.name+" "+this.balance);
 }
 public String toString()
 {
	 return id+" "+name+" "+balance;
 }
 
}
public class Account1 {

	public static void main(String[] args)
	{
		Acct a1=new Acct(102,"Shivam",20000);
		Acct a2=new Acct(105,"Pranav",20000);
		Acct a3=new Acct(107,"Shivam",20000);
		
		a1.display();
		a2.display();
		a3.display();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
	}

}
