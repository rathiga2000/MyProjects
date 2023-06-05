package Array;

public class Duplicate_Value extends Input {
	public static void main(String arg[]) {
		Duplicate_Value obj = new Duplicate_Value();
		value();
		obj.identify();
		obj.remove_Duplicate();
	}

	void identify() {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println();
					System.out.println("duplicate number founded " + arr[i]);
					break;

				}

			}
		}
	}

	void remove_Duplicate() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = Integer.MIN_VALUE;
				}
			}
		}
		System.out.println();
		System.out.println("without duplicate number");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != Integer.MIN_VALUE) {
				System.out.println(arr[i]);
			}
		}
	}
		
					}
			
