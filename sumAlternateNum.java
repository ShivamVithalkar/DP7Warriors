package BasicArrayLAB;
import java.util.Arrays;
import java.util.Scanner;
//WAP to make sum of alternate number in array

public class sumAlternateNum
{
	static void randomNum(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			if(i%2==0)
			{
				sum=sum+ar[i];
			}
		}
		System.out.println("Original array :"+Arrays.toString(ar));
		System.out.println("Sum of Alternate number :"+sum);
}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter num:");
			arr[i]=sc.nextInt();
		}  
		randomNum(arr);
		//System.out.println(Arrays.toString(arr));
	}
}
