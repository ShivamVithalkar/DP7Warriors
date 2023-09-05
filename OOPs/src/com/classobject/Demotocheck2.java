package com.classobject;
import com.accesssmodifier.*;  //to access whole package
//import com.accessmodifier.AccessDemo;

public class Demotocheck2 
{

	public static void main(String[] args) 
	{
		AccessDemo obj=new AccessDemo();
		
	//	obj.a=89;   //bcoz it is private not access
	//	obj.b=65;	// default not access
		obj.d=50;	//only public can access in other package
		
	//	obj.show();  //it is private
	//	obj.display(); //default not access
		obj.test();	//only public can access in other package

	}

}
