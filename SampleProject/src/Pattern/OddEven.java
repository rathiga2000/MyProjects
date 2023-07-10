package Pattern;

public class OddEven {

	public static void main(String[] args) {
		OddEven obj=new OddEven();
		obj.num();
		obj.print();
				
	}
	public void num()
	{
		for(int i=1;i<=4;i++)
		{
			
			int a=1;
			int b=2;
			for(int j=1;j<=i;j++)
			{ 
				
				if(i%2==1)
				{
					System.out.print(a);
					a=a+1;

				}
				else if(i%2==0)
				{
					System.out.print(b);
					b=b+2;
				}
			}
				System.out.println();
		}
				
}
	public void print()
	{
		int a=0;

		for(int i=1;i<=3;i++)
		{

			for(int k=2;k<=i;k++)
			{
				System.out.print("+");
			}

			for(int j=1;j<=i;j++)
			{
				System.out.print(a);
				a++;
			}
		
	
		System.out.println();
		}
	}
}
	

	