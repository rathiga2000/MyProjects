package MyProgram;

public class KiloMeter {
	public static void main(String arg[])
	{
		KiloMeter obj=new KiloMeter();
		obj.kiloMeter(4.5);
	}
	public void kiloMeter(double kilo)
	{

	  double meter=kilo*1000;
        System.out.println("Given Kilo Meter:" +kilo);
	    System.out.println("Kilo Meter to Meter: "+meter);
	 
	 }

}
