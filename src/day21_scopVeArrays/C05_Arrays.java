package day21_scopVeArrays;

import java.util.Arrays;

public class C05_Arrays {

	public static void main(String[] args) {
		int enes[]= {2,4,5,6,78,89};//bu sekilde array� olusturduk ve degerlerini atam�s olduk.
		//buradaki tum elementleri yazd�rmak icin
		
		for (int i = 0; i < enes.length; i++) {//burada kendi otomatik olarak olusturdu array�n s�n�r�na kadar.
			System.out.print(enes[i] + " "); //bu elemetlerin tamam�n� yazm�s olduk
		
}
	
		System.out.println("\n"+Arrays.toString(enes));//bu kendi olusturuyor arrays. dedigimizde bircok method c�kart�yor.
//to string olan�n� sectigimizde parantez icine array�mizin ad�n� yaz�yoruz. sonra o yazd�r�yor. \n i kendim koydum
//array�n elemanlar�n� bu sekilde yazd�r�rsak koseli parantezli ve virgullu olarak yazar.
		
		
	}

}
