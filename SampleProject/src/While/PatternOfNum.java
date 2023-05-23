package While;

public class PatternOfNum {
	
	    public static void main(String arg[])
	    {   
	    PatternOfNum obj=new PatternOfNum();
	    System.out.println("Print in number of 1 to 5 in row");
	    obj.Order();
	    System.out.println("print in number of 1 to 3 in row");
	    obj.Value();
	    System.out.println("print in Revrse number of 5 to 1 in row");
	    obj.Rever();

	    }
	    public void Order()
	    {
	    int row=1;
	    while(row<4)
	    {
	    int col=1;
	    while(col<6)
	    {
	    System.out.print(col+" ");
	    col++;
	    }
	    row++;
	    System.out.println("");
	    }
	    }
	    
	    public void Value()
	    {
	    int row=1;
	    while(row<6)
	    {
	    int col=1;
	    while(col<4)
	    {
	System.out.print(col+" ");
	    col++;
	    }
	    row++;
	   System.out.println();
	}
	    }
	 public void Rever()
	    {
	int row=1;
	while(row<4)
	{
	int col=5;
	while(col>=1)
	{
	System.out.print(col+" ");
	col--;
	}
	row++;
	System.out.println();
	}
	}
	}


