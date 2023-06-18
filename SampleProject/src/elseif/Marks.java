package elseif;

public class Marks {

	public static void main(String arg[]) {
		Marks Obj = new Marks();
		Obj.Score(92);
	}

	public void Score(int Mark) {

		if (Mark >= 90 && Mark <= 100) {
			System.out.println("A+");
		} else if (Mark >= 80 && Mark <= 89) {
			System.out.println("A");
		} else if (Mark >= 70 && Mark <= 79) {
			System.out.println("B+");
		} else if (Mark >= 60 && Mark <= 69) {
			System.out.println("B");
		} else if (Mark >= 50 && Mark <= 59) {
			System.out.println("C+");
		} else if (Mark >= 40 && Mark <= 49) {
			System.out.println("C");
		} else if (Mark >= 35 && Mark <= 39) {
			System.out.println("D");
		} else {
			System.out.println("other marks output is Fail");
		}
	}

}
