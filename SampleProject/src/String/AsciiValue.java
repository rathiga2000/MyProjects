package String;

public class AsciiValue {

	public static void main(String[] args) {
		AsciiValue obj = new AsciiValue();
		obj.upper();
		obj.lower();
		obj.number();
	}

	public void upper() {
		System.out.println("UpperCase Ascii Values");
		for (char i = 'A'; i <= 'Z'; i++) {

			System.out.println(i + " Ascii Value " + (int) i);
		}
	}

	public void lower() {
		System.out.println();
		System.out.println("LowerCase Ascii Values");
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(i + " Ascii Value " + (int) i);
		}
	}

	public void number() {
		System.out.println();
		System.out.println("Numbers Ascii Values");
		for (char i = '0'; i <= '9'; i++) {

			System.out.println(i + " Ascii Value " + (int) i);

		}
	}
	
}
