package Pattern;

public class Space {
	public static void main(String arg[])
	
	{
	Space obj=new Space();
	obj.star();

}
	void star()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++)
			{
				if((j==1||j==n)||(i==1||i==n))
					System.out.print("*" +" ");
				else
					System.out.print(" " +" ");
				
			}
			System.out.println();
		}
	}
}