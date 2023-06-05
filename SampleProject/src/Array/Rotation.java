package Array;

public class Rotation {
	public static void main(String arg[]) {
		int input[] = Input.value();// print array 45321
		Rotation obj = new Rotation();
		obj.rotat(input);
	}

	void rotat(int a[]) {
		int temp = a[0];// temp=4 // 45321 //53214
		if (a.length > 1) {
			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			a[a.length - 1] = temp;
			System.out.println();// display the a
			System.out.println("after rotation");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}

		} else {
			System.out.println();
			System.out.println("please give atleast two element,one element cannot be rotation");
		}

	}
}