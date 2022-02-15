package day28_constructorCall_staticKeyword;

public class C04 {

	
		
		    
		    static int count=30;
		    
		    public void increment() {
		        count++;
		    }
		    public static void main(String[] args) {
		        C04 obje1=new C04();
		        
		        C04 obje2=new C04();
		        
		        obje1.increment();
		        
		        obje2.increment();
		        
		        System.out.println("Obje1= count is="+obje1.count);
		        System.out.println("Obje2= count is="+obje2.count);
		

	}

}
