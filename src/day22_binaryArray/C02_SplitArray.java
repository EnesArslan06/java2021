package day22_binaryArray;

import java.util.Arrays;

public class C02_SplitArray {

	public static void main(String[] args) {
		// split parcalamak demektir. String metodudur. Arrayde de cok kullan�l�r.
		//"Java ogrenmek cok guzel" cumlesinin kelimelerini ters yazd�r�n?
		
		String cumle="Java ogrenmek cok guzel";
		
		String kelimeler[]=cumle.split(" ");
		System.out.println(Arrays.toString(kelimeler)); //4 eleman� olan bir array halie geldi.
		
		for (int i = kelimeler.length-1; i>=0; i--) {
			System.out.print(kelimeler[i]+ " ");
		}
		
		

	

}}
