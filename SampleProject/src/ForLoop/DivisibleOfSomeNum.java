package ForLoop;

//print the number divisible by 9 between 300 to 200;

public class DivisibleOfSomeNum {
	
	    public static void main(String args[])
	    {
	    DivisibleOfSomeNum obj=new DivisibleOfSomeNum();
	    obj.Sum_Value(300);
	    }
	    public void Sum_Value(int count)
	    {
	   for(;count>=200;count--)
	   
	    {
	    if(count%9==0)
	    {
	    System.out.println(count);
	    }
	    
	    }
	    }   
}



