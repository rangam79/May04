package CoreJavaPgms;

class animal{
	
	void eating() {
		System.out.println("Eating");
	}
}


class dog extends animal{
	void barking() {
		System.out.println("Barking");
	}
}

class cat extends animal{
	void mowing() {
		System.out.println("Mowing");
	}
}
public class HeirachalInheritance {

	public static void main(String[] args) {
		
       dog d=new dog();
       d.eating();
       d.barking();
       cat c=new cat();
       c.eating();
       c.mowing();
       
	}

}
