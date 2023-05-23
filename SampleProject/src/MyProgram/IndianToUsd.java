package MyProgram;

public class IndianToUsd {
	public static void main(String arg[])
	{
		IndianToUsd obj=new IndianToUsd();
		obj.Indian(45);
	}


public void Indian(int inr)
{
double USD=0.012*inr;
    
    System.out.println("Given The INR Amount "+ inr);
    System.out.println("INR to USD is convert to amount "+ USD);
}
}
