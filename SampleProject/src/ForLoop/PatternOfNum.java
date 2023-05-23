package ForLoop;


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
		    	for(int row=1;row<4;row++)
		    	{
		   for(int col=1;col<6;col++)
		    
		    {
		    System.out.print(col+" ");
		    }
		    System.out.println("");
		    }
		    }
		    
		    public void Value()
		    {
		    	for(int row=1;row<6;row++)
		    	{
		    		for(int col=1;col<4;col++)
		    	
		    {
		System.out.print(col+" ");
		    }
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





