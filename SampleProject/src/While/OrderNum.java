package While;
import java.util.Scanner;
public class OrderNum {

	public static void main(String args[]) {
		OrderNum obj = new OrderNum();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number Value");
		int Num=s.nextInt();
		System.out.println("order of number");
		obj.Line(Num);
	}

	public void Line(int Num) {
		int count = 0;
		while (count < 10) {
			System.out.println(Num);
			Num++;
			count++;
		}
	}
}
