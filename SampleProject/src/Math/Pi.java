package Math;
import java.util.Scanner;
public class Pi {
	public static void main(String arg[])
	{
		System.out.println(Math.PI);
		System.out.println("Enter the radius value");
		Scanner sc=new Scanner(System.in);
		double radius=sc.nextDouble();
		System.out.println(areaOfCircle(radius));
	}


public static double areaOfCircle(double radius)
{
	double a=Math.PI*radius*radius;
	return a;
}
}