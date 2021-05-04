package CoreJavaPgms;

class AdditionWR {
	  
	 int add() {
		 
		 int x=12;
		 int y=25;
		 int z=x+y;
		return z;
		 
	 }
}

public class MethodDemo2 {

	public static void main(String[] args) {
		AdditionWR ad=new AdditionWR();
	       int result=ad.add();
	       System.out.println(result);

	}

}
