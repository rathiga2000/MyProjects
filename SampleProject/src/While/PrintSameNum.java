package While;
//100 print 10 times

public class PrintSameNum {
	

	   public static void main(String args[])
	   {
	    PrintSameNum obj=new PrintSameNum();
	    obj.Num(100);
	    }
	    public void Num(int a)
	    {
	       int count= 0;
	       
	   while (count<10) 
	    {
	    System.out.println(a);
	    count++;
	    }
	    }
	}

