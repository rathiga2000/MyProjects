package Array;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
Marks obj=new Marks();
obj.rank();

	}
	public void rank()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int n=sc.nextInt();
		int total=0;
		int avg=0;
		int marks[]=new int[5];
		for(int i=0;i<=n;i++)
		{
			marks[i]=sc.nextInt();
			total+=marks[i];
			avg=total/n;
		}
		if(avg>80)
		{
			System.out.println("first grade university");
			
		}
		else if(avg>=60)
		{
			System.out.println("secong grade university");
			
		}
		else if((avg<0)||(avg>99))
		{
			System.out.println("third grade university");
			
		}
		else
			System.out.println("invalid input");
		
		
		
	}

}
