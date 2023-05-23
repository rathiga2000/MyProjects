package ThisSuper;

public class IndianBank {
	private String ific;
	private String name;
	private int bankBalance;
	private String bankName;
	IndianBank()
	{
		String ific=null;
		String name=null;
		int bankBalance=0;
		String bankName=null;
	}
		IndianBank(int bankBalance)
	{
		this.bankBalance=bankBalance;
	}
	IndianBank(String ific, String name)
	{
	   this.ific=ific;
	   this.name=name;
	}
	IndianBank(String bankName, String name, int bankBalance)
	{
		this.bankName=bankName;
		   
		this.name=name;
		this.bankBalance=bankBalance;
	}
	IndianBank(String ific, String name,int bankBalance,String bankName)
	{
	   this.ific=ific;
	   this.name=name;
		this.bankBalance=bankBalance;
		this.bankName=bankName;
	}
	 void setIFIC(String ific)
	 {
		 this.ific=ific;
	 }
	 void setName(String name)
	 {
		 this.name=name;
	 }
	 void setBalance(int bankBalance)
	 {
		 this.bankBalance=bankBalance;
	 }
	 void setBankName(String bankName)
	 {
		 this.bankName=bankName;
	 }
	 String getIFIC()
	 {
		 return ific;
	 }
	 String getName()
	 {
		 return name;
	 }
	 int getBalance()
	 {
		 return bankBalance;
	 }
	 String getBankName()
	 {
		 return bankName;
	 }
	 void display()
	 {
System.out.println("IFIC: "+this.ific+ " Name: " +this.name+ " BankBalance: "+this.bankBalance+ " BankName: "+this.bankName);
		 
	 }
	 void loan()
	 {
		 if(bankBalance>=2000)
		 {
			 System.out.println(bankBalance + " Eligible Person for Loan ");
		 }
		 else
		 {
			 System.out.println(bankBalance + " Not Eligible Person for Loan ");
		 }
	 }
}



