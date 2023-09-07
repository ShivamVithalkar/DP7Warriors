package com.Labsession;

class Book
{
	private String bName;
	private String bAuthor;
	private String date;
	private float price;
	private char category;
	
	Book(String bName,String bAuthor,String date,float price,char category)
	{
		this.bName=bName;
		this.bAuthor=bAuthor;
		this.date=date;
		this.price=price;
		this.category=category;
	}

	
	public String getbName()
	{
		return bName;
	}
	public void setbName(String bName)
	{
		this.bName=bName;
	}
	public String getbAuthor()
	{
		return bAuthor;
	}
	public void setbAuthor(String bAuthor)
	{
		this.bAuthor=bAuthor;
	}
	public String getdate()
	{
		return date;
	}
	public void setdate(String date)
	{
		this.date=date;
	}
	public float getPrice()
	{
		return price;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}
	public char getCategory()
	{
		return category;
	}
	public void setCategory()
	{
		this.category=category;
	}
	
	public String toString()
	{
		return bName+" "+bAuthor+" "+date+" "+price+" "+category;
	}
	
}

public class Book11
{

	static void discount(Book b)
	{
		if(b.getCategory()=='S')
		{
			float price=b.getPrice();
			price= (float)(price-(0.1f*price));	
			b.setPrice(price);
			
		}
	}
	public static void main(String[] args)
	{
		Book b1=new Book("C","Yashwant kanetkar","12/10/1989",300f,'S');
		Book b2=new Book("C++","Balguru Swamy","12/10/1989",500f,'O');
		Book b3=new Book("JAVA","James ","12/10/1989",1000f,'S');
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println("--------Discount------");
		discount(b1);
		discount(b2);
		discount(b3);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
	}

}
