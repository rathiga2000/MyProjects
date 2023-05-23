package While;

public class OrderEven {
	public static void main(String args[])
	   {
	    OrderEven obj=new OrderEven();
	    obj.Call();
	    }
	    public void Call()
	    {
	       int count= 0;
	       int Num=2;
	   while (count<5) 
	    {
	    System.out.println(Num);
	    Num=Num+2;
	    count++;
	    }
	    }
	}


