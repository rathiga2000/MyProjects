package String;

public class Simple {

	public static void main(String[] args) {

		Simple obj = new Simple();
		System.out.println(obj);

		Simple obj1 = new Simple();
		System.out.println(obj1);
		System.out.println(obj.getClass());
		System.out.println(obj1.getClass());

		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());

		System.out.println(obj.equals(obj1));// false

		System.out.println(obj.toString());
		System.out.println(obj1.toString());

	}

}
