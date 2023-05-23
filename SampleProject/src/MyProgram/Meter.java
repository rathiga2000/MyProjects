package MyProgram;

public class Meter {
	public static void main(String arg[])
	{
		Meter obj=new Meter();
		obj.kiloMeter(3456);
	}
	public void kiloMeter(double meter)
	{

	  double kiloMeter=meter/1000;
System.out.println("Giver Meter:" +meter);
	    System.out.println("Kilo Meter to Meter: "+kiloMeter);
	 
	 }

}
