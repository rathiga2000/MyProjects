package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Excep {
      public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
            System.out.println("Enter the a value");
			int a = sc.nextInt();
			System.out.println("Enter the b value");
			int b = sc.nextInt();
            System.out.println("Addition of a and b value is : " + (a + b));
            System.out.println("Subtraction of a and b value is : " + (a - b));
            System.out.println("Multiple of a and b value is : " + (a * b));
            System.out.println("Division of a and b value is : " + (a / b));
//		    int d[] = new int[5];
//			System.out.println(d[7]);
//			String s=null;  
//			System.out.println(s.length());
			String f = "abc";
			int i = Integer.parseInt(f);

		} catch (ArithmeticException e) {
			System.out.println("Not divided by zero value");

		} catch (NullPointerException p) {
			
			System.out.println("Identify the Null Poiter Exception");
		} catch (NumberFormatException n) {
			System.out.println("Identify the number format Exception");
		} catch (InputMismatchException i) {
			System.out.println("Identify the input mismatch exception");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Idetify the Array index of bounds exception ");
		} catch (Exception e) {
			System.out.println("wrong value ");
		}

		finally {
			System.out.println("Thank you");

		}
	}
}