package ForLoop;


public class SumOfOddNum {
	
	    public static void main(String args[])   
	    {  
	    SumOfOddNum obj=new SumOfOddNum();
	    obj.Sum(10);
	    }
	    public void Sum(int num)
	    {
	    
	    int sum=0;
	    for(int count=1;count<=num;count++)
	    
	    {  
	    if(count%2==1)
	   {
	    sum=sum+count;
	   }
	    
	    }  
	       
	    System.out.println("Sum of Odd Numbers is= " + sum);  
	    }  
	}




