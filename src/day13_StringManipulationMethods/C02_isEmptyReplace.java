package day13_StringManipulationMethods;

public class C02_isEmptyReplace {

	public static void main(String[] args) {
		// isEmpty bos mu dolumu diye sorar.
			//replace() yer degi�tirme methoduistenen karakterlerin yerlerini degistirir.
		// Str Java kolay ("a", "x") a lar�n x ile degistir ("Java", "x")javay�da x ile degi�tirir.
		//uzunluk onemli degildir. terside olabilir ("x", "Java") bul ve degi�tir methodudur.
		//("a", "") burada a n�n oldugu yerlere hiclik atar ve yok eder alar�.
		
			String sonuc="9999";
			//bunu binden veya onbinden buyuk olarak yazd�r�n. // bunu noktadan kurtararak yazd�rmam�z laz�m
			
			
sonuc=sonuc.replace(".", ""); //10000 e cevirip sonuc' a assing ettik sonuc kal�c� olarak degi�ti.
					System.out.println(sonuc);
if (Integer.valueOf(sonuc)>1000) {System.out.println("bulunan sonuc say�s� 1000' den cok");//burada string olan ifadeyi Integeer olarak inte cevirdik.
	
} else {System.out.println("bulunan sonuc say�s� 1000' den az");} //noktay� kald�rmam�z�n nedeni integerin nokta ile cal�smamas�.


		
		
		
}}
