package com.accesssmodifier;

public class AccessDemo 
{
	private int a;
	int b;		//default
	// procted int c;    will used in inheritance
	public int d;
	
	private void show()
	{
		System.out.println("Hello");
	}
	void display()
	{
		System.out.println("Welcome");
	}
	public void test()
	{
		System.out.println("test");
	}
	public static void maint(String[] args)
	{
		//inside the class everything is accsessible
		AccessDemo obj=new AccessDemo();
		obj.a=89;
		obj.b=65;
		obj.d=50;
		
		obj.show();
		obj.display();
		obj.test();
		
	}
}
