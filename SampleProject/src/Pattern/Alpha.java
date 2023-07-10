package Pattern;

public class Alpha {
	public static void main(String arg[]) {
		Alpha obj = new Alpha();
		obj.Value();
	}
//a a a a
//b b b b
//c c c c
//d d d d
	public void Value() {
		char s = 'a';

		for (int row = 1; row <= 4; row++) {

			for (int col = 1; col <= 4; col++) {
				System.out.print(s + " ");

			}
			System.out.println();

			s++;
		}

	}
}