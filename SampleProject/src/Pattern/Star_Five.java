package Pattern;

public class Star_Five {
	public static void main(String arg[]) {
		Star_Five obj = new Star_Five();
		obj.Value_Star();
        obj.Star_Exclamation();
		obj.Five_Five_Star();
		obj.Number();
		obj.Triangle();
		obj.RightTri_Top();
		obj.RightTri_Bottom();
	}
	//i=row
	//j=col
	/* 
	 * output: *****
	 */ 
	 public void Value_Star() {

		System.out.println("print first row 5 * Value");

		for(int i=1;i<=5;i++)
		{
			System.out.print("*");
		}
		System.out.println();

	}
	 /*
	  * output:*!*!*
	  */
	public void Star_Exclamation() {


		System.out.println("Print first row * and ! value");
for(int i=1;i<=5;i++)
{
	if(i%2!=0)
	{
		System.out.print("*");
	}
	else 
	{
		System.out.print("!");
	}
}
		System.out.println();		
		}
	/*
	 * *****
	 * *****
	 * *****
	 * *****
	 * *****      
	 */
    public void Five_Five_Star() {
		int row = 1;

		System.out.println("Print Five*Five * value");

		while (row <= 5) {
			int col = 1;
			while (col <= 5) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}
    }
	  /*12345
		1234
		123
		12
		1
		*/
	
	public void Number()
	{
		int row=5;
		
		System.out.println("print left bottom triangle value");
		
		while(row>=1)
		{
			int col=1;
			while(col<=row)
			{
				System.out.print(col);

			col++;
		}
		row--;
		System.out.println();
		
			}
	}
	/*1
	 *12
	 *123
	 *1234
	 *12345
	 */
	public void Triangle()
	{
		int row=1;
		int col=1;
		//System.out.println("print left top triangle value");
		while(row<=5)
		{
			//int col=1;
			while(col<=row)
			{
				System.out.print(col);
				col++;
				
			}
			row++;
			System.out.println();
		}
	}
	/*
	 *     1
	 *    21
	 *   321
	 *  4321
	 * 54321
	 */ 
	public void RightTri_Top()
	{
		int row=1;
		System.out.println("print right top triangle value");

		while(row<=5)
		{
		int space=5;
		while(space>row)
		{
			System.out.print(" ");
			space--;
		}
		int col=1;
		while(col<=row)
		{
			System.out.print(col);
			col++;
		}
	row++;
	System.out.println();
		}
	}
	
	/* 
	 * 12345
	 *  1234
	 *   123
	 *    12
	 *     1
	 */
	public void RightTri_Bottom()
	{
		int row=6;
		System.out.println("print right bottom triangle value");

		while(row>=1)
		{
		
		int space=5;
		while(space>=row)
		{
			System.out.print(" ");
			space--;
		}
		int col=1;
		while(col<row)
		{
			System.out.print(col);
			col++;
			
		}
		row--;
		System.out.println();
	}
}
}