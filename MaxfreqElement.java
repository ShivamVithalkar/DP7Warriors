package BasicArrayLAB;

public class MaxfreqElement 
{
	static void findfreq(int arr[])
	{
		boolean visited=false;
		int count;
		int element=0;
		int maxfreq=0;
	
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			visited=false;
			for(int j=i-1;j>=0;j--)
			{
				if(arr[i]==arr[j])
				{
					visited=true;
					break;
				}
			}
			if(visited==false)
			{
				for(int k=i+1;k<arr.length;k++)
				{
					if(arr[i]==arr[k])
					{
						count++;
					}	
				}
			}
			if(count>maxfreq)
			{
				maxfreq=count;
				element=arr[i];
				
			}
			System.out.println("Num :"+arr[i]+" count-->"+count);
		}	
		System.out.println("Maximum frequency:"+element+"--"+maxfreq);
		
	}
	public static void main(String[] args)
	{
		int arr[]= {1,2,2,3};  //if two element repeat then this logic not work
								//for this we need array(1,2,2,3,3,4,4)
		findfreq(arr);
	}
}
