package Array;

import java.util.Scanner;

public class Input {
	static int size;
	static int arr[];

	public static void main(String arg[]) {
		value();

	}

	static int[] value() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		size = sc.nextInt();
		arr = new int[size];

		System.out.println("Give the elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Display the array");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}
		return arr;
	}
}