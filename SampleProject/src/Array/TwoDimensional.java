package Array;

public class TwoDimensional {

	public static void main(String[] args) {
		TwoDimensional obj = new TwoDimensional();
		obj.matrix();
		obj.print();

	}
	// Expect output is:1 2 3 4 5
	// 6 7 8 9 10
	// 11 12 13 14 15
	// 16 17 18 19 20
	// 21 22 23 24 25

	public void matrix() {
		System.out.println("Print the Two Dimensional Array");
		int temp = 1;
		int arr[][] = new int[5][5];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = temp;// arr[0][0]=1;
				temp++;// 2
			}
		}
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}

	}

//Expect output:3 4 5 3 7
	// 4 2 3 10 5
	// 1 2 3 4 5
	// 4 5 6 7 19
	// 3 7 89 34 23
	public void print() {
		System.out.println();
		System.out.println("print the direct value");
		int a[][] = { { 3, 4, 5, 3, 7 }, { 4, 2, 3, 10, 5 }, { 1, 2, 3, 4, 5 }, { 4, 5, 6, 7, 19 },
				{ 3, 7, 89, 34, 23 } };
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				a[row][col] = a[row][col];// a[0][0]=a[3][3];

			}
		}
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				System.out.print(a[row][col] + " ");
			}
			System.out.println();

		}
	}

}
