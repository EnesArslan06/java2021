package day10_SwitchCase;

public class C06_SwitchCaseSoru {

	public static void main(String[] args) {
		/* Soru3 : 
		 Girilen sayiy� inceleyin
		 10 ise �Iki basamakli en kucuk sayi 
		 100 ise �uc basamakli en kucuk sayi�
		 1000 ise �dort basamakli en kucuk sayi�
		 diger durumlarda �Girdigin sayiyi degistir� yazdirin */
		
int sayi=10;
switch(sayi) {

case 10: 
	System.out.println("�ki basamakl� en kucuk say�"); 
	break;  														 //boolean kullanamay�z.
case 100: 
	System.out.println("Uc basamakl� en kucuk say�"); 
	break;  												//bu i�lem nokta at�slar�nda kullan�l�r.
case 1000: 
	System.out.println("Dort basamakl� en kucuk say�"); 
	break; 											//bu i�lemde sayi<100 falan kullan�lmaz
default: 
	System.out.println("Say�y� degi�tirin");
}
}}





