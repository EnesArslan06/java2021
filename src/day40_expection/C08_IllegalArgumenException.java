package day40_expection;

import java.util.Scanner;

public class C08_IllegalArgumenException {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Soru: Kullanicidan yasini girmesini isteyin.
		//Kodunuzu kullanici sifirdan kucuk bir sayi girerse Exception verecek sekilde yazin.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Konsolda gormek icin yas�n�z� giriniz");
		
		int yas=scan.nextInt();
		
		try {
			if (yas<0) {
				throw new IllegalArgumentException();//bunu yazd���m�zda exception formatinda bir hata verecek
			
			}else { System.out.println(yas);
				
			}
			
		} catch (IllegalArgumentException e) {//yukari try �n oldugu k�sma yas 0 dan kucuk ise exception firlat diyoruz
			System.out.println(e);
			System.out.println("Yas 0 dan kucuk olamaz");
			
		}
		
		

	}

}
