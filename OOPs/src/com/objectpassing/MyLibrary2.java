package com.objectpassing;
import java.util.Scanner;
import com.encapsulation.Book;

public class MyLibrary2 
{

	static Scanner sc=new Scanner(System.in);
	
		static void insertBook(Book b)
		{
			System.out.println("Enter book id:");
			b.setBookId(sc.nextInt());
			System.out.println("Enter book name:");
			b.setBname(sc.next());
			System.out.println("Enter price:");
			b.setPrice(sc.nextFloat());
		}
			
			
			
	public static void main(String[] args) 
	{
		Book b1=new Book();
		
		b1.setPrice(1000);
		Book b2=b1;
		b2.setBookId(21);
		b2.setBname("Lunix");
		b2.setPrice(1500);
		System.out.println("-------------------");
		
		System.out.println(b1);
		System.out.println(b2);
		//System.out.println(b3);
		
		Book b3= new Book();
		b3=b1; // shallow copy : change in one object is reflected in another
		System.out.println("------------------");
		System.out.println(b1);
		b3.setBookId(101);
		b3.setBname("JavaBook");
		b3.setPrice(2000);
		
        System.out.println("------------------");
		
		System.out.println(b1);
		System.out.println(b3);

	}

}
