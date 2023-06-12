package String;

public class Student {

	private int rollno;
	private String name;
	private String department;
	private String collegeName;

	public static void main(String[] args) {
		Student obj = new Student(111, "Rathiga", "computer science", "Asan Memorial");
		Student obj1 = new Student(112, "Pavithra", "Mathsmatics", "Asan Memorial");
		Student obj2 = new Student(113, "Sathya", "Biology", "Asan Memorial");
		System.out.println("first student details");
		System.out.println(obj.toString());
		System.out.println("second student details");
        System.out.println(obj1.toString());
		System.out.println("Third student details");
		System.out.println(obj2.toString());

	}

	public Student(int rollno, String name, String department, String collegeName) {
		this.rollno = rollno;
		this.name = name;
		this.department = department;
		this.collegeName = collegeName;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getRollno() {
		return rollno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartmentName() {
		return department;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public String toString() {
		return this.rollno + " " + this.name + " " + this.department + " " + this.collegeName;
	}
}
