package Pattern;

public class Numbers {
 public static void main(String args[])
 {
	 Numbers obj=new Numbers();
	 obj.star();
	 obj.space();
	 obj.num();
	 obj.triangel();
	 obj.reverse();
 }
	 public void star()
	 {
	 System.out.println("star");
	 for(int row=1;row<=5;row++)
	 {
		 for(int col=5;col>=1;col--)
		 {
			 System.out.print(col);
		 }
		 System.out.println();
	 }
	 }

	 
	 public void space()
	 {
		 System.out.println("Square hollow pattern");
		 for(int i=1;i<=5;i++) {
			 for(int j=1;j<=5;j++)
			 {
				 if((i==1||i==5)||(j==1||j==5))
				 
					 System.out.print("*"+" ");
				 
					 else
					 
						System.out.print(" "+" ");
					 }
				 System.out.println();
				 }
			 }
	 public void num()
	 {

		 for(int i=1;i<=5;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print(i);
			 }
			 System.out.println();
			 }
		 System.out.println("number increase pyramid pattern");
	 for(int i=1;i<=5;i++) {
		 for(int j=1;j<=i;j++)
		 {
			 System.out.print(j);
		 }
		 System.out.println();
	 }
	 }
	 public void triangel()
	 {
		 
	 System.out.println("triangle pattern");
	 for(int i=1;i<=5;i++)
	 {
		 for(int j=1;j<=5-i;j++)
		 {
			 System.out.print(" ");
		 }
		 for(int k=1;k<=i;k++)
		 {
			 System.out.print("*"+" ");
		 }
		 System.out.println();
	 }
	 }
	 public void reverse()
	 {
		 System.out.println("number increase reverse pyramid pattern");

		 for(int i=5;i>=1;i--)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(j);
			 }
			 System.out.println();
		 }
System.out.println("number change pyramid pattern");

	 for(int i=1;i<=5;i++)
	 {
		 for(int j=i;j<=5;j++)
		 {
			 System.out.print(j);
		 }
		 System.out.println();
	 }
	 System.out.println();
		int count=1;

	 for(int i=1;i<=5;i++)
	 {
		for(int j=1;j<=i;j++)
		{
			System.out.print(count+" ");
			count++;
		}
		System.out.println();
	 }
	 
	 System.out.println("order number");
	  int  temp =2;
	 for(int i=1;i<=5;i++)
	 {
		 
		 for(int j=1;j<=5;j++)
		 {
			 System.out.print(temp);
			 temp=temp+2;
		 }
		 System.out.println();
	 }

	 }
}
