package day32_varars_stringBuilder;

public class C02_Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
topla(5,8,9,10);
		
		
		
		
	}

	private static void topla(int sayi1, int... sayilar) {
		int toplam=0;
		
		for (int each : sayilar) {
			
			toplam+=each;
			
			
		}
		
		System.out.println("ilk sayi ile digerklerinin toplami ile carpimi:" +sayi1* toplam) ;
	
	}

}
