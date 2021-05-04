package CoreJavaPgms;

public class MolConstructor {
	
	MolConstructor(){
		System.out.println("Zero parameterized constructor");
	}
	
	MolConstructor(String name){
		System.out.println("the name is" +name);
	}

	public static void main(String[] args) {
		
		MolConstructor sample=new MolConstructor();
		MolConstructor sample1 =new MolConstructor("Ranga");
	}

}
