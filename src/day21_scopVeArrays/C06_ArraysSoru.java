package day21_scopVeArrays;

import java.util.Arrays;

public class C06_ArraysSoru {

	public static void main(String[] args) {
		// Soru 1: Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin. 
		//Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.

	
	int array[]= {1,2,3,4,5};
	int kova=array[0]; //arraay sýfýrdaki elemanýný kovaya koy, 1 sayýsýný kovaya koyduk
	
	for (int i = 0; i < array.length-1; i++) {
		array[i]=array[i+1]; //burada i 0 oldugunda array[0]=1  indexi 1. degere ata demek
	
	}
	array[array.length-1]=kova;//burada en basta kovaya ayýrdýgýmýz 1 degerini sona geri aldýk
	System.out.println(Arrays.toString(array));//sonucu [2,3,4,5,5] geldi kovadaki 1 i tekrardan aldýk sona getirdik
	
	
	}
}