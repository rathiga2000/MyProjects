package ForLoop;

public class NumOfCount {
	public static void main(String args[]) {
		NumOfCount obj = new NumOfCount();
		obj.Sum_Value();
	}

	public void Sum_Value() {

		int Nine_Divi = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 9 == 0) {
				Nine_Divi++;
			}

		}
		System.out.println(Nine_Divi);
	}
}
