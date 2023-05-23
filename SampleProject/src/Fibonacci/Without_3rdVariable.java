package Fibonacci;
public class Without_3rdVariable
{
      public static void main(String  arg[])	
   	  {
	   Without_3rdVariable obj=new Without_3rdVariable();
	   obj.Variable(10);
   	  	}
      	public void Variable(int n)
      	{
    	int first = 0; 
    	int second = 1;
    	if(n>=1)
    	{
    		System.out.println(first);
    	}
    	if(n>1)
    	{
    		System.out.println(second);
    	}
    	int count=3;
    	while(n>=count)
    	{
    		System.out.println(first + second);
    		second=first+second;
    		first=second-first;
    		count++;
    	}
      	}
}
    	