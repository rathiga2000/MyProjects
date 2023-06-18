package String;

public class StringVowels {

	public static void main(String[] args) {
		StringVowels obj = new StringVowels();
		obj.vowels();
		obj.num();
		obj.reverse();
		obj.change();
	}

	public void vowels() {// aeiou
		String s = "India is my country,all indian my brother";
		int count = 0;
		System.out.println("Vowels Value in the String");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count++;

				System.out.print(s.charAt(i));
			}
		}

		System.out.println();
		System.out.println();
		System.out.println("count of string value: " + count);

	}

	public void num() {
		String s = "Ravi Age of 34";
		System.out.println();
		System.out.println("print the number");
		for (int i = 0; i < s.length(); i++) {
			int num = s.charAt(i);

			if ((int) s.charAt(i) <= 57 && (int) s.charAt(i) >= 48) {
				System.out.print(s.charAt(i));
			}
		}

	}

	public void reverse() {
		System.out.println();

		String s = "I love india";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("reversed value is : " + rev);
		if (s.equals(rev)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}

	}
	public void change()
	{
		String a1="This is Science Department";
		String s1=a1.replaceFirst("i", "a");
		String s2=a1.replace("Science", "Maths");
		String s3=a1.replace("e", "r");
		String s5=a1.replace("is","ty");
		String s4=a1.replaceAll("i","t");
		System.out.println(a1);
		System.out.println(s1);	
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
		
}