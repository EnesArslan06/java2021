package day25_ListReplitSorular;

import java.util.ArrayList;
import java.util.List;

public class List_Soru6 {

	public static void main(String[] args) {
		/*
		 * Write a program to find the common elements between two String Arrays
		 * (without case sensitivity)
		 * 
		 * Input1 : {John,Brad,Ange,Sofia,Emily}
		 * 
		 * Input2 : {sofia,brad,grace,emily,hazel}
		 * 
		 * Output : [sofia,brad,emily]
		 */
		String arr1[] = { "sofia", "brad", "grace", "emily", "hazel" };
		
		String arr2[] = { "John", "Brad", "Ange", "Sofia", "Emily" };

		List<String> isimler = new ArrayList<>();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i].toLowerCase().equals(arr2[j].toLowerCase())) {

					isimler.add(arr1[i]);

				}

			}
		}
	System.out.println(isimler);
	
	}
	
}
