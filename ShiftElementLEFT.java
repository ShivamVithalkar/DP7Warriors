package BasicArrayLAB;
import java.util.Arrays;

//Important for interview
public class ShiftElementLEFT
{
	static void shifteleLeft(int ar[])
	{ 
		int temp[]=new int[ar.length];
		int count=0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				temp[count]=ar[i];
				count++;	
			}
		}
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=0)
			{
				temp[count]=ar[i];
				count++;
			}
		}
		System.out.println("Left Shifting: "+Arrays.toString(temp));
	}	
	
		static void shiftEleRight1(int ar[])
		{
			int count=0;
			int temp[]=new int[ar.length];
			
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]!=0)
				{
					temp[count]=ar[i];
					count++;
				}
			}
			System.out.println("Right Shifting: "+Arrays.toString(temp));
		}

	public static void main(String[] args) 
	{
		int arr[]= {1,0,2,0,3};
		shifteleLeft(arr);
		shiftEleRight1(arr);
	}

}
