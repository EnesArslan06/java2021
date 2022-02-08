package day15_MethodCreation;

import java.util.Scanner;

public class C05_MethodCreationSoru {

	public static void main(String[] args) {
		/*Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti
		numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak
		sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde
		duzelten 2 method yazin, ve programda kullanabilmek icin duzenlenmis hallerini
		geri dondurun.*/

		Scanner scan=new Scanner(System.in); 
	System.out.println("Lutfen Ýsminizi giriniz: \nSoy isminizi giriniz: "
			+ "\nLutfen kredi kartýnýzýn numaralarýný bosluk býrakmadan giriniz");
	String isim=scan.next();
	String soyisim=scan.next();
	String kknumarasi=scan.next();

isimsoyisim(isim,soyisim);
kkduzenlenmis(kknumarasi);	
	
	if (kknumarasi.length()!=16) {System.out.println("Lutfen kredi Kartinizi 16 hane olarak bosluksuz giriniz..");
		
	} else { isim=isimsoyisim(isim,soyisim);
			kknumarasi=kkduzenlenmis(kknumarasi);
			System.out.println("Adýnýz ve Soyadýnýz:" + isim );
			System.out.println("Kredi kart numaranýz\t:" + kknumarasi);
	}
	
	
	}

	private static String kkduzenlenmis(String kknumarasi) {
		kknumarasi=kknumarasi.substring(0, 4)+" "+kknumarasi.substring(4, 8)+
				" "+kknumarasi.substring(8, 12)+" "+kknumarasi.substring(12,16);
		return kknumarasi;
	}

	private static String isimsoyisim(String isim, String soyisim) {
		isim=isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
		soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).toLowerCase();
	return isim+" "+soyisim;
	
	}

}
