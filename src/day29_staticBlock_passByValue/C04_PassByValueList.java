package day29_staticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		// Bir list veya Array olabilir
		//Bir list olusturalim sonra list elemanlarini  degistir methodu yazip orada list elemanlarýndan
		//bazilarini degistirelim. Method void olsun
		//Main methoda dondukten sonra yeniden listi yazdiralim.
		
		List<String> harfler=new ArrayList<>();
		
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		
		listElemanlarDegistir(harfler);
		System.out.println("Main Methoda donunce List :" + harfler);
		
		listDegistir(harfler);
		System.out.println("Liste yeni deger atadýktan sonra main methoda donunca list"+ harfler);//[D, B, C] yazdýrdý
	
		//Java da list ve array gibi objeler icinde pass by value gecerlidir.
		//Yani farkli bir method da array veya liste yeni deger atamasi yaparsaniz orjinal array veya list degismez.
		//Ancak elemanlardan bazilari degisebilir.
		//Methodda harfler listesine atama yaptigimiz halde 
		
		
		
	}

	

	private static void listElemanlarDegistir(List<String> harfler) {
		// Java buraya value sini kopyasini aldý listin
		
		harfler.set(0,"D");
		System.out.println("Methodda degistirdigimiz list :" + harfler);
		//metodda degistirdik maine dondukten sonra acaba orada bir degisiklik yaptimi listimizde?
	}
	private static void listDegistir(List<String> harfler) {
		//Harfler listemizdeki[D,B,C] yi new listeye atadik
		harfler=new ArrayList<>();
		System.out.println("Liste yeni deger atayinca"+ harfler);//bos list gosterdi.
	}

}
