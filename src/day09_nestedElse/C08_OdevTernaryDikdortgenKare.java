package day09_nestedElse;

import java.util.Scanner;

public class C08_OdevTernaryDikdortgenKare {

	public static void main(String[] args) {
		// Soru4 ) Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, girilen
		// degerlere gore dikdorgenin kare olup olmadigini yazdirin.

Scanner scan=new Scanner(System.in);	

System.out.println("Lutfen dikdörtgenin bir kenar uzunlugu belirtin:" + "\n" 
		+ "Dikdortgenin diger uzunlugunu giriniz:");
	double kenar1=scan.nextDouble();
	double kenar2=scan.nextDouble();
//Birinci Yontem//System.out.println(kenar1==kenar2 ? "Kare" : (kenar1==0 || kenar2==0 ? "sýfýr degersiz islem Tekrar Dene" : "Dikdortgen"));	
	
	//2. Yontem
		String sonuc=kenar1==kenar2 ? "Kare Alaný:" + kenar1*kenar2 : (kenar1==0 || kenar2==0 ? "Gecersiz islem" : "Dikdortgen Alaný:" + kenar1*kenar2);	
	System.out.println("Sonuc:" + sonuc);
	
	scan.close();
}}

