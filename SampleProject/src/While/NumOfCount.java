package While;
//print the number of Divisor from 1 to 100 number of 9 divisible, how many count;

public class NumOfCount {
	
	    public static void main(String args[])
	    {
	    NumOfCount obj=new NumOfCount();
	    obj.Sum_Value(1);
	    }
	    public void Sum_Value(int i)
	    {
	    
	    int Nine_Divi=0;
	    while(i<=100)
	    {
	    if(i%9==0)
	    {
	    Nine_Divi++;
	    }
	    i++;
	    }
	    System.out.println(Nine_Divi);
	    }
	}



