package ForLoop;



public class BetweenOfOddNum {

	public static void main(String args[])
    {
    BetweenOfOddNum obj=new BetweenOfOddNum();
    obj.Odd_Between(450);
    }
    public void Odd_Between(int i)
    {
   
    for(;i<=500;i++)
    {
   
    
    if(i%2!=0)
    {
    System.out.println(i);
    }
    
    }   
}
}

