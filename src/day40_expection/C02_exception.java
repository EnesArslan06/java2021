package day40_expection;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_exception {

	public static void main(String[] args) {
		//Kullanýcýdanvistedigi kadar sayi alýp 
		//bu sayilari toplayan bir program yapýnýz
	
		int sayi=0;
		int toplam=0;
		Scanner scan=new Scanner(System.in);
		int count=0;
		//InputMismatchException bu hatayi verecek cunku hep sayi istedik kullanici harf girdi
	try {	
		while (count<10000) {
			System.out.println("Lutfen toplamak icin sayi giriniz\n cýkmak icin sayi disinda bir tusa basiniz");
			sayi=scan.nextInt();
			toplam+=sayi;
		}	
			
		} catch (InputMismatchException e) {
			System.out.println("sayilarin toplami: " + toplam);
	}	
	
	
	
	//kod hata verdi exception hatasi verdi
	//uyusmazlik uyarýsý veriyor sayi int cýkýs q yani string
	// o yuzden string secim=null; degeri cýkartýyoruz ve !secim.equalsIgnoreCase("q") bunuda kaldýrýyoruz.
	
	
	
	
	}

}
