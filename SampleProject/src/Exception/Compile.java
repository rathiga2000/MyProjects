package Exception;
import java.util.Scanner;
public class Compile {

	public static void main(String[] args) {
		Compile obj=new Compile();
		obj.add();
		obj.value();
		obj.num();
obj.bounds();

	}
	public void add()
	{
	
		System.out.println("Arithmetic Exception Handling:");
	 try{  
		 
	      int a=5;
	      int b=0;
	      System.out.println(a/b);
	   }
	 catch(ArithmeticException e)
	 {
		 
	   System.out.println("not divid zero");  
	  }  

	}
	public void value()
	{
		try {
		String s=null;  
		System.out.println(s.length());
	}
		catch(NullPointerException e)
		{
			System.out.println("not enter the null value");
		}
}
	public void num()
	{
		try {
		String s="abc";  
		int i=Integer.parseInt(s);
	}
		catch(NumberFormatException e)
		{
			System.out.println("wrong number format");
		}
	}
	public void bounds()
	{
		try {
		int a[]=new int[5];  
		a[10]=50;
	}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("error of index");
		}
		
}
	
}