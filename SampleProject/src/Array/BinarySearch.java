package Array;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
int input[]=Input.value();
BinarySearch obj=new BinarySearch();
obj.ascen(input);
obj.binary(input);
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
		Scanner sc=new Scanner(System.in);
		int find=sc.nextInt();
		int m=l+h/2;//8/2=4
		
	while(find>m)//7>5//
	{
	l=m+1;//6
	m=l+h/2;//6+8/2=7
	}
	while(find>m)//7>9
	{
		h=m-1;	//8-1=7
		m=l+h/2;//66
		
		}
	//l=6 //h=7
	while(find>m)//7>8
	{
		h=m-1;//6
		m=l+h/2;//6
	}
	while(find==m)
	{
		System.out.println(m);
	}
	}
}

