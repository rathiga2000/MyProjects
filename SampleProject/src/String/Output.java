package String;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Output {
	public static void main(String arg[]) {
		Television m1 = new Television("LG", 40000, 1.8, 3);
		Television m2 = new Television("Samsung", 30000, 0.7, 2);
		Television m3 = new Television("Sony", 32000, 1.75, 2);
		Television m4 = new Television("Hisence", 16000, 14.8, 3);
		Television m5 = new Television("Tcl", 22000, 1.2, 3);
		Television m6 = new Television("Qled", 28000, 2.3, 3);
		Television m7 = new Television("Xiaomi", 8000, 3.0, 3);
		Television m8 = new Television("Redmi", 34000, 4.5, 3);
		Television[] box = { m1, m2, m3, m4, m5, m6, m7, m8 };

		System.out.println("Before Sorting");
		for (Television b : box) {
			System.out.println(b);

		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input");
		int n = sc.nextInt();

		Comparator c = null;
		switch (n) {
		case 1: {
			c = new NameSort();
			break;
		}
		case 2: {
			c = new PriceSort();
			break;
		}
		case 3: {
			c = new WarrantySort();
			break;
		}
		case 4: {
			c = new SizeSort();
			break;
		}
		default: {
			System.out.println("invaild input");
		}
		}

		Arrays.sort(box, c);

		System.out.println("After Sorting");

		for (Television b : box) {
			System.out.println(b);
		}

	}

}
