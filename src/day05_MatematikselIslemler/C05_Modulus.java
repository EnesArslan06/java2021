package day05_MatematikselIslemler;

import java.util.Scanner;

public class C05_Modulus {

	public static void main(String[] args) {
		// Kullan�c�dan 6 basamakl� say� al�n ve rakamlar toplam�n� bulun.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 6 basamakli bir sayi giriniz");
		
		int sayi=scan.nextInt();
		
		int rakamlarToplami=0;
		int rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;

		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		
		
		System.out.println("Girdiginiz sayinin rakamlar toplami=" + rakamlarToplami);

		scan.close();
		
	}

}
