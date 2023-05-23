package test;

public class Based {
	int a=5;
	void step1()
	{
	a=a+5;
		System.out.println(a);
	}
	void step2()
	
	{
		a=a+6;
		System.out.println(a);
	}

public static void main(String args[])
{
Based s=new Based();
System.out.println(s.a);
s.step1();
s.step2();
s.a=25;
System.out.println(s.a);
s.step1();
s.step2();
}
}
