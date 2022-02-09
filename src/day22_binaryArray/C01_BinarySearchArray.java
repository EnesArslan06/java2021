package day22_binaryArray;

import java.util.Arrays;

public class C01_BinarySearchArray {

	public static void main(String[] args) {
		// binarySearch() methodu belli bir elemanýn bir arrayde olup olmadýgýný kontrol etmek icin kullanilir.
		//Ancak binarySearch() methodunu kullanmadan once mutlaka sort() methodu ile kullanýlmalýdýr.
		//Java arrayde buldugunda elemanýn indexini verir.
//bir eleman array de yoksa sonuc negatif olur.
		
		
		String isimler[]={"Hacer", "ainagul", "Emine", "Murat", "Kutlu"};//mesela a harfini kucuk yazsak
		//ainagulu en sona atar. cunku a harfi ascii degeri olarak buyuk harfli olanlardan buyuktur.
		
			//isimler arrayinde Murat ismi varmi
		Arrays.sort(isimler);//isimlerin sýrasýný degistirmis ve harf sýrasýna göre sýralamýs.
System.out.println(Arrays.toString(isimler));
		isimler[4]="Ainagul"; //burada ismin bas harfýný buyuk yaptýk ama sýralamada 5. yere atadý
		//tekrardan sort yapmamýz lazým
		
Arrays.sort(isimler);	
System.out.println(Arrays.toString(isimler));

System.out.println(Arrays.binarySearch(isimler, "Murat"));//4 sonucunu verdi cunku burada 4. sýrada yer alýyor java.

System.out.println(Arrays.binarySearch(isimler, "Mehmet"));//-5 sonucunu verir
System.out.println(Arrays.binarySearch(isimler, "Tugba"));//-6 sonucunu verir
System.out.println(Arrays.binarySearch(isimler, "Kursat"));//-4 sonucunu verir




}}
