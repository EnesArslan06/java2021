package day40_expection;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_exception {

	public static void main(String[] args) {
		//Kullan�c�danvistedigi kadar sayi al�p 
		//bu sayilari toplayan bir program yap�n�z
	
		int sayi=0;
		int toplam=0;
		Scanner scan=new Scanner(System.in);
		int count=0;
		//InputMismatchException bu hatayi verecek cunku hep sayi istedik kullanici harf girdi
	try {	
		while (count<10000) {
			System.out.println("Lutfen toplamak icin sayi giriniz\n c�kmak icin sayi disinda bir tusa basiniz");
			sayi=scan.nextInt();
			toplam+=sayi;
		}	
			
		} catch (InputMismatchException e) {
			System.out.println("sayilarin toplami: " + toplam);
	}	
	
	
	
	//kod hata verdi exception hatasi verdi
	//uyusmazlik uyar�s� veriyor sayi int c�k�s q yani string
	// o yuzden string secim=null; degeri c�kart�yoruz ve !secim.equalsIgnoreCase("q") bunuda kald�r�yoruz.
	
	
	
	
	}

}
