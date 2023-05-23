package DoWhile;

public class OrderEven {

	public static void main(String args[]) {
		OrderEven obj = new OrderEven();
		obj.Call(2);
	}

	public void Call(int Num) {
		do {
			System.out.println(Num);
			Num = Num + 2;

		} while (Num <= 10);

	}
}
