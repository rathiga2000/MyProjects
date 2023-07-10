package String;

import java.util.Scanner;

public class DuplicateObj  {
//	private String name;
//    private int price;
//    private double size;
//    private int warrantyear;
//	
//	  public DuplicateObj(String name, int price, double size, int warrantyear) {
//			
//			this.name = name;
//			this.price = price;
//			this.size = size;
//			this.warrantyear = warrantyear;
//		}
//		
//
//		public String getName() {
//			return name;
//		}
//
//
//		public void setName(String name) {
//			this.name = name;
//		}
//
//
//		public int getPrice() {
//			return price;
//		}
//
//
//		public void setPrice(int price) {
//			this.price = price;
//		}
//
//
//		public double getSize() {
//			return size;
//		}
//
//
//		public void setSize(double size) {
//			this.size = size;
//		}
//
//		public int getWarrantyear() {
//			return warrantyear;
//		}
//
//
//		public void setWarrantyear(int warrentyear) {
//			this.warrantyear = warrentyear;
//		}
//
//		public String toString() {
//			return " [name=" + name + ", price=" + price + ", size=" + size + ", warrentyear=" + warrantyear + "]";
//		}
//		


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		Television a[]=new Television[n];
		for (int i = 0; i <a.length; i++) {
		System.out.println("enter the name");
		String name=sc.next();
		
		System.out.println("enter the size");
		double size=sc.nextDouble();
		
		System.out.println("enter the price");
		int price=sc.nextInt();
		
		System.out.println("enter the year");
		int warrantyear=sc.nextInt();
		boolean flag = false;

	Television obj1=new Television(name,price,size,warrantyear);
			

		for (int j = 0; j < n; j++) {

			if (obj1.equals(a[j])) {
				flag = true;
			}

		}
		if (flag == false) {
			a[i] = obj1;
		}
	}
System.out.println();
	for (Object i:a) {
		System.out.println(i);
	}

		
		}
	
	}


