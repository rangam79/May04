package CoreJavaPgms;

   class Student12 {
	int x;
	
	Student12(int x){
	this.x=x;   //here we are assigning local variable to reference variable.
	//	x=x;     // here Local variable value is treating as default value "0"
	
	}
	
	 void Display(){
	
		System.out.println(x);
	
	}
}

public class ThisDemo2 {

	public static void main(String[] args) {
	
		Student12 st2=new Student12(85);
		
        st2.Display();
	}

}
