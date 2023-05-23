package ForLoop;

public class ReverseNumber {

	public static void main(String args[]) {
		ReverseNumber obj = new ReverseNumber();
		obj.Back_Num();
	}

	public void Back_Num() {
		for (int num = 10; num >= 1; num--) {
			System.out.println(num);

		}
	}
}
