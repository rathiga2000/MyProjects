package Array;

import java.util.Scanner;

//sum of consecutive number equal to user input
//ex:i/p=346572;i/p=10  o/p=4+6=10
public class SumOfConsecutive {
	public static void main(String arg[]) {
		int input[] = Input.value();
		SumOfConsecutive obj = new SumOfConsecutive();

		obj.consecutive(input);
		obj.sum(input);
	}

	void consecutive(int arr[])

	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("enter find input value");
		int find = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				if (sum == find) {

					flag = true;
					System.out.println(arr[i] + "+" + arr[j] + "=" + sum);
				}
				break;

			}
		}
		if (flag == false)

		{
			System.out.println("give input sum of non consecutive number");
		}
	}
	//sum of two value equal to user input
	//ex i/p=345742 i/p=7 o/p=3+4=7,3+4=7,5+2;

	void sum(int arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("enter find input value");
		int find = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int add = arr[i] + arr[j];
				if (add == find) {

					flag = true;
					System.out.println(arr[i] + "+" + arr[j] + "=" + add);

				}
			}

		}

		if (flag == false) {
			System.out.println("non summ of find value");
		}
	}

}