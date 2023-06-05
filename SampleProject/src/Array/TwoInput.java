package Array;

import java.util.Scanner;

public class TwoInput {
	static int a[];
	static int b[];
	static int size;
	static int size1;
	public static void main(String arg[])
	{
		doubleValue();
	}


static int[] doubleValue()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of  a array");
    size=sc.nextInt();
	System.out.println("Enter size of  b array");

	 size1=sc.nextInt();
	 a=new int[size];
	 b=new int[size1];
			System.out.println("enter the array value of a");
     for(int i=0;i<a.length;i++)
     {
    	 
    	 a[i]=sc.nextInt();
			
		
			}
		System.out.println("enter the array value of b");

     for(int j=0;j<b.length;j++)
     {
    	 b[j]=sc.nextInt();
     }
     System.out.println("Display the a array");
     for(int i=0;i<a.length;i++)
     {
    	 System.out.print(a[i]+" ");
     }
     System.out.println();
     System.out.println("Display the b array");

     for(int j=0;j<b.length;j++)
     {
    	 System.out.print(b[j]+" ");
     }
      return b;
}
}