package day13_StringManipulationMethods;

import java.util.Scanner;

public class C07_Sorular {

	public static void main(String[] args) {
		/* Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi
		yazdirin
		isim- soyisim :M***** B*******
		kart no: **** **** **** 1234   bu sekilde yazd�r�n  */

	Scanner scan=new Scanner(System.in)	;
	System.out.println("isminizi: \nsoy isminizi: \nkredi kart� bilgilerinizi giriniz..");
	String isim=scan.next();
	String soyisim=scan.next();
	String kkbilgi=scan.next(); 
	
	String isimformatli=isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*") ;
	//ilk harfi ald�k ve buyuk yapt�k sonra substring(1) ile 1 den sonraki harfleri ald�k ve 
	
	
	String soyisimformatli=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
	
	String kkbilgiformatli="**** **** **** " + kkbilgi.substring(12);
	
	System.out.println("isim-soyisim : " + isimformatli + " " + soyisimformatli);
	System.out.println("kart no : " + kkbilgiformatli);
	
	
	}

}
