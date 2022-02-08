package day12_StringManipulationMethods;

import java.util.Scanner;

public class C02_IndexOf2 {

	public static void main(String[] args) {
		/* Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
		kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		Girilen kelime cumlede kullanilmamis.
		Girilen kelime cumlede 1 kere kullanilmis.
		Girilen kelime cumlede 1’den fazla kullanilmis.*/
		
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen bir cumle giriniz");
String cumle=scan.nextLine();		
System.out.println("Lutfen varlýgýný kontrol etmek icin bir harf giriniz");	
String kelime=scan.next();
int index=cumle.indexOf(kelime);

if (index<0) {System.out.println("Girdiginiz kelime cumlede yoktur.");}
	
else if (cumle.indexOf(kelime, index+1)<0) {System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");}
	
 else {System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");}


scan.close();


//index+1 dedik bulduktan sonra 1 sýra daha devam et sonra ara demektir. yani buldu devam et buldugun yerden sonra aramaya 
// devam et demek. sonraki bulduguda== -1 ise demekki bir sonuc daha verdi dolayýsý ile bir kere daha buldu o yuzden 1 den fazla kullanýlmýstýr deriz.
}}





