package com.constructors;

class Person
{
	private int id;
	private String name;
	private int age;
	
	
	public Person()
	{
		id=100;
		name="User";
		age=20;
	}
	
	public String toString()
	{
		return id+" "+name+" "+age;
	}
}

public class PersonTest
{
	public static void main(String[] args)
	{
		Person p = new Person();
		System.out.println(p);

	}

}
