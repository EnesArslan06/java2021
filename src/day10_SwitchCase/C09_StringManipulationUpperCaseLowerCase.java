package day10_SwitchCase;

import java.util.Locale;

public class C09_StringManipulationUpperCaseLowerCase {

	public static void main(String[] args) {
		// verilen stringin tamam�n� buyuk veya kucuk harfe cevirir
		
		String isim="aLI"; //bunu Ali olarak yazd�ral�m.
		System.out.println(isim.toUpperCase().charAt(0)
				+ isim.toLowerCase().charAt(1) + isim.toLowerCase().charAt(2));  // bu i�lemin sonucu karakter 
		//3 tane karakter toplam�s olduk yani. sonucu 478 verdi.bunun bas�na bi bosluk yani hiclik verdigimiz zaman duzelir
		
		System.out.println(" " + isim.toUpperCase().charAt(0)
				+ isim.toLowerCase().charAt(1) + isim.toLowerCase().charAt(2));
		
	//turkce lokal harfler kullanarak tamam�n� kucuk harfle cevirelim.
		
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr"))); 
		
		//al� yazd� ingilizcede buyuk I kucuk � olarak g�zukur
	//bunu yapmak icin tolowercase t�klay�p ordan parantez icine locale yaz�nca diller c�k�yor ve
		//forLanguageTag("tr") yaparsak tr ye cevirir.
		
		
		
		
		
		
		
	}}	
		
		