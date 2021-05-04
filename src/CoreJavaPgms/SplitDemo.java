package CoreJavaPgms;

public class SplitDemo {

	public static void main(String[] args) {
		String s1 = "ran agre ddy";
		String s2[] = s1.split(" ");

		
		/*
		 * for (int i=0;i<s2.length;i++) { 
		 * System.out.println(s2[i]);
		 * 
		 * }
		 */
		 
		for (int i=0;i<s1.length();i++) {
		      char ch=  s1.charAt(i);
		      
		         
		        System.out.println(ch);
		      
		}
	}

}
