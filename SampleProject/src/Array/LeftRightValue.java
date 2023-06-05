package Array;

import java.util.Scanner;

public class LeftRightValue {

	public static void main(String arg[]) {
		LeftRightValue obj = new LeftRightValue();
		int input[] = Input.value();
		obj.num(input);
	}// 2345//3/24

	void num(int a[]) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the value");
		int find = sc.nextInt();
		System.out.println("print the Left Right elements: ");
		for (int i = 0; i < a.length; i++) {

			if (find == a[i]) {
				if (find != a[0] && find != a[a.length - 1]) {
					System.out.println(a[i - 1]);
					System.out.println(a[i + 1]);
				} else if (find == a[0]) {

					System.out.println("please Intalize the left value");
					System.out.println(a[i + 1]);

				} else if (find == a[a.length - 1]) {
					System.out.println(a[i - 1]);
					System.out.println("Please Intalize the right value");
				}
			}
		}
	}
}
