package day07_If;

import java.util.Scanner;

public class C01_BasitIfCumleleri {

	public static void main(String[] args) {
		/*
         * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
         * ve o harfle baslayan gun isimlerini yazdirin 
            Ornek:  ilkHarf=P output = �Pazar, Pazartesi veya Persembe�             
            ilkHarf=S output = �Sali�
         *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
			Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gun isimlerinden birinin ilik harfini veriniz");
		
		char ilkHarf=scan.next().toUpperCase().charAt(0); //bunun anlam� kullan�c�n�n verdigi harf� buyutur ve
		//bizde ona g�re chardaki ife ekledigimiz karaktere uygun gelmi� olur.
		
		if (ilkHarf=='P') {System.out.println("Pazar, Pazartesi veya Persembe");}
		
		if (ilkHarf=='S') {System.out.println("Sali");	}
		
		if (ilkHarf=='C' || ilkHarf=='c') {System.out.println("Carsamba, Cuma, Cumartesi");	}
		
		//kucuk harfle yazarsa sistem cal�smaz c harflerinde yapt�g�m�z gibi yapabiliriz.
		//ancak baska bir yolu daha vard�r. Char karakterinin if eyazd�g�m�z gibi yazmas� laz�m yoksa cal�smaz. 
		//bunu duzeltmenin yolu;
		//yukar�da "char ilkHarf=scan.next().charAt(0);" next. ' dan sonra . koyup prdan too uppercCase yazarsak kelimeyi buyuk harfe
		//tolovercase kelimenin tamam�n� kucuk harfe cevirmi� olaur.
		
		//ilk harflerden birini kullan�c� girmezse o zaman kullan�c�ya uyar� mahiyetinde not yazd�rmal�y�z;
		
		if (ilkHarf!='C' && ilkHarf!='S' && ilkHarf!='P') { System.out.println("Gecersiz Harf Girdiniz..."
				+ "Lutfen gun isimlerinden birinin ilk harfini giriniz");}
			
	scan.close();
	
	// String non-primitive oldugu icin == kullanilmaz bunun yerine equals() kullanilmalidir
	
	}

}
