
package String;

import java.util.Scanner;

public class NonDuplicateElement {

	public static void main(String[] args) {
		NonDuplicateElement obj = new NonDuplicateElement();
		obj.num();
		obj.name();
		obj.separat();

	}

	public void num() {
        Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the integer Value");
		for (int i = 0; i < arr.length; i++) {
			int n = sc.nextInt();
            boolean flag = false;
        for (int j = 0; j < arr.length; j++) {
                if (n == arr[j]) {
					flag = true;
				}
              }
			if (flag == false) {
				arr[i] = n;
            }
		}
		System.out.println("Without Duplicate");
          for (int i : arr) {
			System.out.println(i);
		}

	}

	public void name() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		String arr[] = new String[size];
		System.out.println("Enter the string Value");
		for (int i = 0; i < arr.length; i++) {
            String n = sc.next();
			boolean flag = false;
           for (int j = 0; j < arr.length; j++) {
                  if (n.equals(arr[j])) {
					flag = true;
                }
               }
			if (flag == false) {
				arr[i] = n;
			}
		}
		System.out.println("Without Duplicate");
           for (String i : arr) {
			System.out.println(i);
		}
	}

     public void separat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		String arr[] = s.split(" ", 0);

		System.out.println("Substrings length:" + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + " index " + arr[i]);

		}

	}
}







