package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_ArraySoru {

	public static void main(String[] args) {
		// Verilen bir array dan istenen degerlere sahip elementleri silip
		//kalan� yeni bir array olarak kaydedin
		//yeni arrayi yazd�r�n
		
		int arr[]= {3,4,5,6,3,5,8,3,4,9};
		int silinecekeleman=3;		
		
		//array de yeni eleman ekleyemeyiz veya var olan elemanlar� silemeyiz
		//cunku arrayin declare edilen uzunlugu degismez.
		
		//bu soruda istenen elementi sildigimizde geriye kac element kal�yor bulmam�z laz�m.
		//bunuda forloop ile yapabiliriz. Silinecek eleman sayisini bulal�m
		
		int sayac=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==silinecekeleman) {
				sayac++;
			}
		}
		System.out.println(sayac); //3 tane silinecek eleman buldu.
		
		int yeniArrayuzunluk=arr.length-sayac;//burada c�kar�lacak elemanlar�n say�s�ndan yeni arrayin uzunlugunu
							//buluruz.
		
		int yeniArray[]=new int[yeniArrayuzunluk];
		
		//simdi eski arraydaki elemanlar� birer birer al�p
		//silinecek elemana esit olmayanlar� yeni arraye atamal�y�z.
		
		int index=0; //yeni arrayin indexlerini sayacak.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=silinecekeleman) {
				yeniArray[index]=arr[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(yeniArray));
	

}}
