package While;
import java.util.Scanner;
public class SumOfDigit
{
	    public static void main(String args[])
	    {
	    SumOfDigit obj=new SumOfDigit();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Number:");
int n=sc.nextInt();
	    obj.add(n);
	    
	    }
	    public void add(int n)
	    {
	    int i=n;
	    int count=0;
	    while(n>0)
	    {
	    int a=n%10;
	    count=count+a;
	    n=n/10;
	    }
	System.out.println("Sum of Digit: " +count);
	    }
	}


