package ForLoop;

public class OddNum {

	public static void main(String args[]) {
		OddNum obj = new OddNum();
		obj.Number();
	}

	public void Number() {

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}

		}
	}
}
