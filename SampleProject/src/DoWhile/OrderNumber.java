package DoWhile;

public class OrderNumber {
	public static void main(String args[]) {
		OrderNumber obj = new OrderNumber();
		obj.Line(1);
	}

	public void Line(int Num) {
		do {
			System.out.println(Num);
			Num++;

		}

		while (Num <= 10);

	}
}
