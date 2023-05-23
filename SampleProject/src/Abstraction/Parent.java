package Abstraction;

public class Parent {
	
	//constructor use
	Parent()
	{
		System.out.println("Parent Constructor");
	}
	Parent(int n)
	{ 
		this();
		System.out.println("Single parameter Parent constructor");
	}
	 static  void eat()
	{
		System.out.println("non veg");
		
	}
	void ambition()
	{
		System.out.println("doctor");
	}

}
