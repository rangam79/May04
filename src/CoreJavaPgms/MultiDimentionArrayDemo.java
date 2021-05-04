package CoreJavaPgms;

public class MultiDimentionArrayDemo {

	public static void main(String[] args) {
		/*int a[][]=new int[2][2];
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j] +"  ");
			}
			System.out.println();*/
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int []i:a) {
			for(int j:i) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}

}
