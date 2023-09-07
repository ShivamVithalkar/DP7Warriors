package com.constructors;

class Item
{
	private int id;
	private String name;
	private float price;
	
	Item()
	{
		
	}
	
	Item(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public float getPrice()
	{
		return price;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}
	
	public String toString()
	{
		return id+" "+name+" "+price;
	}
	
}
public class GrosseryShop 
{
	
	static void giveDiscount(Item i)
	{
		if(i.getPrice()>200)
		{
			float p=i.getPrice();
			p=(p-(0.1f*p));
			i.setPrice(p);
		}
	}

	public static void main(String[] args)
	{
		Item i1= new Item(1,"Flour",250f);
		Item i2= new Item(2,"Rice",150f);
		Item i3= new Item(3,"Milk",100f);
		Item i4= new Item(4,"Chocolate",500f);
		Item i5= new Item(5,"Biscuits",120f);
		
		
		System.out.println("-------------------");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		
		giveDiscount(i1);
		giveDiscount(i2);
		giveDiscount(i3);
		giveDiscount(i4);
		giveDiscount(i5);
		
		System.out.println("-------After Discount-------");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		
	}

	
}
