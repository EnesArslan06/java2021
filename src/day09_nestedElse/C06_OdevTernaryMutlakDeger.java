package day09_nestedElse;

import java.util.Scanner;

public class C06_OdevTernaryMutlakDeger {

	public static void main(String[] args) {
		// Soru:3 Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

	Scanner scan=new Scanner(System.in);
System.out.println("Lutfen bir sayý girin: ");
int sayi=scan.nextInt();

//System.out.println(sayi>=0 ? "Sayýnýn Mutlak degeri:" + sayi : "Sayýnýn Mutlak Degeri" + (sayi*(-1)));

String sonuc=sayi>=0 ? "Sayýnýn Mutlak Degeri:"+ sayi : "Sayýnýn Mutlak Degeri:" + sayi*(-1);
System.out.println(sonuc);

scan.close();
	}

}
