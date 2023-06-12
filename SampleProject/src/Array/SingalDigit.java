package Array;


public class SingalDigit {
	public static void main(String arg[]) {
		int input[]=Input.value();

		SingalDigit obj = new SingalDigit();
		obj.singal(input);
	}

 int[] singal(int arr[]) {
	 System.out.println();
	 System.out.println("sum of digit");
			for(int i=0;i<arr.length;i++)
		{  
				int sum=0;
     for(int j=0;j<arr[i];) {
		sum = sum + (arr[i] % 10);  
		arr[i] = arr[i] / 10;
		if(sum<10&& arr[i]==j)
		{
			arr[i]=sum;
			break;
		}
		if(sum>9 && arr[i]==j)
		{
			arr[i]=sum;
			sum=0;
			
		}
		
		}
		}
		

 for(int i=0;i<arr.length;i++)
	{  
		
 System.out.print(arr[i]+" ");
}
	return arr;  

 }
}
