package While;

public class SumOfNum {
	
	    public static void main(String[] args)   
	    {  
	    SumOfNum obj=new SumOfNum();
	    obj.Sum(10);
	    }
	    public void Sum(int num)
	    {
	    int count=1;
	    int sum=0;
	    while(count<=num)  
	    {  
	    sum = sum+count;  
	    count++;      
	    }  
	    System.out.println("Sum of Natural number is= " +sum);  
	    }  
	}   

