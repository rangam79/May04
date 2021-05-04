package CoreJavaPgms;

import java.util.Scanner;

public class ReverseStringDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		StringBuffer sb=new StringBuffer(st);
		//System.out.println(sb);
         StringBuffer rs= (sb.reverse());
         System.out.println(rs);
        // System.out.println(sb);
         String sb1=rs.toString();
		if(sb1.equalsIgnoreCase(st)){
			
			System.out.println("Given String is polindrum");
			
		}else {
			System.out.println("Given String is not polindram");
		}
			

	}

}
