package day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		
		//kullan�c�dan isim ve soyismi ayr� ayr� isteyip asag�daki gibi yazd�r�n�z.
		//girilen isim: Mehmet Bulutluoz

		Scanner scan= new Scanner(System.in);
		
		System.out.println("lutfen isminizi giriniz...");
		
		String isim=scan.next();
		
		System.out.println("lutfen soyisminizi yaziniz...");
		
		String soyisim=scan.next();
		
		System.out.println("girilen isim : " + isim + " " + soyisim );
		
		
		//sabit k�s�mlar� t�rnak i�ine al�yoruz. "girilen isim:" ve isimle soyisim aras�ndaki bosluk " "
		//iki isim yazarsak stringde kar�s�yor.
		
		scan.close();
		
		
		
		
	}

}
