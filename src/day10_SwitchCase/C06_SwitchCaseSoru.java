package day10_SwitchCase;

public class C06_SwitchCaseSoru {

	public static void main(String[] args) {
		/* Soru3 : 
		 Girilen sayiyý inceleyin
		 10 ise “Iki basamakli en kucuk sayi 
		 100 ise “uc basamakli en kucuk sayi”
		 1000 ise “dort basamakli en kucuk sayi”
		 diger durumlarda “Girdigin sayiyi degistir” yazdirin */
		
int sayi=10;
switch(sayi) {

case 10: 
	System.out.println("Ýki basamaklý en kucuk sayý"); 
	break;  														 //boolean kullanamayýz.
case 100: 
	System.out.println("Uc basamaklý en kucuk sayý"); 
	break;  												//bu iþlem nokta atýslarýnda kullanýlýr.
case 1000: 
	System.out.println("Dort basamaklý en kucuk sayý"); 
	break; 											//bu iþlemde sayi<100 falan kullanýlmaz
default: 
	System.out.println("Sayýyý degiþtirin");
}
}}





