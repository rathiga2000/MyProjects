package Hello;

public class Bank {
	private int bal;

	void credit(int amt)
	{
		bal=bal+amt;
		System.out.println("success depoisted");
	}
	void debit(int amt)
	{
		bal=bal-amt;
		System.out.println("succesfull debited");
	}
	void checkbalance()
	{
		System.out.println(bal);
	}

}
