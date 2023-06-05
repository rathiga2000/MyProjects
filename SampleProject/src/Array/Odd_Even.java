package Array;


public class Odd_Even {
	public static void main(String arg[]) {
		OddEven();

	}

	static void OddEven() {

		int arr[] = { 7, 3, 1, 2 };
		System.out.println("Array value");
		for (int a = 0; a < arr.length; a++) {
			System.out.print(arr[a] + " ");
		}
		System.out.println();
		System.out.println("odd value");

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " odd index value " + arr[i]);
			}
		}
		System.out.println();
		System.out.println("evan value");

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " even index value " + arr[i]);
			}
		}
		System.out.println();
		int odd = 0;
		int even = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				even = even + arr[i];
			} else {
				odd = odd + arr[i];
			}
		}
		System.out.println("odd index value= " + odd);
		System.out.println();
		System.out.println("Even idex value= " + even);
		System.out.println();
		int diff = 0;

		diff = even - odd;

		System.out.println("diff between even & add= " + diff);

	}
}
	