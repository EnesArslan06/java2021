package day25_ArrayReplitSorulari;

import java.util.Arrays;

public class ArrayMethodSoru3 {

	public static void main(String[] args) {
		 /* Write a method which accepts a String as parameter and prints the sum of the digits,
		//present in the given string.
		input : ade1r4d3
			output : 8
		    Use Character.isDigit()
		     Integer.valueOf()*/
		
		String kelime="ade1r4d3";
		String array[]=kelime.split("");
		System.out.println(Arrays.toString(array));
		
		int toplam=0;
		
		for (int i = 0; i < array.length; i++) {
			if (Character.isDigit(array[i].charAt(0))) {
				toplam+=Integer.valueOf(array[i]);
			} 
		}
		System.out.println(toplam);
	}

}
