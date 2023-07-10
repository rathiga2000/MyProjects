package Array;

import java.util.Scanner;

public class AddElement {

	public static void main(String[] args) {
		
		AddElement obj = new AddElement();
		obj.element();
		//System.out.println(obj);
//		int input[] = Input.value();
//		obj.element(input);
		
	}

	//public void element(int arr[]) 
	public void element()
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println();
//		System.out.println("give to add one index");
//		int index = sc.nextInt();
//		System.out.println("give to add one element");
//		int num = sc.nextInt();
		//int arr[]=new int[5];
		
		int arr[]= {4,5,6,7,8};
		System.out.println("before array");
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");
		}
int index=3;
int num=7;
		int brr[] = new int[arr.length + 1];

		int temp = 0;

		for (int i = 0; i < brr.length; i++) {
			if (i == index) {
				brr[i] = num;
			} else {
				brr[i] = arr[temp];
				temp++;
			}
		}
		brr[index] = num;
		System.out.println();
		System.out.println("after add array");
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i]+" ");
		}
	}
}