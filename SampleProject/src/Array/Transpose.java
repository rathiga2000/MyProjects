package Array;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		Transpose obj = new Transpose();
		int call[][] = obj.print();
		obj.trans(call);
		obj.singalTrans(call);
	}

	public int[][] print() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size (a)");
		int size = sc.nextInt();
		System.out.println("Enter the col size (a)");
		int size1 = sc.nextInt();
		int a[][] = new int[size][size1];
		System.out.println("enter the row and col value is ");
		for (int row = 0; row < a.length; row++) {

			for (int col = 0; col < a[row].length; col++) {
				a[row][col] = sc.nextInt();
			}
		}
		System.out.println("print the (a) array of 2d array value is ");
		for (int row = 0; row < a.length; row++) {

			for (int col = 0; col < a[row].length; col++) {
				System.out.print(a[row][col] + " ");
			}

			System.out.println();
		}
		return a;
	}

	// ex output:a=1 2 3 b=1 4 7
	            // 4 5 6   2 5 8
	            // 7 8 9   3 6 9
	// print the a array then give the transpose of another array(b array)
	public void trans(int a[][]) {
		System.out.println("print (a) array give the transpose of (b) array");
		int b[][] = new int[a.length][a[0].length];
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				b[row][col] = a[col][row];
			}
		}
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < b[row].length; col++) {
				System.out.print(b[row][col] + " ");
			}
			System.out.println();
		}
	}

	// ex output:a=1 2 3 a=1 2 3
	            // 4 5 6   4 5 6
	            // 7 8 9   7 8 9
	// print the a array then give the transpose of same array
	public void singalTrans(int a[][]) {
System.out.println();
		System.out.println("print the (a) array give the transpose of (a) array");
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				int temp = 0;
				temp = a[row][col];

				a[row][col] = a[col][row];
				a[col][row] = temp;

			}
		}
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				System.out.print(a[col][row] + " ");
			}
			System.out.println();
		}
	}
}
