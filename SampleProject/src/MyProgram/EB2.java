package MyProgram;

public class EB2{
	public static void main(String arg[])
	{
		EB2 obj=new EB2();
		obj.bill(400);

}
public void bill(int units)
{
double billpay=0;

if(units>0 && units<=100)
{
	
System.out.println("100 Units Free");	  
}

    	if(units>101 && units<=400)//4.50
 {
      billpay=(units-300)*4.50;
  }
else if(units>401 && units<=500)
 {
   billpay=(100*4.50)+(units-400)*6;
 }
else if(units>501 && units<=600)
{
    billpay=(100*4.50)+(100*6)+(units-500)*8;
}
else if(units>601 && units<=800)
{
	billpay=(100*4.50)+(100*6)+(100*8)+(units-700)*9;
	
}
else if(units>801 && units<=1000)
{
	billpay=(100*4.50)+(100*6)+(100*8)+(100*9)+(units-900)*10;
	
}
else if(units>1000)
{
	billpay=(100*4.50)+(100*6)+(100*8)+(100*9)+(100*10)+(units-900)*11;

}
    	
   System.out.println("Bill of units: "+units);
System.out.println("Bill to pay: "+billpay); 
  } 
}
