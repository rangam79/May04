package CoreJavaPgms;

public class ReverseStringDemo3 {

	public static void main(String[] args) {
		String s="Malayalam";
		
		int len=s.length();
		String rs=new String();
		
		char ch[] = new char [len];
		int j=0;
		for(int i=len-1;i>=0;i--) {
			
			 ch [j]= s.charAt(i);
		     rs=new String(ch);
			j=j+1;
		     //System.out.print(rs);
		}
		System.out.println(rs);
		
		  if (rs.equalsIgnoreCase(s)) {
		  
		  System.out.println("given string is polindrum"); } else {
		  System.out.println("Given String is not polindrum");
		  
		  }
		 
	}
	}


