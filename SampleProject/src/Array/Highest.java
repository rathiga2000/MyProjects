package Array;
public class Highest extends Input
{
public static void main(String args[])
{
	value();
	high();
}


static void high()
{

	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++)
	{
	if(max<arr[i])
	{
		max=arr[i];
	}
	}
	System.out.println();
		System.out.print("maximum number: " +max);

	
	int second_max=Integer.MIN_VALUE;

	for(int i=0;i<arr.length;i++)
	{
		if(max<arr[i])
		{
		second_max=max;
			max=arr[i];
		}
		if(second_max<arr[i]  && arr[i]!=max)
		{
			second_max=arr[i];
		}
	}
	System.out.println();
	System.out.println("second max number: " +second_max);
}
}

