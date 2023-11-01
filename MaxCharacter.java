package BasicArrayLAB;

//wap find max digit and min digit in array using ascii value

public class MaxCharacter 
{
	static void findChar(char ch[])
	{
		char max=Character.MIN_VALUE;
		char min=Character.MAX_VALUE;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>max)
			{
				max=(char) ch[i];	
			}
		}
		System.out.println("Max digit is:"+max);
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]<min)
			{
				min=(char)ch[i];
			}
		}
		System.out.println("Min digit is :"+min);
		
	}
	public static void main(String[] args) 
	{
		char ch[]= {'s','h','i','v','a','m'};
		findChar(ch);
		//here v has max ascii value and a has low
	}
}
