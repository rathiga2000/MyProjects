package Hello;

public class Print_Num {
	public static void main(String arg[]) {
		Print_Num obj = new Print_Num();
		obj.Value(1);
	}

	public void Value(int n) {
		while (n <= 10) {
			System.out.println(n);
			n++;
		}
	}
}
