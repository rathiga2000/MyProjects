package ForLoop;



public class Factors {
	public static void main(String args[])
	{
	Factors obj=new Factors();
	obj.PrimeFact(50);
	}
	public void PrimeFact(int num)
	    {
	 
	    
	    for(int count=1;num>count;count++)
	    {
	    
	    if(num%count==0)
	    {
	    System.out.println(count);
	    }
	    
	    }
	    }   
	}

	





