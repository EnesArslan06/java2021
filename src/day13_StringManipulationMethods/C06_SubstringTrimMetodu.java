package day13_StringManipulationMethods;

public class C06_SubstringTrimMetodu {

	public static void main(String[] args) {
		// index kullanarak verilen Stringin istenen parcas�n� almam�z� saglar.
		//mesela subString 4 dedik  3. indexten baslar yazmaya.
		//substring(5,11) dedik 5 dahil baslayacak yazd�rmaya ancak 11 e kadar alacak 11 i almayacak.
       //substrinde ilk harfi almak i�in (0,1) yazacaz sadece 1. harfi al�r�z �nceden charla yap�yorduk. chardan kurtulduk
		//mesela (8,8) dedik  ilkidahil ikinci dahil degil de ne olacak hiclik degeri verir.
		
String str="Java OOP konsepti Kullan�r";
System.out.println(str.substring(5,11));//OOP ko degerini verir.
System.out.println(str.substring(3,4)); // a degerini verir
System.out.println(str.substring(8,8)); // hicbir deger vermez yani hi�lik degerini verir.
//System.out.println(str.substring(8,2)); // hata verir yazarken k�rm�z� ile alt�n� cizmez ancak cal�s�rken hata verir.
	
//javada 2 tur hata al�r�z
/*1- Compile Time Erro(CTE): kodumuzu yazarken alt�n�n k�rm�z� ile cal�s�mas� hatas�. kod yazarken yapt�g�m�z hata
2-Run Time Error (RTE): Kod cal�st�r�ld�g�nda ortaya c�kan hatad�r. yaz�mda yok ancak cal�smada hata oldugunu g�sterir. */


				//trim metodu
//bastaki veya sonrda var olan bosluklar�dan bizi kurtar�r.

String str2="   Java OOP konsepti Kullan�r   ";
System.out.println(str2.trim()); //bastaki ve sondaki bosluklar� sildi.
System.out.println(str2.length()); //32 verdi uzunlugu bosluklar�da sayd�
System.out.println(str2.trim().length()); //bu sekilde 26 verdi cunku trimle c�kard�k bosluklar�.

	
	}}
