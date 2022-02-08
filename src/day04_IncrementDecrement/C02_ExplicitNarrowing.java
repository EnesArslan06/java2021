package day04_IncrementDecrement;

import java.util.Scanner;

public class C02_ExplicitNarrowing {

	public static void main(String[] args) {
		//eger buyuk data t�r�ndeki bir veriyi daha kucuk data turundeki variable a atamak istersek 
		//java bunu otomatik  olarak yapmaz. Assada hata verdi.
	
		Scanner scan=new Scanner(System.in);
		
		int sayi1=140;
		
		short sayi2= (short) sayi1;
		
		//esitligin sag� ile solu veri turleri farkl� oldugundan java mismatch hatas� verir.
		//sayi 1 in ist�ne k�rm�z� olan yere gelip beklersek java cozum olarak �neride bulunur
		//(short) yazar parantez icerisinde. sorumlulugu ustune alman laz�m der.
		//kucuk kovay� buyuge koyarken s�k�nt� yok ancak digeri s�k�nt�.
		
		System.out.println("sayi2 : " + sayi2);
		
		// suan problem yok. say�y� 140 olarak degistirdi
		
		byte sayi3=(byte) sayi2;   //bunuda kabul etmedi. byte shortan k�sad�r.
				
		System.out.println("sayi3 : " + sayi3);
		
		//int say�s�n� 140 olarak degi�tirisek -116 sonucu c�kar. byte -128 ile 127 degerlerini al�r.
		//byte da 127 yekadar gider -128 den tekrar s�f�ra dogru gider ve -116 say�s�n� bulur.
		
		double sayi4=87.3;
		int sayi5= (int) sayi4;		
		
		System.out.println("sayi5 :" + sayi5);
		
		//hata veriyor. k�rm�z� uzerine geldigimizde java int ekleme onerisinde bulunuyor.
		//ancak int virgulden sonras�n� almad�g� icin veri kayb� olur.
		//int virgulden sonras�n� almaz ve veri kayb� olur sonucu 87 c�kart�r.
		
		
		int sayi6=27;
		int sayi7=4;
		
		System.out.println(sayi6/sayi7);  
		
		// b�lme i�lemi yap�lan say�lar�n ikiside int oldugu i�in java sonucu int olarak yani ondal�klar� yazmaz.
		
		double sayi8=4;
		
		System.out.println(sayi6/sayi8); //sonuc 6.75. i�lem yap�lan say�lardan data t�r�ne 
									//daha geni� olan� double oldugundan sonuc doublenin i�ini kapsar.
		
		
		scan.close();
		
	

	}

}
