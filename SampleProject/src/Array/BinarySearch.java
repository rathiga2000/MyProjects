package Array;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
int input[]=Input.value();
BinarySearch obj=new BinarySearch();
 int call[]= obj.ascen(input);
obj.binary(call);
	}
	int[] ascen(int a[])//59074831
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
			int	temp=a[i];
				a[i]=a[j];
						a[j]=temp;
			}
		}
		}
		System.out.println();
		System.out.println("Ascending array");
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			return a;
		}
	void binary(int a[])//01345789//index:01234567
	{
	int	l=0; int h=a.length;
	System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("find the value");
		int find=sc.nextInt();
int middle=l+h/2;		
	
while(l<h)
{
	if(a[middle]==find)
	{
		System.out.println("Index " + middle + " element " + a[middle]);
		break;
	}
	if(a[middle]<find)
	{
		l=middle+1;
		middle=(middle+h)/2;
	}
	if(a[middle]>find)
{ 
	h=middle-1;
	middle=(middle+l)/2;
}
}
}
}
