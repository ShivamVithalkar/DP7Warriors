package com.Labsession;

class Person
{
	private int id;
	private String name;
	private int age;

 Person(int id,String name,int age)
 {
	 this.id=id;
	 this.name=name;
	 this.age=age;
 }
 
 public int getId()
 {
	 return id;
 }
 public void setId(int id)
 {
	 this.id=id;
 }
 
 public String getName()
 {
	 return name;
 }
 public void setName(String name)
 {
	 this.name=name;
 }
 
 public int getAge()
 {
	 return age;
 }
 public void setAge(int age)
 {
	 this.age=age;
 }
 
 public String toString()
 {
	 return id+" "+name+" "+age;
 }
 
}

public class Vote
{
	static void CheckElegibility(Person p)
	{
		if(p.getAge()>=18)
		{
			System.out.println("Person elegible to vote--");
			System.out.println(p);
		}else
		{
			System.out.println("Person not elegible to vote--");
			System.out.println(p);
		}
	}
	
	public static void main(String[] args)
	{
		Person p1=new Person(101,"Ram",25);
		Person p2=new Person(105,"Shyam",15);
		
		CheckElegibility(p1);
		CheckElegibility(p2);
	}

}
