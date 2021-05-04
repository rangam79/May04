package CoreJavaPgms;

public class CompareToDemo {

	public static void main(String[] args) {
		
		String s1="hello";
		String s2="jello";
		String s3="hello";
		String s4="HELLO";
		String s5= s1.substring(1,3);
		
		
		int n1=s1.compareTo(s2);
		int n2=s1.compareTo(s3);
		int n3=s2.compareTo(s3);
		int n4=s3.compareToIgnoreCase(s4);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		System.out.println(n4);
        System.out.println(s5);
	}

}
