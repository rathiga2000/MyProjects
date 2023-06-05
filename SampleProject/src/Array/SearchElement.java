package Array;

import java.util.Scanner;

public class SearchElement {
	public static void main(String arg[]) {
		element();

	}

	static void element() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Given the element");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Display the size");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("please search the given number");

		int search = sc.nextInt();

		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == search) {
				flag = true;
				System.out.println(search + " present in the given element ");

			}
		}
		if (flag == false) {

			System.out.println(search + " Not present in the given element ");
		}
      }
}
