package BasicArrayLAB;

import java.util.Arrays;

public class EvenOdd2 
{
	int temp;
	int count=0;
	static void Arrange(int ar[])
	{
		int count=0;
		int temp ;
		for(int i=0;i<ar.length;i++)
		{
			if(i%2==0)
			{
				temp=ar[i];
				ar[i]=count;
				temp=count;
				count++;
			}
		}
		//System.out.println("Arrange num :"+);
	}

	public static void main(String[] args)
	{
		int arr[]= {2,3,9,6,7};
		
		System.out.println(Arrays.toString(arr));

	}

}
