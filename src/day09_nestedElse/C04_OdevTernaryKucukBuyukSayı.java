package day09_nestedElse;

import java.util.Scanner;

public class C04_OdevTernaryKucukBuyukSay� {

	public static void main(String[] args) {
	
		// Soru:1 Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen bir say� girin ve entera bas�n: \n Bir say� daha girin:");		
double sayi1=scan.nextDouble();
double sayi2=scan.nextDouble();			//2 farkl� yontemle yazd�r�labilir.

System.out.println((sayi1<sayi2) ? sayi1 : sayi2);     //Birinci yontem
/*double kucuksayi=sayi1<sayi2 ? sayi1 : sayi2;
System.out.println("Kucuksayi: " + kucuksayi);				�kinci yontem */

/*System.out.println("Lutfen iki sayi giriniz");
System.out.println("x=");
double x=scan.nextDouble();
System.out.println("y=");
double y=scan.nextDouble();

System.out.println((x<y) ? "ilk sayi kucuktur " : (x!=y) ? "ikinci sayi kucuktur" : "sayilar esittir"); */


scan.close();

	}

}
