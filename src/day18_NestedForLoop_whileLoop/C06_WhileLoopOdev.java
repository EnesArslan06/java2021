package day18_NestedForLoop_whileLoop;

import java.util.Scanner;

public class C06_WhileLoopOdev {

	public static void main(String[] args) {
		// Kullanýcýdan toplanmak uzere sayilar isteyin
		// sayi adedi 10 u gecerse veya toplam 500 u gecerse "Bu kadar sayi yeter"
		// "...adet sayi girdin, toplamý..." yazdýrýn

		Scanner scan = new Scanner(System.in);

		int sayi = 0;
		int toplam = 0;
		int sayac = 0;

		
		while (sayac < 10 && toplam < 500) {
			System.out.println("Lutfen Toplanmak Uzere sayilar giriniz");
			sayi = scan.nextInt();
			toplam += sayi;
			sayac++;
			sayi++;
							}
	
		if (sayac < 10 && toplam < 500){System.out.println(sayac + " adet sayi girdiniz. Toplami: " + toplam);}
			
		 else  { System.out.println("Bu kadar sayi yeter: " + sayac + " adet sayi girdiniz: Toplami: " + toplam);}

				

		scan.close();
	}
}