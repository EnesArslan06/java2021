package day25_ArrayReplitSorulari;

public class ArrayMethodSoru5 {

	public static void main(String[] args) {
		//Write a java program that calculates the average value of array elements
		//Arrayin elemanlarýnýn ortalama deðerini hesaplayan bir java programý yazýnýz.
	/*	input[]= {1,2,3,4,5,6,7}
			Output : 4		*/
		
		int array[]={1,2,3,4,5,6,7};
		
		
		int toplam=0;
		
		
		for (int i = 0; i < array.length; i++) {
			toplam+=array[i];
		}
		int ortalama=toplam/array.length;
		
		System.out.println(ortalama);
		
	}

}
