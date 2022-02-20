package day40_expection;

public class C01_exception {

	public static void main(String[] args) {

		int a=20;
		int b=0;
				
		
		
		try {
			System.out.println("sayilarin bolumu"+" "+ a/b);//bu islemi yapmaya devap et
		} catch (ArithmeticException e) {
			System.out.println("Sifira bolum yapilamaz");
			//System.out.println(e.getMessage());/// by zero exceptionun kaynagi
			e.printStackTrace();//hem hatayi gosteriyor hem kod calismaya devam ediyor
		
		
		
		}
		
		System.out.println("Gorev tamamlandi");
	

//0 a bolum yapýlamaz dedi ve gorev tamamlandi dedi
//try catch ile biz hatali olsada devam et gorevi tamamla dedik
	
	
	

	
	
}}
