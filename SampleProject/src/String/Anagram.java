package String;
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		Anagram obj=new Anagram();
		obj.change();
	}
	public void change()
	{
		Scanner scanner = new Scanner(System.in);
      
     System.out.print("Enter the First String : ");
      String s1 = scanner.nextLine();
       
      System.out.print("Enter the second String : ");
      String s2 = scanner.nextLine();
      
   
		boolean flag= true;    
		if (s1.length() != s2.length())   
		{    
		flag = false;    
		}   
		else   
		{    
		
		char S1[] = s1.toCharArray();    
		
		char S2[] = s2.toCharArray();    
		Arrays.sort(S1);    
		Arrays.sort(S2);    
		
		if (Arrays.equals(S1, S2))   
		{    
		System.out.println(s1 + " and " + s2 + " are anagrams");    
		}   
		else   
		{    
		System.out.println(s1 + " and " + s2 + " are not anagrams");    
		}    
		}    
	}
}
