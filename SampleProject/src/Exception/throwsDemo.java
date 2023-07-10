package Exception;

public class throwsDemo {
	static void divide (int a, int b) throws ArithmeticException,DenominatorException{
		if( a<=0) {
			throw new DenominatorException("Neumorator zero");
		}
		int c = a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		try{
			divide( 0,7);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		  catch(DenominatorException e) 
		{ 
			//  System.out.println(e.getMessage()); 
			e.printStackTrace();
			  }
		 
	}


}
