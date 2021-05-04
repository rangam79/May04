package CoreJavaPgms;

public class ConstructorDemo {

	
	//it is a Special type of Method
	//it is used to initialize an instance variable.
	//Name must be same as Class name.
	//it can not contain return type.
	//it will execute during object is creation time.
	//it will execute one time for every object created.
	//it can contain any number of parameters.
	//A class can contains any number of constructors.
	
	ConstructorDemo(){
		System.out.println("this is constructor Example pgm");
	}
	
	ConstructorDemo(int i){
		System.out.println("this is constructor Example pgm23");
	}
	
	public static void main(String[] args) {
	
		ConstructorDemo cons =new ConstructorDemo();
		ConstructorDemo cons1 =new ConstructorDemo(8);
       
	}
	
	

}
