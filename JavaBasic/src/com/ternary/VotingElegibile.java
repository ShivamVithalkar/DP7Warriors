package com.ternary;

public class VotingElegibile {

	public static void main(String[] args)
	{
		int age=10;
		String status;
		status =(age>=18)? "yes":"no";
		System.out.println(status);
		
		if(age>=18)
		{
			status="yes";
		}
		else
		{
			status="no";
		}
		System.out.println(status);
		boolean s= (age>=18)?true:false;
		System.out.println(s);
	}

}
