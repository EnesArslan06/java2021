package day15_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreatingSoru {

	public static void main(String[] args) {
		/*Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. 
		Kullanici 2,3 veya 4 degerini girerse, 
		kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin.
		Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse 
		“Cok sayi girdiniz, ben toplayamam” yazdirin. */

		Scanner scan=new Scanner(System.in); 	
		System.out.println("Lutfen Kac Sayi Toplamak istediginizi giriniz: 2/ 3/ 4/");	
		int tercih=scan.nextInt();
		if (tercih>4) {
			tercih=5 ;}			//tercihi 5 den buyuk bile olsa oraya 5 olarak yazar.
		
		switch(tercih) {
		case 2: ikisayitopla(); break;
		case 3: ucsayitopla(); break;
		case 4: dortsayitopla(); break;
		case 5: System.out.println("Cok sayi girdiniz toplayamam"); break; //5 den buyuk ne girerse 20 bile girse oda 5 olur
		default : System.out.println("Gecersiz Tercih");
		}
scan.close();
	}
	private static void dortsayitopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 4 tane sayi giriniz ve entera basýnýz:");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		double sayi4=scan.nextDouble();
	System.out.println("Girdiginiz 4 sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4));
	scan.close();	
	}

	private static void ucsayitopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 3 tane sayi giriniz ve entera basýnýz:");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
	System.out.println("Girdiginiz 3 sayinin toplami : " + (sayi1+sayi2+sayi3));
		scan.close();
	}

	private static void ikisayitopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 2 tane sayi giriniz ve entera basýnýz:");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
	System.out.println("Girdiginiz 2 sayinin toplami : " + (sayi1+sayi2));
	scan.close();
	}
	
	
	
	
	
	

}
