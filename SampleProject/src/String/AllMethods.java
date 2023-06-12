package String;

public class AllMethods {

	public static void main(String[] args) {
		AllMethods obj = new AllMethods();
		obj.value();
		obj.ascii();
		obj.cut();
		obj.concat();
		obj.split();
	}

	public void value() {
		String s = "Welcome to my Home";

		System.out.println("String of length");
		s.length();
		// public int length() no parameter
		System.out.println(s.length());
		System.out.println("Print split a char");
		for (int i = 0; i < s.length(); i++) {
			// public char charAt(int i)
			System.out.println(s.charAt(i));

		}
		System.out.println("lower case value");
		String lower = s.toLowerCase();
		System.out.println(lower);
		System.out.println("upper case value");
		String upper = s.toUpperCase();
		System.out.println(upper);
	}

	public void ascii() {
		System.out.println("a ascii number");
		char c = 'a';
		int a = c;
		System.out.println(a);
		System.out.println("100 ascii char");
		int num = 100;
		char n = (char) num;
		System.out.println(n);
	}

	public void cut() {
		System.out.println("Give String length");
		String s = "   Hi and Welcome   ";
		System.out.println(s.length());
		System.out.println("Ater Trim value");
		String afterTrim = s.trim();
		System.out.println(afterTrim.length());
		System.out.println(afterTrim);
	}

	public void concat() {
		String first = "Mango";
		// first=first+"Apple";
		first = first.concat(" Apple ").concat(" Guava ").concat(" orange ");
		// first=first.concat("Guava");
		System.out.println(first);
	}

	public void split() {
		String s = "India";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			int n = s.charAt(i);
			sum = sum + n;
		
//	System.out.println("sum of value");
//	System.out.println(sum);
			System.out.println((char)n + " Ascii value " + n);
		}
			System.out.println("sum of value");
			System.out.println(sum);

		}
	
}