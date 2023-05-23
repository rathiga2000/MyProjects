package While;

public class ReverseEvenNum {
	

	   public static void main(String args[])
	   {
	    ReverseEvenNum obj=new ReverseEvenNum();
	    obj.Check(10);
	    }
	    public void Check(int Num)
	    {
	       int count=0;
	       
	   while (count<5) 
	    {
	    System.out.println(Num);
	    Num=Num-2;
	    count++;
	    }
	    }
	}


