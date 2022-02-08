package day10_SwitchCase;

import java.util.Locale;

public class C09_StringManipulationUpperCaseLowerCase {

	public static void main(String[] args) {
		// verilen stringin tamamýný buyuk veya kucuk harfe cevirir
		
		String isim="aLI"; //bunu Ali olarak yazdýralým.
		System.out.println(isim.toUpperCase().charAt(0)
				+ isim.toLowerCase().charAt(1) + isim.toLowerCase().charAt(2));  // bu iþlemin sonucu karakter 
		//3 tane karakter toplamýs olduk yani. sonucu 478 verdi.bunun basýna bi bosluk yani hiclik verdigimiz zaman duzelir
		
		System.out.println(" " + isim.toUpperCase().charAt(0)
				+ isim.toLowerCase().charAt(1) + isim.toLowerCase().charAt(2));
		
	//turkce lokal harfler kullanarak tamamýný kucuk harfle cevirelim.
		
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr"))); 
		
		//alý yazdý ingilizcede buyuk I kucuk ý olarak gözukur
	//bunu yapmak icin tolowercase týklayýp ordan parantez icine locale yazýnca diller cýkýyor ve
		//forLanguageTag("tr") yaparsak tr ye cevirir.
		
		
		
		
		
		
		
	}}	
		
		