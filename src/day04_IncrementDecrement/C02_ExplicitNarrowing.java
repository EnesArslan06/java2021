package day04_IncrementDecrement;

import java.util.Scanner;

public class C02_ExplicitNarrowing {

	public static void main(String[] args) {
		//eger buyuk data türündeki bir veriyi daha kucuk data turundeki variable a atamak istersek 
		//java bunu otomatik  olarak yapmaz. Assada hata verdi.
	
		Scanner scan=new Scanner(System.in);
		
		int sayi1=140;
		
		short sayi2= (short) sayi1;
		
		//esitligin sagý ile solu veri turleri farklý oldugundan java mismatch hatasý verir.
		//sayi 1 in istüne kýrmýzý olan yere gelip beklersek java cozum olarak öneride bulunur
		//(short) yazar parantez icerisinde. sorumlulugu ustune alman lazým der.
		//kucuk kovayý buyuge koyarken sýkýntý yok ancak digeri sýkýntý.
		
		System.out.println("sayi2 : " + sayi2);
		
		// suan problem yok. sayýyý 140 olarak degistirdi
		
		byte sayi3=(byte) sayi2;   //bunuda kabul etmedi. byte shortan kýsadýr.
				
		System.out.println("sayi3 : " + sayi3);
		
		//int sayýsýný 140 olarak degiþtirisek -116 sonucu cýkar. byte -128 ile 127 degerlerini alýr.
		//byte da 127 yekadar gider -128 den tekrar sýfýra dogru gider ve -116 sayýsýný bulur.
		
		double sayi4=87.3;
		int sayi5= (int) sayi4;		
		
		System.out.println("sayi5 :" + sayi5);
		
		//hata veriyor. kýrmýzý uzerine geldigimizde java int ekleme onerisinde bulunuyor.
		//ancak int virgulden sonrasýný almadýgý icin veri kaybý olur.
		//int virgulden sonrasýný almaz ve veri kaybý olur sonucu 87 cýkartýr.
		
		
		int sayi6=27;
		int sayi7=4;
		
		System.out.println(sayi6/sayi7);  
		
		// bölme iþlemi yapýlan sayýlarýn ikiside int oldugu için java sonucu int olarak yani ondalýklarý yazmaz.
		
		double sayi8=4;
		
		System.out.println(sayi6/sayi8); //sonuc 6.75. iþlem yapýlan sayýlardan data türüne 
									//daha geniþ olaný double oldugundan sonuc doublenin içini kapsar.
		
		
		scan.close();
		
	

	}

}
