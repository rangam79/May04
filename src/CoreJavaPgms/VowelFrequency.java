package CoreJavaPgms;

public class VowelFrequency {

	public static void main(String[] args) {
		String st1="Rangareddy .Mulagundla";
		 String s2= st1.toLowerCase();
		    
		System.out.println(s2);
		
		int a=0,e=0,i=0,o=0,u=0;
		
		for(int j=0;j<s2.length();j++)
		{
			char ch=s2.charAt(j);
			
			
			
			if( ch=='a') { ++a;}
			if(ch=='e') {++e;}
			if(ch=='i') {++i;}
			if(ch=='o') {++o;}
			if(ch=='u') {++u;}
		}
		
		System.out.println(" vowel Frequency"  );
		System.out.println(  "a  " +a);
		System.out.println(  "e  " +e);
		System.out.println(  "i  " +i);
		System.out.println(  "o  " +o);
		System.out.println(  "u  " +u);
	}

}
