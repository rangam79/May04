package CoreJavaPgms;

public class MethodoverloadingDemo {
	
  void	addition(int x,int y){
	  System.out.println(x+y);
		
	}
  
  void	addition(int x,int y, double d){
	  System.out.println(x+y+d);
		
	}
  
  void	addition(double x,double y, double d){
	  System.out.println(x+y+d);
		
	}

	public static void main(String[] args) {
		MethodoverloadingDemo add1=new MethodoverloadingDemo();
		add1.addition(8, 89);
		add1.addition(5, 8, 9.6);
		add1.addition(8.1,78.9,98.52);
		

	}

}
