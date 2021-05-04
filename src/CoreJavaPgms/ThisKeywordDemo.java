package CoreJavaPgms;

public class ThisKeywordDemo {
	
	int x=10;
	
	ThisKeywordDemo(){
		int x=20;
		
		//System.out.println(x);
		System.out.println(this.x);
	}

	public static void main(String[] args) {
		ThisKeywordDemo key1= new ThisKeywordDemo();
		    
	}

}
