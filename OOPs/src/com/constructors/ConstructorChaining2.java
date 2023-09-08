package com.constructors;

	class Test
	{
		int a;
		int b;
		String name;
	
	
	Test()
	{
		System.out.println("Default constructor");
		this.a=10;
		this.b=20;
		this.name="Unknown";
		System.out.println("Task has to be done everytime");
	}
	
	Test(int a,int b)
	{
		this();
		System.out.println("Param constuructor 1");
		this.a=a;
		this.b=b;
	}
	
	Test(int a,int b,String name)
	{
		this();
		System.out.println("Param constuructor 2");
		this.a=20;
		this.b=30;
		this.name=name;
	}
	public String toString()
	{
		return "a:"+a+"\n b:"+b + "\n name:"+name;
	}
}

public class ConstructorChaining2 {

	public static void main(String[] args)
	{

		System.out.println("----------------");
		Test t1=new Test();
		System.out.println(t1);
		
		System.out.println("----------------");
		Test t2=new Test();
		System.out.println(t2);
		
		System.out.println("----------------");
		Test t3=new Test();
		System.out.println(t3);
		
		
		

	}

}
