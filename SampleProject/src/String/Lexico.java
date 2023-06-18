package String;
import java.util.Arrays;
public class Lexico {

	public static void main(String[] args) {
Lexico obj=new Lexico();
obj.order();
obj.value();

	}
	public void order()
	{
	System.out.println("alphabetical order of string");
	String arr[]={"apple","orange","ball","cake","bike"};
		
		Arrays.sort(arr);
		for(String i:arr)
		{
			System.out.print(i+" ");
		}
		
	}
	public void value()
	{
	System.out.println();
		System.out.println("Spilt String:");
		String str = "Java checking theeaee ale";  
	        String[] arr = str.split("a",0);
	 
	        for (String a : arr)
	        {
	            System.out.println(a);
	    }
    System.out.println("Split array length: "+arr.length); 
	
    }  

	}
	

