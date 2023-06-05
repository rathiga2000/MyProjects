package Array;
public class AscenDecen {
public static void main(String[] args) {
		int input[] = Input.value();
		ascen(input);
		decen(input);
       }// 760389 //o/p= 036789
     public static int[] ascen(int arr[]) {
		for (int i = 0; i < arr.length; i++)

		{
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
                 }
			}
		}
		System.out.println();
		System.out.println("Ascending order is");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
        }
		return arr;
	}

	static int[] decen(int arr[])// 459021 o/p=954210
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Decending order is");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
         }
		return arr;
	}
}