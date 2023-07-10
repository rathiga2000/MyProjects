package Collection;

import java.util.Scanner;
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Array_list_count {

	public static void main(String[] args) {
		Array_list_count obj=new Array_list_count();
	int a[]=	obj.input();
	obj.array_list(a);

	}
	public int[] input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
	int	n = sc.nextInt();
	int	a[] = new int[n];

		System.out.println("Give the elements");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Display the array");
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");

		}
		return a;
	}
	
public void array_list(int a[])
{
	List<Integer> l=new ArrayList<Integer>();
	for(int i=0;i<a.length;i++)
	{
		l.add(a[i]);
	}
	System.out.println();
	System.out.println("Array convertion list");
	System.out.println(l);
}



}