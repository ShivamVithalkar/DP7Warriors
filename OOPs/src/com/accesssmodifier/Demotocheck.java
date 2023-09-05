package com.accesssmodifier;

public class Demotocheck {

	public static void main(String[] args)
	{
		AccessDemo obj=new AccessDemo();
		
	//	obj.a=89;   //bcoz it is private
		obj.b=65;	// default
		obj.d=50;	//public 
		
	//	obj.show();  //it is private
		obj.display();
		obj.test();

	}

}
/*both default and public can be access in different 
 * class but in same package
 */
