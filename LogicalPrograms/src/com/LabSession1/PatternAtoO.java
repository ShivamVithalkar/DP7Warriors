package com.LabSession1;
/* A
 * B C
 * D E F
 * G H I J
 * K L M N O
 * 
 */
public class PatternAtoO {

	public static void main(String[] args)
	{
		char ch='A';
		for(char i=1;i<=5;i++)  //i='A';i<='E';i++ we can write this also
		{						//'A'=1 to 'E'=5
			for(char j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
