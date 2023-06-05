package Array;

public class Pattern {
	public static void main(String arg[]) {
		star();
	}

	static void star() {
		int arr[] = new int[5];

		for (int row = 1; row <= arr.length; row++) {
			for (int col = 1; col <= arr.length; col++) {
				if ((col == 1 || col == arr.length) || (row == 1 || row == arr.length))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
}
