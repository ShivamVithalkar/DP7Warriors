package com.constructors;

class Demo
{
	int a;
	int b;
	String name;

	Demo(int a,int b)
	{
		this.a=a;
		this.b=b;
		this.name=name;
	}
	
	Demo()
	{
		this(10,20);   //Always has to first statement
		System.out.println("Default Constructor ");
	}
	
	Demo(int a,int b,String name)
	{
		System.out.println("Para Constructor");
		this.a=a;
		this.b=b;
		name="unknown";
	}
	
	public String toString()
	{
		return "a:"+a+"\n b:"+b + "\n name:"+name;
	}

}

public class ConstructorChaining
{

	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		System.out.println(d1);
		
		Demo d2=new Demo();
		System.out.println(d2);
		
		Demo d3=new Demo();
		System.out.println(d3);
	}

}
