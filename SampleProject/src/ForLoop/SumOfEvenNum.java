package ForLoop;

public class SumOfEvenNum {

	public static void main(String args[]) {
		SumOfEvenNum obj = new SumOfEvenNum();
		obj.Sum(14);
	}

	public void Sum(int n) {

		int evenSum = 0;

		for (int i = 1; i <= n; i++) {
			if ((i % 2) == 0)
				evenSum = evenSum + i;

		}

		System.out.println("Sum of First " + n + " Even numbers = " + evenSum);

	}
}
