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
	

		System.out.println(harfler);//[A, Z, F, D] ekleme s�ras�na g�re atad�
		
		
		System.out.println(harfler.remove(1));//Z olarak bize donderdi konsolda silinen harfi g�sterdi
		//method bize birsey donderecekmi? Biz Z yi kald�rmas�n� istiyoruz. Oda silinen harfi gosterdi.
		//ancak diger kalan harfleri yazd�rmad� cunku yazd�rma methodu yazmad�k silme yazd�k oda sildi.
		//java denileni yapar bize birsey dondurmesine gerek yok. geriye kalanlar� g�stermedi.
		//geriye kalan� gormek icin kendimiz tekrar syso yapmam�z laz�m
		
		System.out.println(harfler);//[A, F, D]
		
		System.out.println(harfler.remove(2));//D yazd�r�r, git listenin 2. indexindeki sayiyi sildi ve onu gosterdi
		//listenin son hali icin bizim bakmam�z laz�m
		
		System.out.println(harfler);//[A, F] 2 eleman�m�z kald�
		
		
		System.out.println(harfler.remove("F"));//indexini bilmiyorum git F yi kald�r metodu verdim true sonucunu verdi.
		
		//tek A harfi kald�,
		
		System.out.println(harfler.remove("B"));//sonuc False doner. Gorevi yapamad�g� icin false olarak doner.
		System.out.println(harfler);	//[A] sadece A kald�
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");  //L�STEYE 3 TANE DAHA KARAKTER EKLED�K
		
		
		System.out.println(harfler.remove("A"));// 2tane A var eleman olarak //bize true donderdi A lardan bir tanesini sildi
		//ilk buldugu A yi sildi
		System.out.println(harfler);//[A, Z, F]
		
		harfler.add("A"); //bir A daha ekledik yine 2 tane A miz var
		
		//System.out.println(harfler.removeAll("A")); removeAll da tek harf olarak silmeyi kabul etmez. 
													//Buraya genel birsey yazmam�z laz�m
		System.out.println(harfler.removeAll(harfler)); //true  
		System.out.println(harfler);//[] bu sonucu verdi hic eleman kalmad�
		
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
		//harfler icindeki elemannlar�n icinden silinecek eleman dakilerle uyusan varsa sil demek..
		System.out.println(harfler);//[ Z, D] sonucunu verdi
		System.out.println(silinecekharfler);//[A, C, F] buna dokunmad�
		
		//eger listemiz int lerden olusuyorsa
		//java remove(index) ve remove(object) methodlaar� kar�smas�n diye
		//girilen sayilar� index olarak kabul eder.
		//yani remove(9) dersek 9 rakam�n� aramaz Stringdeki gibi sadece 9. index egider varsa 9. index i siler
		// 9. index yoksa indexofbound hatas� verir.
		
	}}