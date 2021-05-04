package CoreJavaPgms;

public class ArraysDemo {

	public static void main(String[] args) {
		
		
		/*
		 * int a[] = new int[5]; a[0]=1; a[1]=3; a[2]=54; a[3]=55; a[4]=67;
		 */
		int a[]= {110,3,54,55,67};
		/*
		 * for(int i=0;i<=a.length;i++) { System.out.println(a[i]); }
		 */

		for(int i:a) {
			System.out.println(i);
		}
		
	}

}
