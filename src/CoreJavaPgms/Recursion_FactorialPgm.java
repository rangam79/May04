package CoreJavaPgms;

class Factorialpgm{
	
	int fact(int n) {
		if(n==1) 
			return 1;
		int x= n*fact(n-1);
			return x;		
		}	
		
}


public class Recursion_FactorialPgm {

	public static void main(String[] args) {
       Factorialpgm fac= new Factorialpgm();
        int y=fac.fact(6);
        System.out.println(y);
	}
}



