package day09_nestedElse;

import java.util.Scanner;

public class C06_OdevTernaryMutlakDeger {

	public static void main(String[] args) {
		// Soru:3 Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

	Scanner scan=new Scanner(System.in);
System.out.println("Lutfen bir say� girin: ");
int sayi=scan.nextInt();

//System.out.println(sayi>=0 ? "Say�n�n Mutlak degeri:" + sayi : "Say�n�n Mutlak Degeri" + (sayi*(-1)));

String sonuc=sayi>=0 ? "Say�n�n Mutlak Degeri:"+ sayi : "Say�n�n Mutlak Degeri:" + sayi*(-1);
System.out.println(sonuc);

scan.close();
	}

}
