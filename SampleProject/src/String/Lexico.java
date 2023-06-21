package String;
import java.util.Arrays;
public class Lexico {
      public static void main(String[] args) {
		Lexico obj = new Lexico();
		obj.order();
		obj.withoutsort();
		obj.value();
		}
       public void order() {
		System.out.println("alphabetical order of string :");
		String arr[] = { "apple", "orange", "ball", "cake", "bike" };
     Arrays.sort(arr);
		for (String i : arr) {
			System.out.print(i + " ");
		}
      }
    public void withoutsort() {
    	System.out.println();
    	System.out.println();
		String arr[] = { "apple", "orange", "ball", "cake", "bike" };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Without sort method in ascending order :");

		for (String i : arr) {
			System.out.print(i+" ");
		}
      }
    public void value() {
		System.out.println();
		System.out.println("Spilt String:");
		String str = "Java checking theeaee ale";
		String[] arr = str.split("a",0);

		for (String a : arr) {
			System.out.println(a);
		}
		System.out.println("Split array length: " + arr.length);

	}
}