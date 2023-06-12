package While;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String args[]) {
		ReverseNumber obj = new ReverseNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value:");
         int Num=sc.nextInt();
 		System.out.println("Print the order of reverse number :");

		obj.Back_Num(Num);
	}

	public void Back_Num(int Num) {
		int count = 1;

		while (Num>=count) 
		{
			System.out.println(Num);
			Num--;
			//count++;
		}
	}
}
