package BasicArrayLAB;

public class Additionfirstlast 
{
	static void addition(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length/2;i++)
		{
			 sum=ar[i]+ar[ar.length-i-1];
			 System.out.println("Sum :"+sum);
		}
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,6,7};
		addition(arr);
	}
}

//1+4=7
//2+3=7
//7+1=8
          

