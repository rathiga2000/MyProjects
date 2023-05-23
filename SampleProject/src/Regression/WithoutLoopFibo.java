package Regression;

public class WithoutLoopFibo {
	public static void main(String arg[]) {
		WithoutLoopFibo obj = new WithoutLoopFibo();
		obj.fibo(1);
	}

	int first = -1;
	int second = 1;
	int ans;

	public int fibo(int n) {

		if (n == 10) {
			return 10;
		}
		ans = first + second;
		System.out.println(ans);

		first = second;
		second = ans;

		return fibo(n + 1);

	}
}
