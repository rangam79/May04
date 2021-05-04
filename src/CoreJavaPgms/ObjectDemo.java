package CoreJavaPgms;

class student{
	int studentno=12232;
	String studentname="SriUtsavi";
	double marks=2343.343;
}

public class ObjectDemo {

	public static void main(String[] args) {
	ObjectDemo obj=new ObjectDemo();
	
student st1=new student();
obj.display(st1);
	}

	void display(student s2) {
		System.out.println(s2.studentname);
		System.out.println(s2.studentno);
		System.out.println(s2.marks);
		
	}
	
	
}
