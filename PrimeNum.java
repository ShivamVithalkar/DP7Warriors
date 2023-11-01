package BasicArrayLAB;

import java.util.Arrays;

public class PrimeNum
{
	static void primeNum(int ar[])
	{	
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			boolean status=true;
			for(int j=2;j<ar[i];j++)
			{
				if(ar[i]%j==0)
				{
					status = false;
				}	
			}
			if(status)
			{
				System.out.println(ar[i]);
				sum=sum+ar[i];
			}
		}	
		System.out.println("Sum of prime number :"+sum);
	}
	
	public static void main(String[] args)
	{
		int arr[]= {4,2,3,5,7,9};
		System.out.println("Original array :"+Arrays.toString(arr));
		System.out.println("\nPrime number are:");
		primeNum(arr);
		
		
	}

}
