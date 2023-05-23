package SimpleProgram;

public class Calculator {
	
	
	    public static void main(String args[])
	      {
	      Calculator casio=new Calculator();
	      casio.add(6,7);
	      casio.add(4,5);
	      casio.add(3,4);
	        casio.shutdown();
	       
	      }
	//non parameterised without return type
	public void shutdown()
	{
	System.out.println("Shutdown");
	}
	//the method parameterised without return type
	// it is used to two integer number
	    public void add(int first,int second)
	     {
	    int total=first+second;
	    System. out.println("The Sum Value is:" +total);
	    }
	//the method parameterised with return type
	//public int sub(int first, int second)
	//{
	//int sum=first-second;
	//System.out.println("the sum value is"+sum);
	//return sum;
	//}
	}



