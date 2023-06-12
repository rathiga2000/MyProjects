package String;

import java.util.Objects;

public class Employee {
	private int empId;
	private String empName;
	private int age;
	private long aadharNo;

	public static void main(String[] args) {
		Employee emp1 = new Employee(1234, "Ravi", 23, 234567);
		Employee emp2 = new Employee(1235, "Swetha", 24, 236734);
		Employee emp3 = new Employee(1236, "Karthik", 30, 235673);
		Employee emp4 = new Employee(1237, "Narmatha", 21, 238904);
		Employee emp5 = new Employee(1238, "Suganya", 30, 236734);
		Employee emp6 = new Employee(1238, "Suganya", 30, 236734);
        System.out.println("Employee details");
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		System.out.println(emp4.toString());
		System.out.println(emp5.toString());
		System.out.println(emp6.toString());
		System.out.println();
        System.out.println("Employee Details Equals or not");
		System.out.println(emp1.equals(emp2));
		System.out.println(emp2.equals(emp3));
		System.out.println(emp3.equals(emp4));
		System.out.println(emp4.equals(emp5));
		System.out.println(emp5.equals(emp6));//true//Duplicate value
		System.out.println();
		System.out.println("Employee Hashcode");
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		System.out.println(emp4.hashCode());
		System.out.println(emp5.hashCode());
		System.out.println(emp6.hashCode());

	}

	public Employee(int empId, String empName, int age, long aadharNo) {
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.aadharNo = aadharNo;

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;

	}

	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", aadharNo=" + aadharNo + "]";

	}

	public int hashCode() {
		return Objects.hash(aadharNo, age, empId, empName);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee check = (Employee) obj;
	return aadharNo == check.aadharNo && age == check.age && empId == check.empId && empName == check.empName;
				//&& Objects.equals(empName, check.empName);
	}

}
