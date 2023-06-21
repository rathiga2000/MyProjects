package String;

public class FirstRepeative {

	public static void main(String[] args) {
		FirstRepeative obj = new FirstRepeative();
		obj.repeative();
		obj.non_repeative();

	}

	public void repeative() {
		String s = "i am brilliant student";
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j) && s.charAt(i) != ' ') {
					System.out.println("The first repeated character in String is:" + s.charAt(i));
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}

	}

	public void non_repeative() {
		String arr = "aeema";

		for (int i = 0; i < arr.length() - 1; i++) {
			int count = 0;

			for (int j = 0; j < arr.length(); j++) {
				if (arr.charAt(i) == arr.charAt(j) && arr.charAt(i) != ' ') {
					count++;

				}
			}
			if (count == 1) {
				System.out.println("The first non repeated character in String is: " + arr.charAt(i));
				break;
			}
		}

	}
}
