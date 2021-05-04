package CoreJavaPgms;

class MethodDemoWithParameter {

	int addtion(int x,int y) {
		
		int z =x+y;
		return z;
	}
	public static void main(String[] args) {
		
		MethodDemoWithParameter ad=new MethodDemoWithParameter();
		int c=ad.addtion(52, 98);
		
       System.out.println(c);
	}

}
