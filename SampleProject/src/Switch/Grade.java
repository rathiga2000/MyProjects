package Switch;

public class Grade {
	
	    public static void main(String args[])
	    {
	     Grade obj=new Grade();
	    char n ;
	    obj.Result('A');
	    obj.Result('B');
	    obj.Result('C');
	    obj.Result('D');
	    obj.Result('E');
	    obj.Result('F');
	    }
	    public void Result(char n)
	    {
	    switch(n)
	    {
	    case 'A':
	    {
	    System.out.println("Student Marks between 90 to 100");
	    break;
	    }   
	    
	    case 'B':
	    {
	    System.out.println("Student Marks between 80 to 89");
	    break;
	    }   
	    case 'C':
	    {
	    System.out.println("Student Marks between 70 to 79");
	    break;
	   }   
	    case 'D':
	    {
	    System.out.println("Student Marks between 60 to 69");
	    break;
	    }   
	   case 'E':
	    {
	    System.out.println("Student Marks between 50 to 59");
	    break;
	    }   
	    default:
	    {
	    System.out.println("Less Marks Print Fail");
	    }  
	    } 
	    }
	 

}
