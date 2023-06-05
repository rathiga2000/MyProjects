package Array;


public class Smallest extends Input{
	

	public static void main(String arg[])
	{
		value();
		
min();
}
static void min()
{
	
	int min=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++)
	{
	if(min>arr[i])
	{
		min=arr[i];
	}
	}
	
	System.out.println();
		System.out.print("minimum number: " +min);

		int second_min=Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
			second_min=min;
				min=arr[i];
			}
			if(second_min>arr[i]  && arr[i]!=min)
			{
				second_min=arr[i];
			}
		}
		System.out.println();
		System.out.println("second min numver: " +second_min);
	}
	}
