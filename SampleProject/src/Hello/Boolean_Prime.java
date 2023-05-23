package Hello;

public class Boolean_Prime 
{
	public static void main(String arg[]) 
	{
		Boolean_Prime obj = new Boolean_Prime();
		obj.Number(10);
		obj.Number(5);
	}
    public void Number(int n) 
	{
		boolean flag = false;
		int i = 2;
		while (i < n / 2) 
		{
			if (n % i == 0) 
			{
				flag = true;
				break;
			}
			i++;
		}
		if (flag == true) 
		{
			System.out.println("It is not a prime");

		} else 
		{
			System.out.println("It is a prime");
		}
	}
}
