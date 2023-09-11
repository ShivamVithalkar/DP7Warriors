package com.LabSession1;

class VehicleInfo
{
	int id;
	String name;
	float price;


VehicleInfo(int id,String name,float price)
{
	this.id=id;
	this.name=name;
	this.price=price;
}
void show()
{
	System.out.println("Vehicle id:"+id);
	System.out.println("Vehicle name:"+name);
	System.out.println("Vehicle price:"+price);
}

}
public class Vehicle {

	public static void main(String[] args) 
	{
		VehicleInfo v1=new VehicleInfo(101,"Tata",150000);
		VehicleInfo v2=new VehicleInfo(105,"Tesla",200000);
		
		v1.show();
		v2.show();
	}

}
