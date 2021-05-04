package CoreJavaPgms;


public class ObjectDemo2 {
     int sum=0;
	
     int addition(Student1 st1)	{
 		
     	sum=(st1.StEng+st1.Sthind+st1.StMat+st1.Stsince+st1.Stsocial+st1.StTel);
     	
     	
     	return sum;
     	
     }
     
     
     public static void main(String[] args) {
    		Student1 st1=new Student1();
		ObjectDemo2 obj=new ObjectDemo2();
	
		
		int result=obj.addition(st1);
        System.out.println(result);
	}

  
	
	
}
