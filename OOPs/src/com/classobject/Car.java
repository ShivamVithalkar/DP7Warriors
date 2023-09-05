package com.classobject;

public class Car 
{
	//instance variable
	int carId;
	String brand;
	float price;
	String carName;
	
	//instance method
	void displayCarDetails()
	{
		System.out.println(carId+":  "+carName);
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
	}
	

	public static void main(String[] args) 
	{
		Car c1=new Car();  //create object
		c1.carId=101;		//using
		c1.carName="Ferrari Roma"; 
		c1.brand="Ferrari";
		c1.price=89000.0f;

		Car c2=new Car();  //create object
		c2.carId=102;		//using
		c2.carName="Nano"; 
		c2.brand="TATA";
		c2.price=100000.0f;

		c1.displayCarDetails();
		c2.displayCarDetails();
	}

}


/* 
 OUTPUT-
Brand:Ferrari
Price:89000.0
102:  Nano
Brand:TATA
Price:100000.0 */