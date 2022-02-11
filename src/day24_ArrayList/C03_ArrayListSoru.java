package day24_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayListSoru {

	public static void main(String[] args) {
		// Verilen bir array'den istenen degere sahip elementleri silip
		// kalani yeni bir array olarak kaydedin
		// ve sonra yeni array'i yazdirin
		
		int arr[]= {3,4,5,6,3,5,3,3,3,3,3,3,3,3};
		int silinecekEleman=3;
		List<Integer> gecici=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]!= silinecekEleman) {
				gecici.add(arr[i]);//silinecek 3 leri alma digerlerini gecici arrayListe ekle diyoruz
			}
		}
		System.out.println(gecici);//suan gecici array liste 3 ler haric 4 tane eleman var.
		
		//sonucu array olarak gormek istiyorsak
		//listeden al arraye ko al koy yapmamýz lazým. Yeni array olusturacaz
		
		
		int yeniarray[]=new int[gecici.size()];//gecici listarrayin boyutu kadar boyut verdik.
		//gecici listedeki elemanlarý for ile alýyoruz yeniarraye
		for (int i = 0; i < yeniarray.length; i++) {
			yeniarray[i]=gecici.get(i);//index i olaný getir yeniarrayin i sine ekle. i her seferinde calýsýyor
		}
		
//yeni arrayimizi yazdýralým
		System.out.println(Arrays.toString(yeniarray));//[4, 5, 6, 5] bu sonucu bulduk
	

}}
