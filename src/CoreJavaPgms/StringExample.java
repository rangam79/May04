package CoreJavaPgms;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		/*
		 * String s=new String(); 
		 * Scanner sc= new Scanner(System.in);
		 * System.out.println("enter the string"); s=sc.nextLine();
		 * System.out.println(s); System.out.println(s.toUpperCase());
		 * System.out.println(s.toLowerCase());
		 */
		
		/*
		 * char ch[]= {'a','b','c','d','e'}; 
		 * String s=new String(ch);
		 * System.out.println(s);
		 */
		
		/*
		 * char ch[]= {'a','b','c','d','e','f'};
		 * 
		 * String s=new String(ch,2,4);
		 *  System.out.println(s);
		 */
		
		String s="Ranga";
		String s2=new String(s);
		
		System.out.println(s2);
		
		char c=s2.charAt(2);
		System.out.println(c);
		
		
	}

}
