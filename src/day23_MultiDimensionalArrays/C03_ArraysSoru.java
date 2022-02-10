package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C03_ArraysSoru {

	public static void main(String[] args) {
		// Verilen iki arrayi birlestiren ve sonucu birlesik array isminde bir araye kaydeden
		//bir method olusturunuz.
		int arr1[]= {3,5,7,10};//3. index e kadar bunlar� koyacak
		int arr2[]= {2,4,6,8,9};//4 . indexten sonrada bunlar� koyacak
		
		int birlesikarray[] =  birlestir(arr1,arr2);//bu birlesikarrayi asag�daki metodda kullanmay�z local variable
											//asag�da tekrar ayn� isimde bile olsa bir variable olusturmal�y�z
		
		//System.out.println(Arrays.toString(birlesikarray));//[3, 5, 7, 10, 0, 0, 0, 0, 0]
														//ilk arrayin indexlerini ald�k
		System.out.println(Arrays.toString(birlesikarray));//[3, 5, 7, 10, 2, 4, 6, 8, 9] bu sonucu bulduk 
														//bunu s�ral�yoruz en son
		Arrays.sort(birlesikarray);
		System.out.println(Arrays.toString(birlesikarray));//son hali s�ralam�sta olduk
	}

	private static int [] birlestir(int[] arr1, int[] arr2) {
		int birlesikarray[]=new int[arr1.length+arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {//bu loop 1. arrayin elementlerini birlesik arraya ekleyecek
			
			birlesikarray[i]=arr1[i];//birlesik arrayin indexlerinden 0,1,2,3 index
		}
		for (int j =0; j < arr2.length; j++) {
			birlesikarray[j+arr1.length]=arr2[j];
		}
		
		return birlesikarray;
	}

}
