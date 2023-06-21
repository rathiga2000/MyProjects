package Pattern;

public class Numbers {
 public static void main(String args[])
 {
	 Numbers obj=new Numbers();
	 obj.star();
	 obj.value();
 }
	 public void star()
	 {
	 System.out.println("star");
	 for(int row=1;row<=5;row++)
	 {
		 for(int col=1;col<=5;col++)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	 }
	 
	 public void value()
	 {
		 for(int row=1;row<=5;row++)
		 {
			 for(int col=1;col<=5;row++)
			 {
				 if(col==3 && row==3)
				 {
				 System.out.println("&");
				 break;
			 }
				 else
			 {
				 
				 
					 System.out.println("*");
				 }
				 System.out.println();
			 }
		 }
	 }
}

