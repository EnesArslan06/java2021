package day25_ArrayReplitSorulari;

import java.util.Arrays;

import java.util.Scanner;

public class ArrayMethodSoru1 {

	public static void main(String[] args) {
	/*Write a return method to reverse number.
				Input : 12345
				Output : 54321		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		String sayi=scan.next();
		
	
		String array[]=new String[sayi.length()];
			
		array=sayi.split("");
		
		//System.out.println(Arrays.toString(array));//[1, 2, 3, 4, 5]
		
		int tersarray[]=new int[array.length];
		for (int i = 0; i < array.length; i++) {
			tersarray[i]=Integer.parseInt(array[array.length-1-i]);;

			System.out.print(tersarray[i]);
		}
		
		
		
		
}}
