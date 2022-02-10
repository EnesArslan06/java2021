package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_ArraySoru {

	public static void main(String[] args) {
		// Verilen bir array dan istenen degerlere sahip elementleri silip
		//kalaný yeni bir array olarak kaydedin
		//yeni arrayi yazdýrýn
		
		int arr[]= {3,4,5,6,3,5,8,3,4,9};
		int silinecekeleman=3;		
		
		//array de yeni eleman ekleyemeyiz veya var olan elemanlarý silemeyiz
		//cunku arrayin declare edilen uzunlugu degismez.
		
		//bu soruda istenen elementi sildigimizde geriye kac element kalýyor bulmamýz lazým.
		//bunuda forloop ile yapabiliriz. Silinecek eleman sayisini bulalým
		
		int sayac=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==silinecekeleman) {
				sayac++;
			}
		}
		System.out.println(sayac); //3 tane silinecek eleman buldu.
		
		int yeniArrayuzunluk=arr.length-sayac;//burada cýkarýlacak elemanlarýn sayýsýndan yeni arrayin uzunlugunu
							//buluruz.
		
		int yeniArray[]=new int[yeniArrayuzunluk];
		
		//simdi eski arraydaki elemanlarý birer birer alýp
		//silinecek elemana esit olmayanlarý yeni arraye atamalýyýz.
		
		int index=0; //yeni arrayin indexlerini sayacak.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=silinecekeleman) {
				yeniArray[index]=arr[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(yeniArray));
	

}}
