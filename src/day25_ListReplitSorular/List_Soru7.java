package day25_ListReplitSorular;

import java.util.ArrayList;
import java.util.List;

public class List_Soru7 {
/*	write a Java program to removes a specific element from an array and put the remaining elements in a new array and prints the new array

	Input :{1,2,3,4,5,6}

	element:6

	Output : [1,2,3,4,5]*/
	
	public static void main(String[] args) {
		
		int array[]={1,2,3,4,5,6};

		//List<Integer> list=new ArrayList<>();

		int silinecekEleman=5;
	
	sil(array,silinecekEleman);
	System.out.println(sil(array,silinecekEleman));
/*for (int i = 0; i < array.length; i++) {
	if (array[i]!=silinecekEleman) {
		list.add(array[i]);
	}
}		
		System.out.println(list);*/
		
	}

private static List<Integer> sil(int[] array, int silinecekEleman) {
	List<Integer> list=new ArrayList<>();
	for (int i = 0; i < array.length; i++) {
		if (array[i]!=silinecekEleman) {
			list.add(array[i]);
		}
	}		
	
	
	return list;
}

}
