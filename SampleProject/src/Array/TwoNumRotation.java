package Array;

public class TwoNumRotation {
	public static void main(String arg[]) {
		TwoNumRotation obj = new TwoNumRotation();
		int input[] = Input.value();
		obj.doubleRotat(input);
	}

	void doubleRotat(int a[])// 3456 //5634
	{
		int temp = a[0];//temp=3

		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];//a[0]=a[1]; //4456 a[1]=a[2];//4556 a[2]=a[3];//4566
		}                    
		a[a.length - 1] = temp;//4-1=3//a[3]=4563

		int temp1 = a[0]; //temp=4       /4563
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];//a[0]=a[1]//5563 a[1]=a[2]//5663;a[2]=a[3]//5633
		}

		a[a.length - 1] = temp1;//4-1=3//a[3]=5634
		//display
		System.out.println();
		System.out.println("two element rotation");
		for (int i = 0; i < a.length; i++)

		{
			System.out.print(a[i] + " ");
		}
	}
}