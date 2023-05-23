package While;

public class Palindrome {
	
	    public static void main(String args[])
	    {
	    Palindrome obj=new Palindrome();
	    obj.Value(121);
	    obj.Value(-8);
	    obj.Value(57);
	    obj.Value(4567);
	    obj.Value(4);
	    }
	    public void Value(int num)
	    {
	    int temp=num; 
	    int sum=0; 
	    if(num>=9) 
	   {    
	    while(num>0)
	    {    
	    int r=num%10;  
	   sum=(sum*10)+r;    
	   num=num/10;    
	  }    
	  if(temp==sum) {   
	   System.out.println(temp+ " palindrome number");    
	    }
	  else    {
	   System.out.println(temp+ " not palindrome");    
	   }}
	    else{
	    System.out.println(temp+ " will check the number");
	    }}
	}




