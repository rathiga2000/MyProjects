package Array;


public class PrimeArray {

	public static void main(String[] args) {
		int input[] = Input.value();
		PrimeArray obj = new PrimeArray();
int call=obj.num(input);
		
		obj.prime(call,input);
		
	}

	public int num(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = 1; j <= arr[i]; j++) {
				if (arr[i] % j == 0) {
					temp++;
				}
			}

			if (temp == 2) {
				count++;
			}

		}
		System.out.println();
		System.out.println();
		System.out.println("count is " + count);
		return count;

	}

	public void prime(int a,int ar[]) 
	{
		//int ar[]=input;	
		int b[]=new int[a];//2 5 6 7 8
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			int temp = 0;
			for (int j = 1; j <=ar[i]; j++) {
				if (ar[i] % j == 0) {
					temp++;
				}
			}
		
			if (temp == 2) {
				b[count] = ar[i];
				count++;
			}
		
		}
		System.out.println();
		System.out.println("present array");
		for(int i=0;i<b.length;i++)
		{
		System.out.print(b[i]+" ");
		}
	}
}
