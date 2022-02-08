package day13_StringManipulationMethods;

import java.util.Scanner;

public class c13_Sorular {

	public static void main(String[] args) {
		/*Kullanicidan bir sifre girmesini isteyin Asagidaki sartlari sagliyorsa “Sifre
		basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir
		sifre girin” yazdirin
		Ilk harf buyuk harf olmali
		Son harf kucuk harf olmali
		Sifre bosluk icermemeli
		Sifre uzunlugu en az 8 karakter olmali*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen en az 8 karakter uzunlugunda bir sifre giriniz...");
		String sifre=scan.next();
//sifre=!sifre.contains(" ")	;	
boolean uzunluk=sifre.length()>=8;
boolean basharf=sifre.charAt(0)>='A'&& sifre.charAt((sifre.length()-1))>='Z';
boolean sonharf=sifre.charAt(0)>='a'&& sifre.charAt((sifre.length()-1))>='z';

		

		
		
		
}

	private static int length() {
		// TODO Auto-generated method stub
		return 0;
	}}
