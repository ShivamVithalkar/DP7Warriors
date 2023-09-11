package com.constructorschaining;
import java.util.Scanner;

public class Students
{
	private int studentId;
	private String studentName;
	private String address;
	private String collegeName;
	
	Students(int studentId,String studentName,String address,String college)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.address=address;
		this.collegeName=collegeName;
	}
	
	Students(int studentId,String studentName,String address)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.address=address;
		
	}
	public int getStudentId()
	{
		return studentId;
	}
	public String getStudentName()
	{
		return studentName;
	}
	public String getAddress()
	{
		return address;
	}
	public String getCollegeName()
	{
		return collegeName;
	}
	
	public String toString(int studentId,String studentName,String address,String collegeName)
	{
		return "StudentId: "+studentId+"\n Student name:"+studentName+"\n Address: "+address+"\n CollegeName "+collegeName;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter choise 0 and 1:");
		

	}

}
