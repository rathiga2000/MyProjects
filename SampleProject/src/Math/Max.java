package Math;
import java.util.Scanner;
public class Max {
	   public static void main(String arg[])
	   {
		   	   System.out.println("Enter a value");//a is base
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
     System.out.println("Enter b value");//b is exponent
       double b=sc.nextDouble();
//       System.out.println("Enter the c value");
//       int c=sc.nextInt();
	   
    System.out.println("Maximun number: " +Math.max(a,b));
       System.out.println("Minimum number: " + Math.min(a,b));
       System.out.println("Power of value: " + Math.pow(a,b));
       System.out.println("The absolute Value: " +Math.abs(a));
       System.out.println("Round of Value: " +Math.round(a));
     System.out.println("Square root of: " +Math.sqrt(a));

             System.out.println("ceil of value: " +Math.ceil(a));
      System.out.println("floor of value:" +Math.floor(a));
        System.out.println("Random Value of:" +Math.random());
       System.out.println("Sin theta value: " +Math.sin(a));
        System.out.println("cos theta value is: "+Math.cos(a));
       System.out.println("tan theta value is: " +Math.tan(a));
        System.out.println("log value is: " +Math.log(a));
      System.out.println("log10 value is: " +Math.log10(a));
        System.out.println("cube root of:" +Math.cbrt(a));
       System.out.println("return the round of value: " +Math.rint(a));
    System.out.println("Sign number is" +Math.signum(a));
//       4
    
      //System.out.println(Math.incrementExact(2));        
       
    //   System.out.println(Math.incrementExact(a));      
 

	   }
       
	}
