package CoreJavaPgms;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String st1=new String("ranga reddy");
		String st2="RANGA Reddy";
		
		//Here st1 will stored in Heap Memory
		//st2 will stored in string Consatnt pool
		
		
		//1.length()
		System.out.println(st1.length());
		System.out.println(st2.length());
		
		
		//2.CharAt()
		
		System.out.println(st1.charAt(3));
		System.out.println(st2.charAt(6));
		
		//Concat()
		System.out.println(st1.concat(st2));
		
		//equals()
		System.out.println(st1.equals(st2));
		
		//equalsIgnorCase
		System.out.println(st1.equalsIgnoreCase(st2));
		
		
	}

}
