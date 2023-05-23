package SimpleProgram;

public class Add {
	
	   public static void main(String arg[])
	   {
	    Add obj=new Add();
	    obj.Sum(11,2,2);
	    }
	    public void Sum(int a, int b, int c)
	    {    
	    int d=a+b+c;
	    System.out.println("a value is: " +a);
	    System.out.println("b value is: " +b);
	    System.out.println("c value is: " +c);
	    System.out.println("Sum of total:" +d);
	   
	   }
	}


