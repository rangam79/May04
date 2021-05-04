package CoreJavaPgms;

class add{
	int a=10;
	int b=5;
	void add() {
	System.out.println(a+b);
	}
}

class sub extends add {
	void sub() {
		System.out.println(a-b);
	}
}

class mul extends sub{
	void mul() {
		System.out.println(a*b);
	}
}

class div extends mul{
	void div() {
		System.out.println(a/b);
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		div d =new div();
		d.add();
		d.sub();
		d.mul();
		d.div();

	}

}
