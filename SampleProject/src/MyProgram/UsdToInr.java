package MyProgram;

public class UsdToInr {
	public static void main(String arg[])
	{
		UsdToInr obj=new UsdToInr();
		obj.Dollar(0.35);
	}


public void Dollar(double usd)
{
double inr=82.76*usd;
    
    System.out.println("Given The USD Amount "+ usd);
    System.out.println("USD to INR is convert to amount "+ inr);
}
}