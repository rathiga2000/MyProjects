package DoWhile;

public class SumOfEvenNum {

	public static void main(String args[]) {
		SumOfEvenNum obj = new SumOfEvenNum();
		obj.Sum(14);
	}

	public void Sum(int num) {
		int count = 1;
		int sum = 0;
		do {
			if (count % 2 == 0) {
				sum = sum + count;
			}

			count++;

		} while (count <= num);
		{
			System.out.println("Sum of First " + num + " Even numbers = " + sum);
		}
	}
}
