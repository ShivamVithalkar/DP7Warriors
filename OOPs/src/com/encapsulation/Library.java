package com.encapsulation;

import java.util.Scanner;

public class Library {

	public static void main(String[] args)
	{
		Book b1=new Book();
		
		//implicit---hard core
	/*	b1.setBookId(101);
		b1.setBname("Avengers");
		b1.setPrice(999);
	*/
		System.out.println(b1.getBookId()+" "+b1.getbname()+" "+b1.getprice()+" ");
		//b1.display();
		System.out.println(b1);
		
		Book b2=new Book();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter bookid:");
		//int id=sc.nextInt();
		//b2.setBookId(id);
		b2.setBookId(sc.nextInt());
		
		System.out.println("Enter book name:");
		b2.setBname(sc.next());
		
		System.out.println("Enter book price:");
		b2.setPrice(sc.nextFloat());
		
		
	}

}
