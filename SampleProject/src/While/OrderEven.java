package While;
import java.util.Scanner;
public class OrderEven {
	public static void main(String args[])
	   {
		
	    OrderEven obj=new OrderEven();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the value is:");
	    int Num=sc.nextInt();
	    System.out.println("Print the even value:");
	    obj.Call(Num);
	    }
	    public void Call(int Num)
	    {
	       int count= 0;
	   while (count<5) 
	    {
	    System.out.println(Num);
	    Num=Num+2;
	    count++;
	    }
	    }
	}


