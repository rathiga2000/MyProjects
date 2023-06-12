package Array;

import java.util.Scanner;

public class AddTwoDimen {

	public static void main(String[] args) {
		AddTwoDimen obj = new AddTwoDimen();
		int a[][] = obj.firstArray();
		int b[][] = obj.secondArray();
		obj.sumArray(a, b);
		obj.subArray(a, b);
		obj.productArray(a, b);
	}

	// Expect Output:1 2 3
	// 4 5 6
	// 7 8 9
	int[][] firstArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size (a)");
		int size = sc.nextInt();
		System.out.println("Enter the col size (a)");
		int size1 = sc.nextInt();
		int a[][] = new int[size][size1];
		System.out.println("enter the row and col of a value is ");
		for (int row = 0; row < a.length; row++) {

			for (int col = 0; col < a[row].length; col++) {
				a[row][col] = sc.nextInt();
			}
		}
		System.out.println("print the a of 2d array value is ");
		for (int row = 0; row < a.length; row++) {

			for (int col = 0; col < a[row].length; col++) {
				System.out.print(a[row][col] + " ");
			}
			System.out.println();

		}

		return a;
	}

	// expect output :1 2 3
	// 4 5 6
	// 7 8 9
	int[][] secondArray() {		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size (b) ");
		int size = sc.nextInt();
		System.out.println("Enter the col size (b) ");
		int size1 = sc.nextInt();
		int b[][] = new int[size][size1];
		System.out.println("enter the row and col value of b ");
		for (int row = 0; row < b.length; row++) {

			for (int col = 0; col < b[row].length; col++) {
				b[row][col] = sc.nextInt();
			}
		}
		System.out.println("print the b of 2d array value is ");
		for (int row = 0; row < b.length; row++) {

			for (int col = 0; col < b[row].length; col++) {
				System.out.print(b[row][col] + " ");
			}
			System.out.println();

		}

		return b;
	}

//Expect output: 2 4 6
	// 8 10 12
	// 14 16 18
	void sumArray(int a[][], int b[][]) {
		System.out.println();
		int c[][] = new int[a.length][b.length];
		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c[row].length; col++) {
				c[row][col] = a[row][col] + b[row][col];
			}
		}
		System.out.println("sum of two array");
		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c[row].length; col++) {
				System.out.print(c[row][col] + " ");
			}
			System.out.println();
		}
	}

//expect output:0 0 0
	// 0 0 0
	// 0 0 0
	void subArray(int a[][], int b[][]) {
		System.out.println();
		int c[][] = new int[a.length][b.length];
		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c[row].length; col++) {
				c[row][col] = a[row][col] - b[row][col];
			}
		}
		System.out.println("subtraction of two array");
		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c[row].length; col++) {
				System.out.print(c[row][col] + " ");
			}
			System.out.println();
		}
	}

//Expect output:1 4 9
	// 16 25 36
	// 49 64 81
	void productArray(int a[][], int b[][]) {
		System.out.println();
		int c[][] = new int[a.length][b.length];
		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c[row].length; col++) {
				c[row][col] = a[row][col] * b[row][col];
			}
		}
		System.out.println("Multiple of two array");
		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c[row].length; col++) {
				System.out.print(c[row][col] + " ");
			}
			System.out.println();
		}
	}
}