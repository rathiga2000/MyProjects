package Array;


public class SingalDigit {
	public static void main(String arg[]) {
		int input[]=Input.value();

		SingalDigit obj = new SingalDigit();
		obj.singal(input);
	}

 int[] singal(int arr[]) {
		int sum=0;
			for(int i=0;i>0||sum>9;i++)
		{  
		if (arr[i] == 0)   
		{  
		arr[i] = sum;  
		sum = 0;  
		}  
		sum = sum + arr[i] % 10;  
		arr[i] = arr[i] / 10;  
		}


		return arr;  
		}  
}
