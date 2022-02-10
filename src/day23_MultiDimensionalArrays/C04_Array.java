package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C04_Array {

	public static void main(String[] args) {
		// Verilen iki arrayi birlestiren ve sonucu birlesik array isminde bir araye kaydeden
		//bir method olusturunuz.
		int arr1[]= {3,5,7,10};//3. index e kadar bunlarý koyacak
		int arr2[]= {2,4,6,8,9};//4 . indexten sonrada bunlarý koyacak
		
		int birlesikarray[] =  birlestir(arr1,arr2);//bu birlesikarrayi asagýdaki metodda kullanmayýz local variable
											//asagýda tekrar ayný isimde bile olsa bir variable olusturmalýyýz
		
		//System.out.println(Arrays.toString(birlesikarray));//[3, 5, 7, 10, 0, 0, 0, 0, 0]
														//ilk arrayin indexlerini aldýk
		System.out.println(Arrays.toString(birlesikarray));//[3, 5, 7, 10, 2, 4, 6, 8, 9] bu sonucu bulduk 
														//bunu sýralýyoruz en son
		Arrays.sort(birlesikarray);
		System.out.println(Arrays.toString(birlesikarray));//son hali sýralamýsta olduk
	}

	private static int [] birlestir(int[] arr1, int[] arr2) {
		
		int birlesikarray[]=Arrays.copyOf(arr1, arr1.length+arr2.length); //2. kez forloop yapmamýza gerek yoktu
				//bu method arr1 ile baslayacak onlarý atayacak biz arr2 nin uzunlugunu ekledik
				//yani bu methoddan sonra tek forloop ile islemi bitirebilir. Bu methoddan sonra
				//birlesik array su sekilde olur {3,5,7,10,0,0,0,0,0} son arr2 nin yerini ayirdýk o default degerleni atadý
				//asagýdaki for arr2 nin degerlerini atadýktan sonra islem bitmis olacak
			
				
				for (int j =0; j < arr2.length; j++) {
			birlesikarray[j+arr1.length]=arr2[j];
		}
		
		return birlesikarray;
	}

}