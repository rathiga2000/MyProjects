package While;
import java.util.Scanner;
public class AddSub {
	public static void main(String arg[]) {
		AddSub obj = new AddSub();
		obj.Number(564337);
		obj.add(677543);

	}

	public void Number(int num) {

		int count = 0;
		int sum1 = 0;
		int sum2 = 0;
		while (num > 0) {

			int mod = num % 10;
			count++;

			if (count % 2 == 0) {
				sum1 = sum1 + mod;
			} else {
				sum2 = sum2 + mod;
			}
			num = num / 10;
		}
		System.out.println("add the odd number " +sum1);
		System.out.println("add the even number " +sum2);
		int value = sum1 - sum2;
		System.out.println("sub of value " +value);
	}
	public void add(int num)//67854
	{  		
//		Scanner sc= new Scanner(System.in);
//System.out.println("enter the size");
//		int size=sc.nextInt();
//		int arr[]=new int[size];
//		System.out.println("Enter the value");
//		for(int i=0;i<arr.length;i++) {
//			 arr[i]=sc.nextInt();
		
			int count=0;
			int sum=0;
			while(num>0)
			{
			int mod=num%10;
			count++;
			if(count%2==0)
			{
				sum=sum+mod;
			}
			
			num=num/10;
			}
			System.out.println("sum of even number" +sum);
		}
			
		}
	


