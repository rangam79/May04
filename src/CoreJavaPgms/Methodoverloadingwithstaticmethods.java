package CoreJavaPgms;

public class Methodoverloadingwithstaticmethods {
	
	static void add1(int x,int y) {
		System.out.println("result1   "+(x+y));
	}
	
	static void add1(double x,int y) {
		System.out.println("result2  "+ (x+y));
	}
	
	public static void main(String[] args) {
		add1(5.8, 89);
		add1(8,9);
		

	}

}
