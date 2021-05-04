package CoreJavaPgms;


 class employee {
	  
	  int bonus=10000;
}
public class SingleInheritanceDemo extends employee {

	float salary=12000;
	
	public static void main(String[] args) {
		
		SingleInheritanceDemo totalsal=new SingleInheritanceDemo();
		System.out.println(totalsal.salary+totalsal.bonus);
	}

}
