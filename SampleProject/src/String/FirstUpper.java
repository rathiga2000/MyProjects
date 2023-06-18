package String;

public class FirstUpper {

	public static void main(String[] args) {
FirstUpper obj=new FirstUpper();
obj.first();
	}
	public void first()
	{
	
	String str="my name is rathiga";
		char ch[] = str.toCharArray();
	    boolean flag = true;

	    for(int i = 0; i < ch.length; i++) {
	     if(Character.isLetter(ch[i])) {
	        if(flag) {

	          ch[i] = Character.toUpperCase(ch[i]);
	          flag = false;
	        }
	     }

      else {
	        flag = true;
	      }
	}

	    str= String.valueOf(ch);
	    System.out.println(str);
	  }
	
	
}

	