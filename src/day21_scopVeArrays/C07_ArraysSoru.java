package day21_scopVeArrays;

import java.util.Arrays;

public class C07_ArraysSoru {

	public static void main(String[] args) {
		// verilen erayin tum elemanlar�n� toplay�n
		
		int array[]= {3,5,7,9,11,13,1,2,4};
		int toplam=0;
		for (int i = 0; i < array.length; i++) {
			
			toplam+=array[i];
		}

		System.out.println(toplam);
	
		//arrayin tum elemanlar�n kucukten buyuge ve buyukten kusuge yazd�r�n

	Arrays.sort(array); //kucukten byuge yazd�rmak icin sort kulan�l�r
	System.out.println(Arrays.toString(array));
	
	//buyukten kucuge yazd�rmak icin; ya for loop ile elemanlar� ters s�rada yazd�r deriz
	for (int i = array.length-1; i>=0 ; i--) {
		System.out.print(array[i] + " "); // bu sekilde de yazd�rd�
	}	
		
	//array yapmak isterseniz ayn� uzunlukta bir array olusturup
	//elemanlar� ters sirada yeni arraye tas�yabilirsiniz
	int tersArray[]=new int[array.length];
	System.out.println(Arrays.toString(tersArray));//[0, 0, 0, 0, 0, 0, 0, 0, 0] bu sekilde yazd�
	
	for (int i = 0; i < tersArray.length; i++) {
		tersArray[i]=array[array.length-1-i];
	
	}
	System.out.println(Arrays.toString(tersArray));	// bu sekillde oldu. hem degerlerini atad� hemde s�ralad�.
	
	
	
	
	
	
	
	}}
