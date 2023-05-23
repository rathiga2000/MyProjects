package While;
//print odd number between 450 to 500;

public class BetweenOfOddNum {
	
	    public static void main(String args[])
	    {
	    BetweenOfOddNum obj=new BetweenOfOddNum();
	    obj.Odd_Between();
	    }
	    public void Odd_Between()
	    {
	    int i=450;
	    while(i<=500)
	    {
	    if(i%2!=0)
	    {
	    System.out.println(i);
	    }
	    i++;
	    }
	    }   
	}


