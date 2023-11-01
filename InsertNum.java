package BasicArrayLAB;
import java.util.Arrays;
import java.util.Scanner;

//insert element at specific position and replace that num
public class InsertNum 
{
	static void insertElement(int ar[],int new_value,int pos,int size)
	{
		for(int i=size-1;i>=pos;i--)
		{
			ar[i+1]=ar[i];
		}
		System.out.println(Arrays.toString(ar));
		ar[pos]=new_value;
		size++;
		
	}

	public static void main(String[] args) 
	{
		int arr[]=new int[6];
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter num:");
			arr[i]=sc.nextInt();
		}
		insertElement(arr,3,100,size);
	}

}
