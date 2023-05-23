package ThisSuper;

public class TenthStudent {
	private int tamil;
	private int english;
	private int maths;
	void setTamil(int tamil)
	{
		this.tamil=tamil;
	}
	void setEnglish(int english)
	{
		this.english=english;
	}
	void setMaths(int maths)
	{
		this.maths=maths;
	}
	int getTamil()
	{
		return tamil;
		
	}
	int getEnglish()
	{
		return english;
		
	}
	int getMaths()
	{
		return maths;
		
	}
int total()
{
	return getTamil()+getEnglish()+getMaths();
	
}
int percentage()
{
	return total()/3;
}
}
