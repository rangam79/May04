package CoreJavaPgms;

public class BreakDemo {

	public static void main(String[] args) {
		
		
		int sum=0;
		int capacity=10;
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			sum=sum+i;
			if (sum>= capacity) 
				break;
			
			
		}
		System.out.println(sum);

	}

}
