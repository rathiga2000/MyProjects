package While;
import java.util.Scanner;
public class ReverseEvenNum {
	

	   public static void main(String args[])
	   {
	    ReverseEvenNum obj=new ReverseEvenNum();
		   Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int Num=sc.nextInt();
System.out.println("Reverse of even number");
	    obj.Check(Num);
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


