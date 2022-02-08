package day03_Scanner;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		// Scanner isleminde String için iki method vardýr
		// scan.next() dedigimizde sadece 1 kelime alýr.
		//eger kullanýcýdan daha fazla kelime gelme ihtimali varsa 
		//scan.nextLine() kullanmamýz lazým
		

				Scanner scan= new Scanner(System.in);
				
				System.out.println("lutfen isminizi giriniz...");
				
				String isim=scan.nextLine();
				
				System.out.println("lutfen soyisminizi yaziniz...");
				
				String soyisim=scan.nextLine();
				
				System.out.println("girilen isim : " + isim + " " + soyisim );
				
				
		//bunu line olarak degistirdigimiz zaman isim lýsmýna ve soyisim kýsmýna 2 3 4 isim girilebilir.		
				
				
		scan.close();
		
				


	}

}
