package String;

public class AllMethods {

	public static void main(String[] args) {
		AllMethods obj = new AllMethods();
//		obj.value();
//		obj.ascii();
		obj.cut();
//		obj.concat();
//		obj.split();
//		obj.num();
//		obj.trip();
//		obj.myrep();
//		obj.same();
//		obj.point();
		
	}

	public void value() {
		String s = "Welcome to my Home";
      
		System.out.println("String of length");
		s.length();
		// public int length() no parameter
		System.out.println(s.length());
		System.out.println("Print split a char");
		for (int i = 0; i < s.length(); i++) {
			// public char charAt(int i)
			System.out.println(s.charAt(i));

		}
		String a="Pink";
		System.out.println("lower case value");
		String lower = s.toLowerCase();
		System.out.println(lower);
		System.out.println("upper case value");
		String upper = s.toUpperCase();
		System.out.println(upper);
		System.out.println("Start Value");
		System.out.println(a.startsWith("P"));
		System.out.println("End Value");
		System.out.println(a.endsWith("k"));
	}

	public void ascii() {
		System.out.println("a ascii number");
		char c = 'a';
		int a = c;
		System.out.println(a);
		System.out.println("100 ascii char");
		int num = 100;
		char n = (char) num;
		System.out.println(n);
	}

	public void cut() {
		//System.out.println("Give String length");
		
		String s = "   Hi and Welcome   ";
		
		System.out.println(s.length());
		System.out.println("Ater Trim value");
		String afterTrim = s.trim();
		
		//System.out.println(afterTrim.length());
		System.out.println(afterTrim);
	}

	public void concat() {
		String first = "Mango";
		// first=first+"Apple";
		first = first.concat(" Apple ").concat(" Guava ").concat(" orange ");
		// first=first.concat("Guava");
		System.out.println(first);
	}

	public void split() {
		String s = "India";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			int n = s.charAt(i);
			sum = sum + n;
		
			System.out.println((char)n+ " Ascii value " + n);
		}
			System.out.println("sum of value");
			System.out.println(sum);

	}
	public void num()
	{
		int a=9;
		 char b='f';
		 boolean c=false;
		 double d=7.9;
		String s=String.valueOf(a);//static method
	s=s+String.valueOf(b);
	s=s+String.valueOf(c);
	s=s+String.valueOf(d);
	
		System.out.println(s);
		
		
		String s2="java"; 
		String s3="java";//0b
		String s4="Apple";
		String s5="Rathiga";
		System.out.println(s3.compareTo(s4));
		System.out.println(s2.compareTo(s3));
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());
	}
	public void trip()
	{
		
		String b = "   Hi and Welcome   ";
		
		System.out.println(b.strip());//first and last not print
		System.out.println(b.stripLeading());//last space printed
		System.out.println(b.stripTrailing());//first space printed
		char[]s= {'h','e','l','l','o'};
		String m="hai";
		String n=m.copyValueOf(s);//offset,count; char
		System.out.println(n);
		
	}
	//public string replace(charSequence target,charsquence replacement)
	public void myrep()
	{
		String a1="This is Science Department";
		String s1=a1.replaceFirst("i", "a");
		String s2=a1.replace("Science", "Maths");
		String s3=a1.replace("e", "r");
		String s5=a1.replace("et", "xy");//not changed other char changed word
		String s6=a1.replace("is","ty");
		String s4=a1.replaceAll("i","t");
		System.out.println(a1);
		System.out.println(s1);	
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
	}
	public void same()
	{
		String s="rathu";
		System.out.println(s.contains(s));
		System.out.println(s.contentEquals(s));
	}
	public void point()
	{
		String  str=new String("Hello");
		int beginIndex=0;
		int endIndex=5;
		System.out.println(str.codePointCount(beginIndex, endIndex));
		System.out.println(str.codePointCount(3, 5));//(begin,end)
		String s="Myprogram";
		System.out.println(str.codePointAt(2));
		
		
	}
//	public void count()
//	{
//		String s=" Welcome to Home";
//		
//		Scanner sc=new Scanner(System.in);
//		
//	}
	
}
