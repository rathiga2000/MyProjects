package String;

public class Study {

	public static void main(String[] args) {
		Study obj = new Study();
		Study obj1 = new Study();

		String s = "welcome";
		String s1 = "WELCOME";
		String s2 = "welcome";
		String a = new String("tree");
		String a1 = new String("tree");
		System.out.println("new keyword a hashcode is" + a.hashCode());
		System.out.println("new keyword a1 hashcode is" + a1.hashCode());
		System.out.println();
		System.out.println("obj string" + obj.hashCode());
		System.out.println("obj1 string" + obj1.hashCode());
		System.out.println();
		System.out.println("String s hashcode is" + s.hashCode());// scp//string constant pool
		System.out.println("String s1 hashcode is" + s1.hashCode());
		System.out.println("String s2 hashcode is" + s2.hashCode());// scp
		System.out.println(obj == obj1);
		System.out.println("obj and obj1 equal is: " + obj.equals(obj1));
		System.out.println("String s and s2 equal is: " +s.equals(s2));
		System.out.println(s == s2);
		System.out.println("String s and s1 equal is: " +s.equals(s1));
		System.out.println(s == s1);
		System.out.println("String s1 and s2 equal is: " +s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(a==a1);
		System.out.println(a.equals(a1));
		
	}

	@Override
	public String toString() {
		return "Study []";
	}

}
