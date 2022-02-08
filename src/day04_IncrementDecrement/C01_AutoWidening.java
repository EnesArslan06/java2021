package day04_IncrementDecrement;

public class C01_AutoWidening {

	public static void main(String[] args) {
		
		
		//byte-short-int-long-float-double sıralaması bu şekildedir. bunlar arsından geçiş yapılabilir.

				byte sayi1=44;
				
				short sayi2= sayi1;
				
				//esitligin sol tarafıi short sag tarafı byte. iki data turu farklı oldugu halde java itiraz etmiyor. 
				//çünkü atama yapılan variablein turu (short) atanan degerin veri turunden buyuk oldugu icin
				//sorun olusmaz. yani short buyuktur byte degerinden.
				
				System.out.println("sayi2:" + sayi2);
				
				int sayi3= 55;
				
				double sayi4= sayi3;
				System.out.println("sayi4:" + sayi4);
				
				//double int den buyuk oldugu icin sıkıntı olmaz. Otomatik degeri alır java.
				//ancak kucuk olursa o zaman kabul etmez.   
				//atanan degerin data türü deger atanan veriablen data türünden kücükse  Java Castingi otomatik yapar.		
				//otomatik duzeltmeye auto widining denir.

	}

}
