package MyProgram;

public class EB {
	
public static void main(String arg[])
    {
	EB obj=new EB();
	obj.bill(300);
	}
public void bill(int units)
        {   
	 
	double billpay=0.0;
 
        	if(units>0 && units<=100)
	 {
        		
      System.out.println("100 Units Free");	  
      }
        
                	if(units>101 && units<=200)
        	 {
        	      billpay=(units-100)*2.25;
        	  }
        	else if(units>201 && units<=400)
        	 {
        	   billpay=100*2.25+(units-200)*4.50;
        	 }
        	else if(units>401 && units<=500)
        	{
        	    billpay=100*2.25+100*4.50+(units-400)*6;
        	}
               System.out.println("Bill of units: "+units);
        	System.out.println("Bill to pay: "+billpay); 
              } 
}