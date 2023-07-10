package Pattern;

public class Space {
	public static void main(String arg[])
	
	{
	Space obj=new Space();
	obj.star();

}
	void star()
	{
		for(int i=1;i<=5;i++)
		{
			for (int j=1;j<=5;j++)
			{
				if((j==1||j==5)||(i==1||i==5))
					System.out.print("*" +" ");
				else
					System.out.print(" " +" ");
				
			}
			System.out.println();
		}
	}
}