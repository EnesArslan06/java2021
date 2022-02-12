package day25_ArrayReplitSorulari;

import java.util.Arrays;

public class ArrayMethodSoru6 {

	public static void main(String[] args) {
	/*	Write a method that accepts an integer array as input and prints 
	 the minimum and the maximum numbers from given array
		Input : {3,2,5,4,1,6}
		Output :
		min: 1
		max: 6*/

	
	int array[]={3,2,5,4,1,6};
	
	Arrays.sort(array);
	System.out.println(Arrays.toString(array));
	
	System.out.println("min: "+ array[0]);
	System.out.println("max: "+ array[array.length-1]);
	
	
	
	
	
	
	}

}
