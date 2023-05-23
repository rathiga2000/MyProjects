package Abstraction;

public class Child extends Parent{
	Child()
	{
		super(5);
		System.out.println("Child Constrctor");
	}
	Child(int n)
	{
		this();
		
		System.out.println("Single parameter Child constructor");
	}
	void ambition()
	{
		System.out.println("Engineer");
	}
	static void eat() 
	{
		System.out.println("veg");
	}
	void play()
	{
		System.out.println("online Game");
	}
public static void main(String arg[])
{
	Parent obj=new Child(9);
	obj.ambition();
	obj.eat();   
	//obj.play();
}
}
