package day09_nestedElse;

import java.util.Scanner;

public class C02_NestedIfElse {

	public static void main(String[] args) {
		/* Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. 
		Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin. 
		Son rakamı 0 ise ekrana “5’e bölünen  çift sayı” yazdırın. 
		Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.  
		Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.*/

Scanner scan=new Scanner(System.in);	
System.out.println("Lutfen 4 basamaklı bir sayı giriniz");
int sayi=scan.nextInt();

if (sayi>=1000 || sayi<=9999)    						//burada sayının 4 basamaklı oldugunu belirttik.
{System.out.println("4 basamaklı pozitif sayı girmelisiniz");} 
else {if (sayi%5==0){if (sayi%10==0){System.out.println("5 e tam bolunebilen Cift sayı");			//sayı%10==0 sayının son harfının sifir oldugunu belirtir.
	} else {System.out.println("5 e tam bolunen tek sayi");

}																						//5 e tam bolunenler 
	
} else {System.out.println("Lutfen Tekrar Deneyiniz");								//5 e ttam bolunemeyenler

}}
	scan.close();

}}
	
	
	
	
	
	
	
	
