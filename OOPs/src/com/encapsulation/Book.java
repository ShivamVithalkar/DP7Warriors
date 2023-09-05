package com.encapsulation;

public class Book 
{
	//instance variable
	
	private int bookId;
	private String bname;
	private float price;
	
	//getters and setters : public
	
	public void setBookId(int bookId)
	{
		this.bookId=bookId;
	}
	public int getBookId()
	{
		return bookId;  //can write this.bookId
	}
	
	public void setBname(String bname)
	{
		this.bname=bname;
	}
	public String getbname()
	{
		return bname;
	}
	
	public void setPrice(float price)
	{
		this.price=price;
	}
	public float getprice()
	{
		return price;
	}
	
	//hashcode
	public String toString()
	{
		return "BookId :"+bookId+"BookName :"+bname + "Book Price :"+price;
	}
	
}
