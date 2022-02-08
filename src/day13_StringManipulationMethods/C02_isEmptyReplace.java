package day13_StringManipulationMethods;

public class C02_isEmptyReplace {

	public static void main(String[] args) {
		// isEmpty bos mu dolumu diye sorar.
			//replace() yer degiþtirme methoduistenen karakterlerin yerlerini degistirir.
		// Str Java kolay ("a", "x") a larýn x ile degistir ("Java", "x")javayýda x ile degiþtirir.
		//uzunluk onemli degildir. terside olabilir ("x", "Java") bul ve degiþtir methodudur.
		//("a", "") burada a nýn oldugu yerlere hiclik atar ve yok eder alarý.
		
			String sonuc="9999";
			//bunu binden veya onbinden buyuk olarak yazdýrýn. // bunu noktadan kurtararak yazdýrmamýz lazým
			
			
sonuc=sonuc.replace(".", ""); //10000 e cevirip sonuc' a assing ettik sonuc kalýcý olarak degiþti.
					System.out.println(sonuc);
if (Integer.valueOf(sonuc)>1000) {System.out.println("bulunan sonuc sayýsý 1000' den cok");//burada string olan ifadeyi Integeer olarak inte cevirdik.
	
} else {System.out.println("bulunan sonuc sayýsý 1000' den az");} //noktayý kaldýrmamýzýn nedeni integerin nokta ile calýsmamasý.


		
		
		
}}
