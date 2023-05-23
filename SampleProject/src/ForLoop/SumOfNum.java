package ForLoop;



public class SumOfNum {
	
		
	    public static void main(String[] args)   
	    {  
	    SumOfNum obj=new SumOfNum();
	    obj.Sum(10);
	    }
	    public void Sum(int num)
	    {
	    int sum=0;
	    for(int count=1;count<=num;count++)
	    {
	    
	    sum = sum+count;  
	    }  
	    System.out.println("Sum of Natural number is= " +sum);  
	    }  
	}   


