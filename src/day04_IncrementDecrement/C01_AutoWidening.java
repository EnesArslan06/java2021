package day04_IncrementDecrement;

public class C01_AutoWidening {

	public static void main(String[] args) {
		
		
		//byte-short-int-long-float-double s�ralamas� bu �ekildedir. bunlar ars�ndan ge�i� yap�labilir.

				byte sayi1=44;
				
				short sayi2= sayi1;
				
				//esitligin sol taraf�i short sag taraf� byte. iki data turu farkl� oldugu halde java itiraz etmiyor. 
				//��nk� atama yap�lan variablein turu (short) atanan degerin veri turunden buyuk oldugu icin
				//sorun olusmaz. yani short buyuktur byte degerinden.
				
				System.out.println("sayi2:" + sayi2);
				
				int sayi3= 55;
				
				double sayi4= sayi3;
				System.out.println("sayi4:" + sayi4);
				
				//double int den buyuk oldugu icin s�k�nt� olmaz. Otomatik degeri al�r java.
				//ancak kucuk olursa o zaman kabul etmez.   
				//atanan degerin data t�r� deger atanan veriablen data t�r�nden k�c�kse  Java Castingi otomatik yapar.		
				//otomatik duzeltmeye auto widining denir.

	}

}
