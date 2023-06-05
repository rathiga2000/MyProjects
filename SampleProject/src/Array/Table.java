package Array;

public class Table {
	public static void main(String arg[]) {
		multi();

	}

	static void multi() {
		int arr[] = { 7 };
		for (int a = 0; a < arr.length; a++) {
	
			for (int i = 1; i <= 10; i++)

			{
				System.out.println(arr[a] + "*" + i + "=" + (arr[a] * i));
			}
		}
	}
}