package Pattern;

public class Alpha {
	public static void main(String arg[])
	{
		Alpha obj=new Alpha();
	    obj.Value();
	}
	public void Value()
	{
		char letter='a';
		int row=1;
		while(row<=4)
		{
			int col=1;
			while(col<=4)
				{
				System.out.print(letter+" ");
				col++;
				}
			letter++;
			row++;
System.out.println();
}
	}

}