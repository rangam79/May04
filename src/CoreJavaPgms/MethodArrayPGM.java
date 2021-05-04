package CoreJavaPgms;

public class MethodArrayPGM {
      
	int add(int temp[]) {
		 int x=0;
		for(int i:temp) {
			 x=x+i;
			
		}
		return x;
	}
	
	public static void main(String[] args) {
		int a[]= {11,22,33,44,55};
		MethodArrayPGM arrpgm=new MethodArrayPGM();
		int y= arrpgm.add(a);
		
		System.out.println(y);
		   

	}

}
