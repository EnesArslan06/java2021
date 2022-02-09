package day22_binaryArray;

import java.util.Arrays;

public class C01_BinarySearchArray {

	public static void main(String[] args) {
		// binarySearch() methodu belli bir eleman�n bir arrayde olup olmad�g�n� kontrol etmek icin kullanilir.
		//Ancak binarySearch() methodunu kullanmadan once mutlaka sort() methodu ile kullan�lmal�d�r.
		//Java arrayde buldugunda eleman�n indexini verir.
//bir eleman array de yoksa sonuc negatif olur.
		
		
		String isimler[]={"Hacer", "ainagul", "Emine", "Murat", "Kutlu"};//mesela a harfini kucuk yazsak
		//ainagulu en sona atar. cunku a harfi ascii degeri olarak buyuk harfli olanlardan buyuktur.
		
			//isimler arrayinde Murat ismi varmi
		Arrays.sort(isimler);//isimlerin s�ras�n� degistirmis ve harf s�ras�na g�re s�ralam�s.
System.out.println(Arrays.toString(isimler));
		isimler[4]="Ainagul"; //burada ismin bas harf�n� buyuk yapt�k ama s�ralamada 5. yere atad�
		//tekrardan sort yapmam�z laz�m
		
Arrays.sort(isimler);	
System.out.println(Arrays.toString(isimler));

System.out.println(Arrays.binarySearch(isimler, "Murat"));//4 sonucunu verdi cunku burada 4. s�rada yer al�yor java.

System.out.println(Arrays.binarySearch(isimler, "Mehmet"));//-5 sonucunu verir
System.out.println(Arrays.binarySearch(isimler, "Tugba"));//-6 sonucunu verir
System.out.println(Arrays.binarySearch(isimler, "Kursat"));//-4 sonucunu verir




}}
