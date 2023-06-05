package Array;

public class Value extends Input
{
public static void main(String args[])
{
	Value obj=new Value();//456
	value();
	obj.first();
	obj.last();
	obj.middle();
}
void first()//4
{
	System.out.println();
System.out.println("first value: " +arr[0]);
	
}
void last()//6
{
	System.out.println();
	System.out.println("Last value: " +arr[arr.length-1]);
}
void middle()
{
	if(arr.length%2==0)
		
	{
int middle=	arr.length/2;
System.out.println("middle number " +arr[middle]+" "+arr[middle-1]);
}
	if(arr.length%2!=0)
	{
		int middle=arr.length/2;
		System.out.println("middle number" +arr[middle]);

	}
}
}


