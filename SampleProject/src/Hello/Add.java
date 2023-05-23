package Hello;
import java.util.Scanner;

public class Add {
	
	void add(int a, int b)
	{
		System.out.println(a+b);
		
	}
public static void main(String arg[])
{
	Add obj=new Add();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the a value");
	int a=s.nextInt();
	System.out.println("Enter the b value");
	int b=s.nextInt();
	System.out.println("total add value");
		obj.add(a, b);	
}
}
