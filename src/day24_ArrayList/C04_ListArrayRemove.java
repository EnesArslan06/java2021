package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_ListArrayRemove {

	public static void main(String[] args) {
		
		List<String> harfler=new ArrayList<>();

		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
	

		System.out.println(harfler);//[A, Z, F, D] ekleme sýrasýna göre atadý
		
		
		System.out.println(harfler.remove(1));//Z olarak bize donderdi konsolda silinen harfi gösterdi
		//method bize birsey donderecekmi? Biz Z yi kaldýrmasýný istiyoruz. Oda silinen harfi gosterdi.
		//ancak diger kalan harfleri yazdýrmadý cunku yazdýrma methodu yazmadýk silme yazdýk oda sildi.
		//java denileni yapar bize birsey dondurmesine gerek yok. geriye kalanlarý göstermedi.
		//geriye kalaný gormek icin kendimiz tekrar syso yapmamýz lazým
		
		System.out.println(harfler);//[A, F, D]
		
		System.out.println(harfler.remove(2));//D yazdýrýr, git listenin 2. indexindeki sayiyi sildi ve onu gosterdi
		//listenin son hali icin bizim bakmamýz lazým
		
		System.out.println(harfler);//[A, F] 2 elemanýmýz kaldý
		
		
		System.out.println(harfler.remove("F"));//indexini bilmiyorum git F yi kaldýr metodu verdim true sonucunu verdi.
		
		//tek A harfi kaldý,
		
		System.out.println(harfler.remove("B"));//sonuc False doner. Gorevi yapamadýgý icin false olarak doner.
		System.out.println(harfler);	//[A] sadece A kaldý
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");  //LÝSTEYE 3 TANE DAHA KARAKTER EKLEDÝK
		
		
		System.out.println(harfler.remove("A"));// 2tane A var eleman olarak //bize true donderdi A lardan bir tanesini sildi
		//ilk buldugu A yi sildi
		System.out.println(harfler);//[A, Z, F]
		
		harfler.add("A"); //bir A daha ekledik yine 2 tane A miz var
		
		//System.out.println(harfler.removeAll("A")); removeAll da tek harf olarak silmeyi kabul etmez. 
													//Buraya genel birsey yazmamýz lazým
		System.out.println(harfler.removeAll(harfler)); //true  
		System.out.println(harfler);//[] bu sonucu verdi hic eleman kalmadý
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");	

		List<String> silinecekharfler=new ArrayList<>();

		silinecekharfler.add("A");
		silinecekharfler.add("C");
		silinecekharfler.add("F");
		
		System.out.println(harfler);//[A, Z, F, D]
		System.out.println(silinecekharfler);//[A, C, F]
		
		System.out.println(harfler.removeAll(silinecekharfler));//true sonucu verdi.
		//harfler icindeki elemannlarýn icinden silinecek eleman dakilerle uyusan varsa sil demek..
		System.out.println(harfler);//[ Z, D] sonucunu verdi
		System.out.println(silinecekharfler);//[A, C, F] buna dokunmadý
		
		//eger listemiz int lerden olusuyorsa
		//java remove(index) ve remove(object) methodlaarý karýsmasýn diye
		//girilen sayilarý index olarak kabul eder.
		//yani remove(9) dersek 9 rakamýný aramaz Stringdeki gibi sadece 9. index egider varsa 9. index i siler
		// 9. index yoksa indexofbound hatasý verir.
		
	}}