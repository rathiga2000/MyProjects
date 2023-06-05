package Array;
//ex: i/p a={2345}; b={56} o/p={234556}
public class Merge extends TwoInput {
       public static void main(String[] args) {
		doubleValue();
		Merge obj = new Merge();
		obj.connect();
		obj.removeDuplicate();
	}
      int c[] = new int[a.length + b.length];
      void connect() {
       for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[i + a.length] = b[i];
		}
		System.out.println();
		System.out.println("Merge array value is");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
        }
//ex: i/p: a={1234} b={456} o/p: c={123456}
	void removeDuplicate() {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					count++;//count of array element

				}
			}
		}
		int c[] = new int[a.length + b.length - count];//c array space
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		int temp = a.length;
		for (int j = 0; j < b.length; j++) {
			boolean flag = false;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == b[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				c[temp] = b[j];
				temp++;
			}
		}
		System.out.println();
		System.out.println("Remove duplicate value then merge the array");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
