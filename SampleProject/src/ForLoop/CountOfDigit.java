package ForLoop;



public class CountOfDigit {

    public static void main(String arg[])
    {
    CountOfDigit obj=new CountOfDigit();
    obj.Sum(721);
    obj.Sum(2345);
    }
    public void Sum(int num)
    {
    	int count = 0;
        System.out.println("print given number " +num);

        for (;num != 0;count++) 
        {
        	num=num/10;
        }
        System.out.println("Number of digits: " + count);
      }
    }


