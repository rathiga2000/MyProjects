package Collection;
import java.util.List;

import String.Television;

import java.util.Collections;
import java.util.ArrayList;

public class Student implements Comparable<Student>{
	private int rollno;
	private String name;
	private String collegeName;
	private int marks;
       public Student(int rollno, String name, String collegeName, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.collegeName = collegeName;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ",collegeName="
				+ collegeName + ", marks=" + marks + "]";
	}
	

	public static void main(String[] args) {
		List<Student>l=new ArrayList<Student>();
	l.add(new Student(111, "Rathiga",  "Asan Memorial",423));
	l.add(new Student(112, "Pavithra", "Asan Memorial",456));
	l.add(new Student(113, "Sathya",  "Asan Memorial",370));
	l.add(new Student(114, "Swetha", "Asan Memorial",400));
	l.add(new Student(115, "Karthik",  "Asan Memorial",240));
	l.add(new Student(116, "Raj", "Asan Memorial",498));
	System.out.println("before Sorting");
for(Student i:l)
{
	System.out.println(i);
}
Collections.sort(l);
System.out.println("after sorting");

for(Student i:l)
{
	System.out.println(i);
}
	}

	public int compareTo(Student o) {
		if (this.getMarks() > o.getMarks()) {
			return 1;
		}
		 else if (this.getMarks() < o.getMarks()) {
			return -1;
		} else
		return 0;
	}
	
}
