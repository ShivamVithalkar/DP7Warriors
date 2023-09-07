package com.Labsession;

public class Item 
{
	int itemId;
	String itemName;
	float itemPrice;
	
	void display()
	{
		System.out.println("Item Id:"+itemId);
		System.out.println("Item Name:"+itemName);
		System.out.println("Item price:"+itemPrice);
	}
	public static void main(String[] args) 
	{
		Item i=new Item();
		i.itemId=12;
		i.itemName="Pen";
		i.itemPrice=10f;
		
		i.display();
		
	}

}
