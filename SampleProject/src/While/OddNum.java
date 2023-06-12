package While;

import java.util.Scanner;

public class OddNum {
	
	    public static void main(String args[])
	    {
	    OddNum obj=new OddNum();
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter the number");
	    int num=s.nextInt();
	    System.out.println("Odd Number");
	    obj.Number(num);
	    }
	    public void Number(int num)
	    {
	    	int i=1;
	    
	    while(i<=num)
	    {
	    if(i%2==1)
	    {
	    System.out.println(i);
	    }
	    i++;
	    }
	    }   
	}



