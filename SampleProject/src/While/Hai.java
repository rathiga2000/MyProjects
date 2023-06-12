package While;

import java.util.Scanner;

public class Hai {

	public static void main(String args[]) {
		Hai obj = new Hai();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String:");
		String Dispaly = sc.next();
		System.out.println("Print the Given String :");

		obj.Display(5);
	}

	public void Display(int num) {
		int count = 0;
		while (count < num) {
			System.out.println("Hai");
			count++;
		}
	}
}
