package day11_StringManipulationMethods;

public class C04_StringManipulationIndexOf {

	public static void main(String[] args) {
		// "verilen isimde "a" varsa  hangi index te . bunu ararken kullanýyoruz.
		String str="calýsýrsanýz, Java ogrenmek cok kolay";
		System.out.println(str.indexOf('a')); //sonuc 1 olur cunlu 'a' yý 1. indexte bulur.
		System.out.println(str.indexOf("Java")); // 14 sonucunu verir.
			//Java sonucunu yani J yi 14. index te görmeye baslýyor.
		System.out.println(str.indexOf('s'));//4 sonucunu verir.
	
	int index=str.indexOf("r");//burada int olacagý için int degerini kabul eder.
			//cunku donusu index olarak dönecektir. ctrl tusuna basýlý tutarak indexofa yaklasýrsak;
			//open declaraationsu acarsak.... bize bu methodun nerede yazýldýgý gösterir.
	
	
			//indexOf methodu bize her zaman integer olarak doner.

	System.out.println(index);	//sonuc altý olur. cunku deger rakam olarak geldigi için index' int larak atadýk.
	
			//olmayan karakter sorgulanýrsa 
	System.out.println(str.indexOf('q')); // sonuc -1 olur. Eger bir stringin index degeriolarak -1 verirse
	// o stringin olmadýgýný anlarýz. Bir String icinde olmaya bir karakter veya kelime ararsak 
	//java -1 sonucunu bulur. demekki yokmus der.
	
	System.out.println(str.indexOf('A')); //dersek -1 doner buyuk A yoktur.
	
	
	System.out.println(str.indexOf('a',11)); //15 sonucunu verir.
	System.out.println(str.indexOf("va og")); //burada 16 indexini verir. 
				//aradýgýmýz charSquence anlamlý veya anlamsýz olmasýna gerek yoktur. 
	System.out.println(str.indexOf('e',15 ));// 22 sonucunu alýrýz. ilk e den degil ondan sonraki e yý ararsak
	
}}
