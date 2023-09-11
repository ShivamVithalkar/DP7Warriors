package com.staticDemo;

public class StaticDemo 
{
	int x=10;
	static int y=20;
	
	void show()
	{
		x++;
		System.out.println("x:"+x);
		y++;
		System.out.println("y:"+y);
	}
	
	void display()
	{
		int y=20;
		System.out.println(y);
		System.out.println(StaticDemo.y);	
	}

	public static void main(String[] args) 
	{
		StaticDemo s1=new StaticDemo();
		System.out.println("Obejct s1");
		s1.show();
		
		StaticDemo s2=new StaticDemo();
		System.out.println("Obejct s2");
		s2.show();
		
		y++;
		s2.display();
	}

}
