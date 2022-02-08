package day10_SwitchCase;



public class C02_NestedTernary {

	public static void main(String[] args) {
		// Kullanicidan bir harf isteyin
		// kucuk harf ise consola “Kucuk Harf” ,
		// buyuk harfse consola “Buyuk Harf”
		// yoksa “girdiginiz karakter harf degil” yazdırın
		
char karakter='3';

String sonuc= (karakter>='a' && karakter<='z') ? "Kucuk Harf" : //sart yanlıs ise yeni bir parantez ac
	((karakter>='A' && karakter<='Z') ? "Buyuk Harf" : "girilen karekter harf degil");

System.out.println(sonuc);		
		
}}

