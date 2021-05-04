package CoreJavaPgms;

class student2{
	int stno;
 String stname;
 String stbranch;	
	student2(int a){
		stno=a;
		System.out.println(stno);
		
		System.out.println("3rd constructor");
	}
	
	student2(int a,String b,String c){
		stno=a;
		stname=b;
		stbranch=c;
		
		System.out.println(stno +"    "+stname +"  "+stbranch );
		System.out.println("1st constructor");
	}
	student2(int a,String b ){
		stno =a;
		stname=b;
		
		System.out.println(stno +"    "+stname  );
		System.out.println("2nd constructor");
	}
}

public class ConstructorDemo4 {
	

	public static void main(String[] args) {
		
		student2 st1 =new student2(101);
		
		student2 st2=new student2(102,"ranga");
		
		student2 st3=new student2(103,"siri","CSE");

	}

}
