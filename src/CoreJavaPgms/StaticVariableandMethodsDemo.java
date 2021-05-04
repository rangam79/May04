package CoreJavaPgms;

public class StaticVariableandMethodsDemo {
  
	int rollno;
	String Name;
	static String collegename ="VIT";
	StaticVariableandMethodsDemo(int r,String n){
		 rollno=r;
		 Name=n;
	}
	
	static void change() {
		collegename ="Vignan";
	}
	void display() {
		
		System.out.println( rollno  +"    " + Name +"   "+ collegename);
	}
	
	
	public static void main(String[] args) {
		//StaticVariableandMethodsDemo.change();
		
		StaticVariableandMethodsDemo st=new StaticVariableandMethodsDemo(1254,"ranga");
		st.display();

	}

}
