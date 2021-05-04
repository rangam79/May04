package CoreJavaPgms;

public class ReverseStringDemo {

	public static void main(String[] args) {
		
		
		String s1= "RangaReddyMulagundla";
		String s2[]=s1.split(" ");
		
		
		System.out.println(s2.length);
		
		for(int i=0;i<s2.length;i++) {
			char ch1[]=s2[i].toCharArray();
			System.out.println(ch1.length);
			for(int j= ch1.length-1;j>=0;j--) {
				System.out.print(ch1[j]);
			}
			System.out.print(" ");	
			
		}
		
		//String s2
		
	}
	
}
