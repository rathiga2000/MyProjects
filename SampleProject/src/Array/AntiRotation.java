package Array;

public class AntiRotation {

	public static void main(String[] args) {

		int input[] = Input.value();
		AntiRotation obj = new AntiRotation();
		obj.antiRotate(input);
		obj.doubleRotate(input);

	}

	void antiRotate(int arr[])// 3456 o/p 6345
	{
		int temp = arr[arr.length - 1];// arr[4-1]=3
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;

		System.out.println();
		System.out.println("Anti clock wise Rotation");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

	void doubleRotate(int arr[]) {//3456 o/p=5634
		int temp = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
		int temp1 = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp1;

		System.out.println();
		System.out.println("Two element Anti clock wise Rotation");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
