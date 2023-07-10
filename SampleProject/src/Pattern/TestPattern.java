package Pattern;

public class TestPattern {

	public static void main(String[] args) {
TestPattern obj=new TestPattern();
obj.order();

	}
	//1 1 1 1 1
	//2 2 2 2 2
	//3 3 3 3 3
	//4 4 4 4 4
	//5 5 5 5 5
	
public void order()
{
	int count=1;
	for(int j=1;j<=5;j++)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.print(count);
		}
	
	System.out.println();	
	count++;
	}
}
}

