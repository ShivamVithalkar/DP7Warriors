package BasicArrayLAB;
import java.util.Arrays;

public class EvenOddArrange
{
	static void Arrange(int ar[])
	{
		int count=0;
		int temp[]=new int[ar.length];   //empty array
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)    //check even 
			{
				temp[count]=ar[i];
				count++;
			}
		}
		
		for(int j=0;j<ar.length;j++)
		{
			if(ar[j]%2!=0)    //check odd 
			{
				temp[count]=ar[j];
				count++;
			}
		}
		System.out.println("After Arrange :"+Arrays.toString(temp));
	}

	public static void main(String[] args) 
	{
		int arr[]= {1,3,4,11,2,9,7,77,10};
		Arrange(arr);
		System.out.println("\nBefore arrange:"+Arrays.toString(arr));
	}

}
