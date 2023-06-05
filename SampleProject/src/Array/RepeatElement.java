package Array;

//first repeat value:
public class RepeatElement {
	public static void main(String[] args) {
		int input[] = Input.value();
		RepeatElement obj = new RepeatElement();
		obj.repeat(input);
		obj.nonRepeat(input);
	}

	void repeat(int a[])// 23032 //2
	{
		System.out.println();
		System.out.println("first repeat value");
		boolean flag = false;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					flag = true;
					System.out.println(a[i]);
					break;

				}
				if (flag == true) {
					break;
				}
			}

		}
	}

//first non repeat value
	// ex:457635 o/p=4
	void nonRepeat(int a[]) {
		System.out.println();
		System.out.println("Non repeative first value");
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			int temp = 0;

			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					temp++;
				}
			}
			if (temp == 1) {
				System.out.println(a[i]);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("non repeated value");
		}
	}
}
