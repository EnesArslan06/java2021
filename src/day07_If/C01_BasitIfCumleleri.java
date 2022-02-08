package day07_If;

import java.util.Scanner;

public class C01_BasitIfCumleleri {

	public static void main(String[] args) {
		/*
         * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
         * ve o harfle baslayan gun isimlerini yazdirin 
            Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             
            ilkHarf=S output = “Sali”
         *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
			Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gun isimlerinden birinin ilik harfini veriniz");
		
		char ilkHarf=scan.next().toUpperCase().charAt(0); //bunun anlamý kullanýcýnýn verdigi harfý buyutur ve
		//bizde ona göre chardaki ife ekledigimiz karaktere uygun gelmiþ olur.
		
		if (ilkHarf=='P') {System.out.println("Pazar, Pazartesi veya Persembe");}
		
		if (ilkHarf=='S') {System.out.println("Sali");	}
		
		if (ilkHarf=='C' || ilkHarf=='c') {System.out.println("Carsamba, Cuma, Cumartesi");	}
		
		//kucuk harfle yazarsa sistem calýsmaz c harflerinde yaptýgýmýz gibi yapabiliriz.
		//ancak baska bir yolu daha vardýr. Char karakterinin if eyazdýgýmýz gibi yazmasý lazým yoksa calýsmaz. 
		//bunu duzeltmenin yolu;
		//yukarýda "char ilkHarf=scan.next().charAt(0);" next. ' dan sonra . koyup prdan too uppercCase yazarsak kelimeyi buyuk harfe
		//tolovercase kelimenin tamamýný kucuk harfe cevirmiþ olaur.
		
		//ilk harflerden birini kullanýcý girmezse o zaman kullanýcýya uyarý mahiyetinde not yazdýrmalýyýz;
		
		if (ilkHarf!='C' && ilkHarf!='S' && ilkHarf!='P') { System.out.println("Gecersiz Harf Girdiniz..."
				+ "Lutfen gun isimlerinden birinin ilk harfini giriniz");}
			
	scan.close();
	
	// String non-primitive oldugu icin == kullanilmaz bunun yerine equals() kullanilmalidir
	
	}

}
