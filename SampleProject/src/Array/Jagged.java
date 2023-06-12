package Array;

import java.util.Scanner;

public class Jagged {

	public static void main(String[] args) {
		Jagged obj = new Jagged();
		int a[][] = obj.arrayA();
		int b[][] = obj.arrayB();
		obj.sum(a, b);
		obj.sub(a, b);
		obj.product(a, b);

	}

//ex output:2
	     // 4 5 6
	     // 1 3
	// print the a jagged array
	int[][] arrayA() {
		System.out.println("Enter the row and col value of a array");
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][];
		a[0] = new int[1];
		a[1] = new int[3];
		a[2] = new int[2];
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				a[row][col] = sc.nextInt();
			}

		}
		System.out.println("Print the (a) Jagged Array of 2d Array");

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				a[row][col] = a[row][col];

			}

		}
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				System.out.print(a[row][col] + " ");
			}
			System.out.println();

		}
		return a;
	}

//ex output:4
	     // 3 2 1
	     // 5 6
	// print the b jagged array
	int[][] arrayB() {
		System.out.println("Enter the row and col value of b array");
		Scanner sc = new Scanner(System.in);
		int b[][] = new int[3][];
		b[0] = new int[1];
		b[1] = new int[3];
		b[2] = new int[2];
		for (int row = 0; row < b.length; row++) {
			for (int col = 0; col < b[row].length; col++) {
				b[row][col] = sc.nextInt();
			}

		}
		System.out.println("Print the (b) Jagged Array of 2d Array");

		for (int row = 0; row < b.length; row++) {
			for (int col = 0; col < b[row].length; col++) {
				b[row][col] = b[row][col];

			}

		}
		for (int row = 0; row < b.length; row++) {
			for (int col = 0; col < b[row].length; col++) {
				System.out.print(b[row][col] + " ");
			}
			System.out.println();

		}
		return b;
	}

//ex output:6
	     // 7 7 7
	     // 7 9
	// sum of a jagged array and b jagged array give the c jagged array
	void sum(int a[][], int b[][]) {
		System.out.println();
		int c[][] = new int[3][];
		c[0] = new int[1];
		c[1] = new int[3];
		c[2] = new int[2];
		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c[row].length; col++) {
				c[row][col] = a[row][col] + b[row][col];
			}
		}
		System.out.println("Sum of Jagged array");

		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c[row].length; col++) {
				System.out.print(c[row][col] + " ");

			}
			System.out.println();
		}
	}

	// ex output:-2
	          // 1 3 5
	          // -4 -3
	// substraction of (a) jagged array and b jagged array give the c jagged array
	void sub(int a[][], int b[][]) {
		System.out.println();
		int c[][] = new int[3][];
		c[0] = new int[1];
		c[1] = new int[3];
		c[2] = new int[2];
		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c[row].length; col++) {
				c[row][col] = a[row][col] - b[row][col];
			}
		}
		System.out.println("Sub of Jagged array");

		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c[row].length; col++) {
				System.out.print(c[row][col] + " ");

			}
			System.out.println();
		}
	}
	// ex output:8
	          // 12 10 6
	          // 5 18
	// multiple of  (a) jagged array and b jagged array give the c jagged array

	void product(int a[][], int b[][]) {
		System.out.println();
		int c[][] = new int[3][];
		c[0] = new int[1];
		c[1] = new int[3];
		c[2] = new int[2];
		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c[row].length; col++) {
				c[row][col] = a[row][col] * b[row][col];
			}
		}
		System.out.println("Multi of Jagged array");

		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c[row].length; col++) {
				System.out.print(c[row][col] + " ");

			}
			System.out.println();
		}
	}

}
