package Array;

public class Reverse {
	public static void main(String arg[]) {
		back();
	}

	static void back() {
		int arr[] = { 3, 1, 7, 5, 2 };
		System.out.println("Array value");
		for (int a = 0; a < arr.length; a++) {
			System.out.print(arr[a] + " ");
		}
		System.out.println();
		System.out.println("Reverse value");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}
