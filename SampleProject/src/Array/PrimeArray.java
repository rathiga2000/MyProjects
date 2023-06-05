package Array;

public class PrimeArray {

	public static void main(String[] args) {
int input[]=Input.value();
PrimeArray obj=new PrimeArray();
obj.num(input);
	}
	
	 int num(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			int temp=0;
			for(int j=1;j<arr[i];j++)
			{
			if(arr[i]%j==0)
			{
				temp++;
			}
			}	

			if(temp==2)
			{
				System.out.println("prime num" +count);
			}

			

			}
		
		return count;

		}
		
	}

	
	
