package Array;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Matrix obj = new Matrix();
		int arr[][] = obj.print();
		obj.addRow(arr);
		obj.addcol(arr);
		obj.sum(arr);
	}

	// Expect output:1 2 3
	// 4 5 6
	// 7 8 9
	int[][] print() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size");// 3
		int size = sc.nextInt();
		System.out.println("Enter the col size");// 3
		int size1 = sc.nextInt();
		int arr[][] = new int[size][size1];
		System.out.println("enter the row and col value");// 123456789
		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = sc.nextInt();
			}
		}
		System.out.println("print the 2 Dimensional Araay value is");
		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();

		}

		return arr;
	}

	// Expect output: 6
	// 15
	// 24
	void addRow(int arr[][]) {
		System.out.println();
		System.out.println("SUM OF ROW:");
		for (int row = 0; row < arr.length; row++) {
			int add = 0;

			for (int col = 0; col < arr[row].length; col++) {
				add = add + arr[row][col];// 0+arr[0][0];//1
			}

			System.out.println(row + " sum of row value = " + add);
		}
	}

	// Expect output: 12
	// 15
	// 18
	void addcol(int arr[][]) {
		System.out.println();
		System.out.println("SUM OF COLUMN:");
		for (int col = 0; col < arr.length; col++) {
			int add = 0;

			for (int row = 0; row < arr[col].length; row++) {
				add = add + arr[row][col];// 0+arr[0][0]//1
			}
			System.out.println(col + " sum of column value = " + add);
		}
	}

	// Expect output is 45
	void sum(int arr[][]) {
		System.out.println();
		System.out.println("TOTAL 2D ARRAY VALUE");
		int add = 0;
		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				add = add + arr[row][col];// a[0][0]//1;a[1][0]//4...;
			}
		}
		System.out.println("total value of 2d Array = " + add);

	}

}
