package Static;

public class Aadhar {
	 int age;
	String name;
	 long number;
	final static String Nationality="Indian";
	Aadhar()
	{
		System.out.println(Nationality);
	}
	Aadhar(int age, String name, long number)
	{
		this.age=age;
		this.name=name;
		this.number=number;
		}
    int getAge()
	{
		return age;
	}
	String getName()
	{
		return name;
		}
	long getNumber()
	{
	return number;
	}
	void display()
	{
System.out.println("Age: " +getAge()+ " Name: "+getName()+ " Number: " +getNumber()+ " Nationality: "+Nationality);
	}
	public static void main(String arg[])
	{
		Aadhar c1=new Aadhar(23,"Rathiga",234567);
		c1.display();
	}

}