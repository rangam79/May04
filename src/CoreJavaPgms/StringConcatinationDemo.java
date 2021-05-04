package CoreJavaPgms;

import java.util.Scanner;

public class StringConcatinationDemo {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string1:");
		
	String s1=	sc.nextLine();
		
		System.out.println("enter the second string: ");
		
		String s2=sc.nextLine();
		
		String s3=s1+s2;
		System.out.println(s3);
	}

}
