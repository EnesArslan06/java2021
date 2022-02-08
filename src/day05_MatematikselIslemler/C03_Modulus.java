package day05_MatematikselIslemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
		/* slayt 59 da geciyor konu
		 int a=15/4; iþleminde kalaný bulmak istersek javada modulus iþlemi kullanýlýr
		
		 */
		//int a=15%4; //dedigimizde kalaný elde ederiz modulus iþlemi yapmamýz lazým.
		
		//kullanýcýdan 3 basamaklý bir sayý alýp rakamlar toplamýný yazdýran bir program yazýn?
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 3 basamaklý bir sayý giriniz:");
		
		int sayi=scan.nextInt();
		
		//sayi 573 olsun. Burada iki iþlem bizim için cok onemli
		
		int rakamlarToplami=0;
		
		//ilk once 573 deki 3 sayýsýný almamýz lazým.
		 //bir sayýnýn 10 ile bölümü birler basamagýný verir.
		
		int rakam=sayi%10; //bana birler basamagýný verir.
		rakamlarToplami+=rakam; //sayýmýz degismedi hala 573
		
		//3 den kurtulmak istiyoruz cumku 3 ile iþim bitt.
		//sayý 57 elde etmemiz laýzm
		
		sayi/=10;  //573
		System.out.println(sayi); //sayýmýz 57 oldu.
		
		//simdi sayýdan 57 den 7 yi alacaz.
		
		rakam=sayi%10;
		System.out.println(rakam); //sayi 7 yi bulduk simdi ilk buldugumuz 3 un ustune eklememýz lazým
		//bizim 3 muz rakamlar toplamý variablesinde.
		
		rakamlarToplami+=rakam;
		System.out.println(rakamlarToplami);  //sayi 10a ulastýk 3 ve 7 nin toplamý.
		
		//sayýmýz 57 ve 7 dende kurtulmamýz lazým.
		
		sayi/=10; //sayýmýz artýk 5 oldu
		
		System.out.println(sayi); //dolayýsý ile 5 i de toplarsak sonuca ulaþýrýz. onceden 3 u ve 7 yý toplamýstýk
		
		//elimizde sadece sayinin degeri 5 kaldý kalýcý degerdi.
		rakamlarToplami+=sayi;
		System.out.println("Girdiginiz sayýnýn rakamlar toplamý:" + rakamlarToplami); 
		
		//artýk sayýlar toplamý ile ilgili formul olusmus oldu.
		
		//ancak sayýmýz 3 basamaklý ise 3 kez 4 ise 4 kez
	   //bu iþlemi kac basamaklý sayý varsa okadr tekrar etmemiz lazým
		
		scan.close();
		
	}
	

}
