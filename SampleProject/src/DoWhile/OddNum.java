package DoWhile;

public class OddNum {
	public static void main(String args[]) {
		OddNum obj = new OddNum();
		obj.Number(1);
	}

	public void Number(int i) {
		do {

			System.out.println(i);
			i = i + 2;
		}

		while (i <= 20);

	}
}
