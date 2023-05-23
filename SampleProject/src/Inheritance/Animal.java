package Inheritance;

class Animal {
	void eat()
	{
	System.out.println("it is eating");
}
void sleep()
{
	System.out.println("it is sleeping");

}
}
class Dog extends Animal
{
	public static void main(String arg[])
	{
		Dog obj=new Dog();
		obj.eat();
		obj.sleep();
	}
}
