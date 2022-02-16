package day32_varars_stringBuilder;

public class C04_Varargs {

	public static void main(String[] args) {
		
		topla(5,8,9);
		//varargs her zaman son parametre olmali,
		//varargs dan once farkli parametreler kullanilabilir.
		//yazarsak java son parametrer olmalidir diye uyarir son parametre olmalidir diye itiraz eder
		//cte verir.
		
		
		
		}

		private static void topla(int sayi1, int ... sayilar) {
			int toplam=0;
			
			for (int each : sayilar) {
				
				toplam+=each;
				
				
			}
			
			System.out.println("girilen sayilarin toplami :" + toplam) ;
		
		
		
		
		}

	}


