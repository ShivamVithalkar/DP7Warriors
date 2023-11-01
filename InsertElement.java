package BasicArrayLAB;
import java.util.Arrays;
import java.util.Scanner;

public class InsertElement 
{
	static void insertEle(int ar[],int index,int value)
	{
		for(int i=ar.length-1;i>index;i--)
		{
			ar[i]=ar[i-1];
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
	public static void main(String[] args) 
	{
		int arr[]=new int[6];
		Scanner sc=new Scanner(System.in);
			
		for(int i=0;i<5;i++)
		{	
			System.out.println("Enter num:");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Original :"+Arrays.toString(arr));
		insertEle(arr,2,100);
		System.out.println("After inserting: "+Arrays.toString(arr));	
	}
}
