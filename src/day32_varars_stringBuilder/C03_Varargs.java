package day32_varars_stringBuilder;

public class C03_Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
kafanaGoreis(5,8,9,10,2);
		
	//varargs da hic eleman olmazsada hic itiraz etmez.
//once int olarak tanimlanan sayilari eslestirir.
//kalan tum sayilari varargs a doldurur.
		
		
	}

	private static void kafanaGoreis(int sayi1,int sayi2, int... sayilar) {
		int toplam=0;
		
		for (int each : sayilar) {
			
			toplam+=each;
			
			
		}
		
		System.out.println("ilk sayi ile digerklerinin toplami ile carpimi:" +sayi1* toplam) ;
	
	}

}
