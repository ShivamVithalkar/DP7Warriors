package com.Labsession;

public class H_Pattern {

	public static void main(String[] args)
	{
		for(int i=1;i<=7;i++) //i-row
		{
			for(int j=1;j<=7;j++)  //j-column
			{
				if(j==1 || j==7|| i==4)
				{
				System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
