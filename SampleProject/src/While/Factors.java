package While;

public class Factors {
	
	public static void main(String args[])
	{
	Factors obj=new Factors();
	obj.PrimeFact(50);
	}
	public void PrimeFact(int num)
	    {
	 {
	    int count=1;
	    while(num>count)
	    {
	    if(num%count==0)
	    {
	    System.out.println(count);
	    }
	    count++;
	    }
	    }   
	}

	}


