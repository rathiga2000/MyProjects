package String;
import java.util.Scanner;
public class Count_Base {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String search = sc.nextLine();
		System.out.println("enter the find value");
		char find = sc.next().charAt(0);
		Count_Base obj = new Count_Base();
		obj.count(search, find);
      }

	public int count(String search, char find) {
		int count = 0;
		char ch[] = new char[search.length()];
		for (int i = 0; i < search.length(); i++)
		{
             if (search.charAt(i) == find)
             
				count++;
		}
		
		System.out.println("count of char value " + count);
		return count;
	
}
}