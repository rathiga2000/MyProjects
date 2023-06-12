package While;
//100 print 10 times
import java.util.Scanner;
public class PrintSameNum {
	

	   public static void main(String args[])
	   {	    
		   PrintSameNum obj=new PrintSameNum();
          Scanner sc=new Scanner(System.in);
		   System.out.println("Enter The Value is:");
		   int Num=sc.nextInt();
	    obj.Num(Num);
	    }
	    public void Num(int a)
	    {
	       int count= 0;
	       System.out.println("Print the Same value is: ");
	   while (count<10) 
	    {
	    System.out.println(a);
	    count++;
	    }
	    }
	}

