package day03_Scanner;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		// Scanner isleminde String i�in iki method vard�r
		// scan.next() dedigimizde sadece 1 kelime al�r.
		//eger kullan�c�dan daha fazla kelime gelme ihtimali varsa 
		//scan.nextLine() kullanmam�z laz�m
		

				Scanner scan= new Scanner(System.in);
				
				System.out.println("lutfen isminizi giriniz...");
				
				String isim=scan.nextLine();
				
				System.out.println("lutfen soyisminizi yaziniz...");
				
				String soyisim=scan.nextLine();
				
				System.out.println("girilen isim : " + isim + " " + soyisim );
				
				
		//bunu line olarak degistirdigimiz zaman isim l�sm�na ve soyisim k�sm�na 2 3 4 isim girilebilir.		
				
				
		scan.close();
		
				


	}

}
