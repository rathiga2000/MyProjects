package While;

public class SumOfOddNum {
	    public static void main(String args[])   
	    {  
	    SumOfOddNum obj=new SumOfOddNum();
	    obj.Sum(10);
	    }
	    public void Sum(int num)
	    {
	    int count=1;
	    int sum=0;
	    while(count<=num)  
	    {  
	    if(count%2==1)
	   {
	    sum=sum+count;
	   }
	    count++;  
	    }  
	       
	    System.out.println("Sum of Odd Numbers is= " + sum);  
	    }  
	}



