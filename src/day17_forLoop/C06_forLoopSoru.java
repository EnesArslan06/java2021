package day17_forLoop;

import java.util.Scanner;

public class C06_forLoopSoru {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
		//toplayip, sonucu yazdiran bir program yaziniz

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen  2 sayi giriniz");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();

	int kucuk=0;   
	int buyuk=0;
		
	if (sayi1>sayi2) {
		buyuk=sayi1;
		kucuk=sayi2;		
	}else {
		buyuk=sayi2;
		kucuk=sayi1;
	}

	int toplam=0;
		for (int i=buyuk; i >=kucuk; i--) {
			toplam+=i;  //burada her i degerini topla demektir
		}
		
	System.out.println("Girilen sayilarýn toplami= " + toplam);	
		
	

	scan.close();

}}
