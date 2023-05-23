package While;

public class OrderNum {

	public static void main(String args[]) {
		OrderNum obj = new OrderNum();
		obj.Line(1);
	}

	public void Line(int Num) {
		int count = 0;
		while (count < 10) {
			System.out.println(Num);
			Num++;
			count++;
		}
	}
}
