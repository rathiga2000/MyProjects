package String;
public class Builders {
     public static void main(String[] args) {
		String s = "Welcome";

		StringBuilder sb = new StringBuilder(s);
		System.out.println("Print the Orginal String: " +sb);
		sb.append("Home");
		System.out.println("Add String: " + sb);
		sb.insert(7, "Always");
		System.out.println("Insert of String: " + sb);

		sb.replace(2, 5, "Hello");
		System.out.println("Replace the String : " + sb);

		sb.delete(4, 7);
		System.out.println("Delete String Character: " + sb);
		sb.deleteCharAt(3);
		System.out.println("Delete one char of string:" + sb);
		sb.reverse();
		System.out.println("Reverse of string: " + sb);
		String output = sb.toString();
		System.out.println("Print Last Output is :" +output);

	}
	}


