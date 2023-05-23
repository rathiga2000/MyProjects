package DoWhile;

public class ReverseNumber {

	public static void main(String args[]) {
		ReverseNumber obj = new ReverseNumber();
		obj.Back_Num(10);
	}

	public void Back_Num(int num) {
		do {
			System.out.println(num);
			num--;
		}

		while (num >= 1);
	}
}
