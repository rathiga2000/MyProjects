package While;

public class SumOfDigit
{
	    public static void main(String args[])
	    {
	    SumOfDigit obj=new SumOfDigit();
	    obj.add(321);
	    
	    }
	    public void add(int n)
	    {
	    int i=n;
	    int count=0;
	    System.out.println("Given Number: " +n);
	    while(n>0)
	    {
	    int a=n%10;
	    count=count+a;
	    n=n/10;
	    }
	System.out.println("Sum value: " +count);
	    }
	}


