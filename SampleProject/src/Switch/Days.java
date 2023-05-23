package Switch;

public class Days {
	
	    public static void main(String args[])
	    {
	    Days obj=new Days();
	    int n ;
	    obj.Weeks(1);
	    obj.Weeks(2);
	    obj.Weeks(3);
	    obj.Weeks(4);
	    obj.Weeks(5);
	    obj.Weeks(6);
	    obj.Weeks(7);
	    obj.Weeks(8);
	    
	    }
	    public void Weeks(int n)
	    {
	    switch(n)
	    {
	    case 1:
	    {
	    System.out.println("Monday");
	    break;
	    }   
	    
	    case 2:
	    {
	    System.out.println("Tuesday");
	    break;
	    }   
	    
	    case 3:
	    {
	    System.out.println("Wednesday");
	    break;
	   }   
	    case 4:
	    {
	    System.out.println("Thursday");
	    break;
	    }   
	   case 5:
	    {
	    System.out.println("Friday");
	    break;
	    }   
	    
	     case 6:
	    {
	    System.out.println("Saturday");
	    break;
	    }
	    
	    case 7:
	    {
	    System.out.println("Sunday");
	    break;
	    }   
	    
	   default:
	    {
	    System.out.println("other input called wrong");
	    }  
	    } 
	}
	    
	


}
