package Array;

import java.util.Scanner;

public class AddElement {

	public static void main(String[] args) {
		
		AddElement obj = new AddElement();
		
		//System.out.println(obj);
		int input[] = Input.value();
		obj.element(input);
		
	}

	public void element(int arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("give to add one index");
		int index = sc.nextInt();
		System.out.println("give to add one element");
		int num = sc.nextInt();

		int brr[] = new int[arr.length + 1];

		int temp = 0;

		for (int i = 0; i < brr.length; i++) {
			if (i == index) {
				brr[i] = num;
			} else {
				brr[i] = arr[temp];
				temp++;
			}
		}
		brr[index] = num;
		System.out.println("after add array");
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i]+" ");
		}
	}
}