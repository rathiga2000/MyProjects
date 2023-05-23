package Hello;

public class SecondPro extends FirstPro {
//	void print()
//	{
//		System.out.println("bye");
//	}
	double getPi()
	{
		return pi;

}


public static void main(String args[])
{
	SecondPro obj=new SecondPro();
	obj.print();
	System.out.println(obj.getPi());
	System.out.println(pi);
}
}
