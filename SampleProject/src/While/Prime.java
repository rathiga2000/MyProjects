package While;

public class Prime {
	
	     public static void main(String args[])
	    {
	    Prime object=new Prime();
	    object.Print_Number(16);
	    object.Print_Number(3);
	    }
	    public void Print_Number(int value)
	    {
	    
	    int i=1;
	    int count=0;
	    while(i<=value)
	    {
	    if(value%i==0)
	    {
	     count++;
	     }
	    i++;
	    }
	  if(count==2)
	    {
	   System.out.println(value+" is prime number");      
	    }
	    else
	    {
	   System.out.println(value+" is not prime number");      
	     }
	    }
	}


