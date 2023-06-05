package Array;

public class Subset {
	public static void main(String arg[]) {
		num();
	}
   static void num() {
		int a[] = { 5, 4, 1, 7, 2 };
		int b[] = { 5, 4, 2 };
		boolean flag=false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
            if (a[i] == b[j]) {
					flag=true;
					break;
					}
                 }
			}
		if (flag==false) {
			System.out.println("subset of array");
        } else {
			System.out.println("Not subset of array");
		}
	}
}
