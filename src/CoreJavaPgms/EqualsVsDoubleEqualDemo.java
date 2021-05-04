package CoreJavaPgms;

public class EqualsVsDoubleEqualDemo {

	public static void main(String[] args) {
		String s1="Hello";
		String s2=new String(s1);
		boolean status1=s1.equals(s2);
		boolean status2 =(s1==s2);
		System.out.println(status1);
		System.out.println(status2);

	}

}
