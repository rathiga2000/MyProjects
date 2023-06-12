package Array;

public class ArrayTest {
	public static void main(String arg[]) {
		ArrayTest obj = new ArrayTest();
		obj.max();
obj.min();
obj.oneDimen();
obj.sum();
	}

	public void max() {

		int arr[] = { 1,2,3,4,5,6 };
		int max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
			second_max=max;
				max=arr[i];
			}
			if(second_max<arr[i]  && arr[i]!=max)
			{
				second_max=arr[i];
			}
		}
		System.out.println("second max number: " +second_max);
	}
public void min()
	{
	int arr[] = { 1,3,4,5,6,7};
	int min  = Integer.MAX_VALUE;
	int second_min = Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++)
	{
		if(min>arr[i])
		{
		second_min=min;
			min=arr[i];
		}
		if(second_min>arr[i]  && arr[i]!=min)
		{
			second_min=arr[i];
		}
	}
	System.out.println("second min number: " +second_min);
}
	
	public void oneDimen()
	{
		int arr[][]= {{5,4,3,2},{2,4,4,5},{5,4,3,2},{3,5,7,8}};
		int brr[]=new int[arr.length*arr[0].length];
		int temp=0;
				for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				brr[temp]=arr[col][row];
				temp++;
			}
		}
		System.out.println("one Dimensional Array");
		for(int row=0;row<brr.length;row++)
		{
			{
			System.out.print(brr[row]+" ");
		}
	}
}
	public void sum()
	{
		int a[][]= {{4,6,7,8,9},{2,3,4,5,6},{1,2,3,4,5},{5,6,7,8,9},{3,4,5,6,7}};
		
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]%2==0)
				{
					temp++;
				}
			}
		}
				int b[]=new int[temp];
				int count=0;
				int sum=0;
				for(int i=0;i<b.length;i++) {
					for(int j=0;j<a[i].length;j++)
					{
						if(a[i][j]%2==0)
						{
							b[count]=a[i][j];
							sum=sum+a[i][j];
						count++;
					}
				}
			}
				System.out.println("Even number");
				for(int i=0;i<b.length;i++) {
					System.out.println(b[i]+" ");

		}
				System.out.println("sum of even number " +sum);
	}
}