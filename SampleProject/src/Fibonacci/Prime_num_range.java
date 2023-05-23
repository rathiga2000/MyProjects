package Fibonacci;
public class Prime_num_range 
{
	public static void main(String arg[]) 
	{
		Prime_num_range obj = new Prime_num_range();
		obj.Range();
	}
	public void Range() 
	{
		int count = 0;
		int prime = 2;
		int num = 15;
		while (count < num) 
		{
			int div = 0;
			int i = 1;
			while (i <= prime) 
			{
				if (prime % i == 0) 
				{
					div++;
				}
				i++;
			}
			if (div == 2) 
			{
				System.out.println(prime);
				count++;
			}
			prime++;
		}
		}
}
