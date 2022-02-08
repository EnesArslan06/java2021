package day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		
		//kullanýcýdan isim ve soyismi ayrý ayrý isteyip asagýdaki gibi yazdýrýnýz.
		//girilen isim: Mehmet Bulutluoz

		Scanner scan= new Scanner(System.in);
		
		System.out.println("lutfen isminizi giriniz...");
		
		String isim=scan.next();
		
		System.out.println("lutfen soyisminizi yaziniz...");
		
		String soyisim=scan.next();
		
		System.out.println("girilen isim : " + isim + " " + soyisim );
		
		
		//sabit kýsýmlarý týrnak içine alýyoruz. "girilen isim:" ve isimle soyisim arasýndaki bosluk " "
		//iki isim yazarsak stringde karýsýyor.
		
		scan.close();
		
		
		
		
	}

}
