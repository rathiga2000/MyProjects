package While;
//300-250 divisible of 9
public class DivisibleOfSomeNum
{
  public static void main(String args[])
  {
  DivisibleOfSomeNum obj=new DivisibleOfSomeNum();
  obj.Sum_Value(300);
  }
  public void Sum_Value(int count)
  {
 
  while(count>=250)
  {
  if(count%9==0)
  {
  System.out.println(count);
  }
  count--;
  }
  }   
}

