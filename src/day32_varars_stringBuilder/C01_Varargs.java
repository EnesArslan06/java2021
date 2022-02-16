package day32_varars_stringBuilder;

public class C01_Varargs {

	public static void main(String[] args) {
//varargs a kac tene deger gonderirsek alýyor ve islemi yapiyor.
//for each loop ile yapiyoruz.
		
		topla(5,8,9);
		
		
		
		
	}

	private static void topla(int... sayilar) {
		int toplam=0;
		
		for (int each : sayilar) {
			
			toplam+=each;
			
			
		}
		
		System.out.println("girilen sayilarin toplami :" + toplam) ;
	}

}
