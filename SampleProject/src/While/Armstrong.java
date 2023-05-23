package While;
//1cube+5cube+3cube=1+125+27=153

public class Armstrong {


	    public static void main(String[] args) {
	    Armstrong obj=new Armstrong();
	    obj.Arms(153);
	    }
	    public void Arms(int n)
	    {
	     int temp=0; 
	    int sum=0;
	    
	     temp=n;
	      while(n>0)
	    {
	      int r = n%10;
	       sum = sum + r*r*r;
	       n = n/10;
	       }
	      if(temp==sum)
	      System.out.println(sum+ " Armstrong number");
	        else
	      System.out.println(sum+ " Not Armstrong number");
	            }
	}

