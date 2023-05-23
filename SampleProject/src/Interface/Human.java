package Interface;

public class Human implements Mammel {
	public void  eat()
	{
		System.out.println("eat maximum 3 times");
	}
	public void sleep()
	{
		System.out.println("maximum sleep 8hr");
	}
	public static void main(String args[])
	{
		Mammel obj=new Human();
		obj.eat();
		obj.sleep();
	}
}
