package Array;

import java.util.Scanner;

public class StudentsAge {
	public static void main(String arg[]) {
		student();
	}

	static void student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age of Size");
		int size = sc.nextInt();
		int Age[] = new int[size];
		System.out.println("Intialisation the Age size");

		for (int i = 0; i < Age.length; i++) {
			Age[i] = sc.nextInt();
		}
		System.out.println("Display the Array Value");
		for (int i = 0; i < Age.length; i++) {
			System.out.print(Age[i] + " ");
		}

		System.out.println();

		int total = 0;
		for (int i = 0; i < Age.length; i++) {
			total = total + Age[i];
		}
		System.out.println("Sum of total = " + total);

		double avg = 0;
		for (int i = 0; i < Age.length; i++) {
			avg = total / Age.length;
		}
		System.out.println("Sum of avg =" + avg);
		System.out.println();
		System.out.println("Reverse order of Given Size:");
		for (int i = Age.length - 1; i >= 0; i--) {
			System.out.println(Age[i] + " ");
		}
		System.out.println();
		System.out.println("Odd Index value");
		for (int i = 0; i < Age.length; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " Odd Index Value " + Age[i]);
			}
		}
		System.out.println();
		System.out.println("Even Index value");
		for (int i = 0; i < Age.length; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " Even Inden value " + Age[i]);
			}
		}
		System.out.println();
		int odd = 0;
		int even = 0;
		for (int i = 0; i < Age.length; i++) {
			if (i % 2 == 0) {
				even = even + Age[i];
			}

			else {
				odd = odd + Age[i];
			}
		}
		System.out.println("Odd Index value = " + odd);

		System.out.println("Even Index value = " + even);
		System.out.println();
		int diff = 0;
		diff = even - odd;
		System.out.println("Sum of Odd and Even & diffrent value = " + diff);
	}
}