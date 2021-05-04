package CoreJavaPgms;

public class MethodOverloadingMainMethod {
	public static void main(int[] args) {
		System.out.println("int array");

	}
	public static void main(int args) {
		System.out.println("int argumnets");

	}

	public static void main(String[] args) {
		main( new int  [] {8,7,9,});
		main(8);
	}

}
