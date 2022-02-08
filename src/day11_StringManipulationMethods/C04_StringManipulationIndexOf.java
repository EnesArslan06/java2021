package day11_StringManipulationMethods;

public class C04_StringManipulationIndexOf {

	public static void main(String[] args) {
		// "verilen isimde "a" varsa  hangi index te . bunu ararken kullan�yoruz.
		String str="cal�s�rsan�z, Java ogrenmek cok kolay";
		System.out.println(str.indexOf('a')); //sonuc 1 olur cunlu 'a' y� 1. indexte bulur.
		System.out.println(str.indexOf("Java")); // 14 sonucunu verir.
			//Java sonucunu yani J yi 14. index te g�rmeye basl�yor.
		System.out.println(str.indexOf('s'));//4 sonucunu verir.
	
	int index=str.indexOf("r");//burada int olacag� i�in int degerini kabul eder.
			//cunku donusu index olarak d�necektir. ctrl tusuna bas�l� tutarak indexofa yaklas�rsak;
			//open declaraationsu acarsak.... bize bu methodun nerede yaz�ld�g� g�sterir.
	
	
			//indexOf methodu bize her zaman integer olarak doner.

	System.out.println(index);	//sonuc alt� olur. cunku deger rakam olarak geldigi i�in index' int larak atad�k.
	
			//olmayan karakter sorgulan�rsa 
	System.out.println(str.indexOf('q')); // sonuc -1 olur. Eger bir stringin index degeriolarak -1 verirse
	// o stringin olmad�g�n� anlar�z. Bir String icinde olmaya bir karakter veya kelime ararsak 
	//java -1 sonucunu bulur. demekki yokmus der.
	
	System.out.println(str.indexOf('A')); //dersek -1 doner buyuk A yoktur.
	
	
	System.out.println(str.indexOf('a',11)); //15 sonucunu verir.
	System.out.println(str.indexOf("va og")); //burada 16 indexini verir. 
				//arad�g�m�z charSquence anlaml� veya anlams�z olmas�na gerek yoktur. 
	System.out.println(str.indexOf('e',15 ));// 22 sonucunu al�r�z. ilk e den degil ondan sonraki e y� ararsak
	
}}
