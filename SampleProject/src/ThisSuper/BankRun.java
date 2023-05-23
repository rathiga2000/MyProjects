package ThisSuper;

public class BankRun {
	public static void main(String args[])
	{
		IndianBank c1=new IndianBank("IND567834","rathiga",4000,"Indian Bank");
		IndianBank c2=new IndianBank("IND567834","priya");
        IndianBank c3=new IndianBank("Indian Bank","Pavi",500);
        IndianBank c4=new IndianBank();
        IndianBank c5=new IndianBank(2000);

		c1.display();
		c2.display();
		c3.display();
		c4.display();
		c5.display();
		c1.loan();
		c2.loan();
		c3.loan();
		c4.loan();
		c5.loan();
}
}
