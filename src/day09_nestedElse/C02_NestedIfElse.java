package day09_nestedElse;

import java.util.Scanner;

public class C02_NestedIfElse {

	public static void main(String[] args) {
		/* Soru12)Kullan�c�dan 4 basamakli bir sayi girmesini isteyin. 
		Girdi�i sayi 5�e  b�l�n�yorsa son rakam�n� kontrol edin. 
		Son rakam� 0 ise ekrana �5�e b�l�nen  �ift say�� yazd�r�n. 
		Son rakam� 0 de�il ise �5�e b�l�nen tek say�� yazd�r�n.  
		Girdi�i password 5�e b�l�nm�yorsa ekrana �Tekrar deneyin� yazd�r�n.*/

Scanner scan=new Scanner(System.in);	
System.out.println("Lutfen 4 basamakl� bir say� giriniz");
int sayi=scan.nextInt();

if (sayi>=1000 || sayi<=9999)    						//burada say�n�n 4 basamakl� oldugunu belirttik.
{System.out.println("4 basamakl� pozitif say� girmelisiniz");} 
else {if (sayi%5==0){if (sayi%10==0){System.out.println("5 e tam bolunebilen Cift say�");			//say�%10==0 say�n�n son harf�n�n sifir oldugunu belirtir.
	} else {System.out.println("5 e tam bolunen tek sayi");

}																						//5 e tam bolunenler 
	
} else {System.out.println("Lutfen Tekrar Deneyiniz");								//5 e ttam bolunemeyenler

}}
	scan.close();

}}
	
	
	
	
	
	
	
	
