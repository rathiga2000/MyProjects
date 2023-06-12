package Array;

import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		int input[] = Input.value();
		RemoveElement obj = new RemoveElement();
		obj.element(input);
		obj.index(input);

	}

	public void element(int a[]) {
		int b[] = new int[a.length - 1];
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("find remove one element");
		int find = sc.nextInt();
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			if (find != a[i]) {
				b[temp] = a[i];
				temp++;
			}
		}
		System.out.println("after array");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");

		}
	}

	public void index(int a[]) {
		int b[] = new int[a.length - 1];
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("find remove one index");
		int find = sc.nextInt();
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			if (find != i) {
				b[temp] = a[i];
				temp++;
			}

		}
		System.out.println("after array");
		for (int i = 0; i < b.length; i++) {
			System.out.println(i + " index " + b[i]);

		}
	}
}
