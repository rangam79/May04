package CoreJavaPgms;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("RangaReddy.Mulagundla");
		//Length
		System.out.println(sb.length());
		//Append
		System.out.println(sb.append(" Selenium Tester"));
        //Delete
		System.out.println(sb.delete(22, 26));
		//Delete char at particular location
		
		System.out.println(sb.deleteCharAt(28));
		
		//SubString
		System.out.println(sb.substring(12));
		System.out.println(sb.substring(14, 25));
		
		//insert
		System.out.println(sb.insert(8,"  keerty"));
		//replace
		System.out.println(sb.replace(8, 15, "SriUtsavi"));
		
		//reverse
		System.out.println(sb.reverse());
		
	}

}
