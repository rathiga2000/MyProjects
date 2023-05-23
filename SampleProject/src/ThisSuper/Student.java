package ThisSuper;

public class Student extends Human{
	int marks;
	int rollno;
    int std;
    int total;
    
    Student()
    {
    	//super();
    	this. total=600;
    }
    Student(int marks)
    {
    	//super(2);
    	this();
    	this.marks=marks;
    }
	
  Student(int marks,int rollno) 
 { 
		 this(marks); 
		 this.rollno=rollno;	 
 }
	 
Student(int marks,int rollno,int std)
    {
    	this(marks);
    	this.std=std;
    	
   }
    void display()
    {
    System.out.println("Total= " +this.total+ " Marks= " +this.marks+ " roll no= " + this.rollno+ " Standard= " +this.std);
    }
   
public static void main(String arg[])
{
	//Student S1=new Student();
	Student S2=new Student(300);
	Student S3=new Student(400,45678);
	//Student S4=new Student(300,45678,12);
	//S1.display();
	S2.display();
	//S3.display();
	//S4.display();

}

}
