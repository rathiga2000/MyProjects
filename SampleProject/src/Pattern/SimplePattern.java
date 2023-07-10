package Pattern;

public class SimplePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplePattern obj=new SimplePattern();
		obj.zero();
		obj.right();
		
	}
	public void zero()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i%2==0)
				{
					System.out.print(0);
				}
				else
				{
					System.out.print(1);
				} 
			}
			System.out.println();
		}
	System.out.println("zero one pattern");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(j%2==0)
			//if((i+j)%2==0)
			{
				System.out.print(1);
			}
			else
			{
				System.out.print(0);
			} 
		}
		System.out.println();
	}
}
	public void right()
	{  
		for(int i=1;i<=5;i++)
		{
			for(int j=5-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
		
		System.out.println();
	}
		System.out.println("right reverse");
		for(int i=5;i>=1;i--)
		{ 
			for(int j=5-1;j>=i;j--)
		{
			System.out.print(" ");
			
		}
			for(int k=1;k<=i;k++)
				
			{
				System.out.print(k);
				}
			System.out.println();
			}
	}
	public void num()
	{
		
	}
}

