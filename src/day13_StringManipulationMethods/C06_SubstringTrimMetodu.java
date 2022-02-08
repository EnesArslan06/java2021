package day13_StringManipulationMethods;

public class C06_SubstringTrimMetodu {

	public static void main(String[] args) {
		// index kullanarak verilen Stringin istenen parcasýný almamýzý saglar.
		//mesela subString 4 dedik  3. indexten baslar yazmaya.
		//substring(5,11) dedik 5 dahil baslayacak yazdýrmaya ancak 11 e kadar alacak 11 i almayacak.
       //substrinde ilk harfi almak için (0,1) yazacaz sadece 1. harfi alýrýz önceden charla yapýyorduk. chardan kurtulduk
		//mesela (8,8) dedik  ilkidahil ikinci dahil degil de ne olacak hiclik degeri verir.
		
String str="Java OOP konsepti Kullanýr";
System.out.println(str.substring(5,11));//OOP ko degerini verir.
System.out.println(str.substring(3,4)); // a degerini verir
System.out.println(str.substring(8,8)); // hicbir deger vermez yani hiçlik degerini verir.
//System.out.println(str.substring(8,2)); // hata verir yazarken kýrmýzý ile altýný cizmez ancak calýsýrken hata verir.
	
//javada 2 tur hata alýrýz
/*1- Compile Time Erro(CTE): kodumuzu yazarken altýnýn kýrmýzý ile calýsþmasý hatasý. kod yazarken yaptýgýmýz hata
2-Run Time Error (RTE): Kod calýstýrýldýgýnda ortaya cýkan hatadýr. yazýmda yok ancak calýsmada hata oldugunu gösterir. */


				//trim metodu
//bastaki veya sonrda var olan bosluklarýdan bizi kurtarýr.

String str2="   Java OOP konsepti Kullanýr   ";
System.out.println(str2.trim()); //bastaki ve sondaki bosluklarý sildi.
System.out.println(str2.length()); //32 verdi uzunlugu bosluklarýda saydý
System.out.println(str2.trim().length()); //bu sekilde 26 verdi cunku trimle cýkardýk bosluklarý.

	
	}}
