package Abstraction;

public class CityPerson extends Human{
	void eat()
	{
		System.out.println("Eat Veg Only");
	}
	void play()
	{
		System.out.println("Play free time");
	}
public static void main(String arg[])
{
	Human Priya=new CityPerson();
			Priya.eat();
			Priya.sleep();
			Priya.play();
}
}
