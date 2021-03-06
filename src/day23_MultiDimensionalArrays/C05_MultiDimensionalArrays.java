package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C05_MultiDimensionalArrays {

	public static void main(String[] args) {
		// MultiDimensionalArrays ler ic ice olusturulmus arraylerdir.
		//bunu olusturmak icin 2 yontemimiz vardır.
		//1. yontenOnce declare sonra deger atama
			int arr[][]=new int[3][2]; //outer arrayi 3 elemanlı, her bir inner array ise 2 elemanlı olan
			//multidimensionalArray olusturulur.
			//bu yontemle olusturulan arraylerin hepsi ayni boyutta olmalıdır.
	System.out.println(Arrays.toString(arr));//[[I@244038d0, [I@5680a178, [I@5fdef03a] boyle bir sonuc verdi
							//[[0,0],[0,0],[0,0]]; bu sekilde yazdırmasını bekliyorduk. Ancak referanslarını yazıyor.
							//direk outer arrayi yazdırmak istedigimizde icindeki elemanlar non primitive oldugundan 
							//referansları yazdırılır
System.out.println(Arrays.toString(arr[1]));//[0, 0] yazdırdı teker teker yazdırabiliriz.
System.out.println(Arrays.deepToString(arr)); //[[0, 0], [0, 0], [0, 0]] bu methodla yaparsak yazdırabiliriz.

arr[0][1]=5; //burada atama yaptık 0. index 1. element
arr[1][0]=2;
arr[2][1]=3;			
	System.out.println(Arrays.deepToString(arr));	//{[0, 5], [2, 0], [0, 3]}bu hale getirdik
			
	
	//Array olusturmak icin 2. yontem
	
	int arr2[][]= {{0},{1,2,3},{6,7,8,9}};//bu sekilde olusturusak Array olusturmak daha kolay ve 
											//butun elemenler farklı sayilarda atayabiliriz
	System.out.println(Arrays.deepToString(arr2));//[[0], [1, 2, 3], [6, 7, 8, 9]] bunu yazdık
	
	System.out.println(Arrays.toString(arr2[1]));//[1, 2, 3]

	System.out.println(arr2[2][1]);// 7 yi goruyoruz. Komple arrayi yazdırmak istersek Arrays. kullanılır.
									//sadece tek rakam icin arr2. diye yazmak yeterlidir.
	
	
	
	
}}
