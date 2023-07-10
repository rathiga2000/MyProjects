package Pattern;

public class expattern {

	public static void main(String[] args) {
		expattern obj = new expattern();
//obj.num();
		obj.reverse();
	}

	public void num() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.println("*");
			}
		}
	}

	public void reverse() {
		int x = 9;

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {

				System.out.print(x);
				x--;
			}

			System.out.println();
			// x--;
		}
	}

}
