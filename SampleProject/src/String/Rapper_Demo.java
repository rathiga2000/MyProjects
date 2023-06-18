package String;

public class Rapper_Demo {

	public static void main(String[] args) {
		Rapper_Demo obj = new Rapper_Demo();
		obj.num();
		obj.change();
        obj.value();
	}

	public void num() {
		String pincode = "42";
		int pin = Integer.parseInt(pincode);
		pin = pin + 600000;
		System.out.println(pin);
	}

	public void change()

	{
		String height = "6.8";
		double high = Double.parseDouble(height);
		System.out.println(high);
		String num = "7.8";
		float f = Float.parseFloat(num);
		float ff = 7.8f;
		System.out.println(ff);
	}

	public void value() {
		int a = 9;
		char b = 'f';
		boolean c = false;
		double d = 7.9;
		String s = String.valueOf(a);// static method
		s = s + String.valueOf(b);
		s = s + String.valueOf(c);
		s = s + String.valueOf(d);

		System.out.println(s);

	}
}