package Fibonacci;
public class Fibonacci 
{
      public static void main(String  arg[])	
   	  {
	   Fibonacci obj=new Fibonacci();
	   obj.series(10);
   	  	}
      	public void series(int i)
      	{
    	int first = 0; 
    	int second = 1;
    	int count=1;
    	System.out.println("The Fibonacci First 10 Value is:");
         while(count<=i)
         {
             System.out.println(first+" ");
             int value= first + second;
             first = second;
             second= value;
             count++;
         	}
      		}
 }