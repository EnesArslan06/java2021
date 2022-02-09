package day21_scopVeArrays;

import java.util.Arrays;

public class C07_ArraysSoru {

	public static void main(String[] args) {
		// verilen erayin tum elemanlarýný toplayýn
		
		int array[]= {3,5,7,9,11,13,1,2,4};
		int toplam=0;
		for (int i = 0; i < array.length; i++) {
			
			toplam+=array[i];
		}

		System.out.println(toplam);
	
		//arrayin tum elemanlarýn kucukten buyuge ve buyukten kusuge yazdýrýn

	Arrays.sort(array); //kucukten byuge yazdýrmak icin sort kulanýlýr
	System.out.println(Arrays.toString(array));
	
	//buyukten kucuge yazdýrmak icin; ya for loop ile elemanlarý ters sýrada yazdýr deriz
	for (int i = array.length-1; i>=0 ; i--) {
		System.out.print(array[i] + " "); // bu sekilde de yazdýrdý
	}	
		
	//array yapmak isterseniz ayný uzunlukta bir array olusturup
	//elemanlarý ters sirada yeni arraye tasýyabilirsiniz
	int tersArray[]=new int[array.length];
	System.out.println(Arrays.toString(tersArray));//[0, 0, 0, 0, 0, 0, 0, 0, 0] bu sekilde yazdý
	
	for (int i = 0; i < tersArray.length; i++) {
		tersArray[i]=array[array.length-1-i];
	
	}
	System.out.println(Arrays.toString(tersArray));	// bu sekillde oldu. hem degerlerini atadý hemde sýraladý.
	
	
	
	
	
	
	
	}}
