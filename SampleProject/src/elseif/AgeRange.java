package elseif;

public class AgeRange {
	
	    public static void main(String arg[])
	    {
	    AgeRange obj=new AgeRange();
	    obj.Agelist(4);
	    }
	        public void Agelist(int age)
	        {
	        if(age<=5 && age>=0)
	        {

	        System.out.println("Baby");
	        }
	        else if(age>=6&& age<=13)
	        {
	        System.out.println("Child");
	        }
	        else if(age>=14 && age<=19)
	        {   
	        System.out.println("Teenage");
	        }
	        else if(age>=20 && age<=30)
	        {
	        System.out.println("Young");
	        }
	        else if(age>=31 && age<=40)
	        {
	        System.out.println("Senior");
	        }
	        else if(age>=41 && age<=50)
	        {
	        System.out.println("Senior Citizens");
	        }

	        else
	        {
	        System.out.println("Please check the Age");
	        }
	    }
	}


