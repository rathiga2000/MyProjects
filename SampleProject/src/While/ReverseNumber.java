package While;

public class ReverseNumber {

	public static void main(String args[]) {
		ReverseNumber obj = new ReverseNumber();
		obj.Back_Num(10);
	}

	public void Back_Num(int Num) {
		int count = 1;
		while (count <= 10) {
			System.out.println(Num);
			Num--;
			count++;
		}
	}
}
