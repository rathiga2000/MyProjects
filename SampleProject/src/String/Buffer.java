package String;

public class Buffer {

	public static void main(String[] args) {
		byte data[] = { 82, 65, 84, 72, 73, 71, 65 };
		String str = new String(data);
		char value[] = { 'a', 'b', 'c' };
		String obj = new String(value);
		System.out.println("Byte Value is");
		System.out.println(str);
		System.out.println("Char value is ");
		System.out.println(obj);

		String num = "765";

		int a = 5;
		int b = 25;
		String age = "15";
		System.out.println(age + a + b);// String value and int value Join the output value
		System.out.println(age + (a + b));// String value and int value add tha int value the output value

		String sc = new String("Welcome");
		System.out.println(sc);
		String name = "Student";// It doesn't create a new instance
		System.out.println(name);
		System.out.println(num);


	}
}
