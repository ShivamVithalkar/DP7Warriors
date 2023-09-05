package com.encapsulation;

public class Library {

	public static void main(String[] args)
	{
		Book b1=new Book();
		
		//implicit---hard core
		b1.setBookId(101);
		b1.setBname("Avengers");
		b1.setPrice(999);
		
		System.out.println(b1.getBookId()+" "+b1.getbname()+" "+b1.getprice()+" ");
		//b1.display();
		System.out.println(b1);
	}

}
