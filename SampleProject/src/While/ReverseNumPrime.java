package While;

public class ReverseNumPrime {
	public static void main(String arg[]) {
		ReverseNumPrime obj = new ReverseNumPrime();
		obj.Reverse(925637);
		obj.Reverse(13);
	}

	public void Reverse(int num) {
		int rev = 0;
		while (num > 0) {
			int n = num % 10;
			rev = (rev * 10) + n;
			num = num / 10;
		}
       int reverse = rev;
		int i = 1;
		int count = 0;
		while (rev >= i) {
			if (rev % i == 0) {
				count++;
			}
			i++;
		}
		if (count == 2) {
			System.out.println(rev+ " prime" );
		} else {
			System.out.println(rev+ " not prime");
		}
	}
}
