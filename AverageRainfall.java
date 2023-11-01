package BasicArrayLAB;
import java.util.Arrays;
import java.util.Scanner;
//Wap find average rainfall in week

public class AverageRainfall 
{
	static void avgRainfall(int arr[])
	{
		float sum=0;
		float avg;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
		}
		avg=sum/arr.length;	
		System.out.println("Average rainfall:"+avg);
	}

	public static void main(String[] args) 
	{
		//int arr[]= {100,50,150,200,300}
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter rainfall:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] =sc.nextInt();
		}
		avgRainfall(arr);
		System.out.println(Arrays.toString(arr));	
	}
}




//size-sc.next();
//int arr[]=new int[size];