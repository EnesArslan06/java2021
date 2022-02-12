package day25_ListReplitSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class List_Soru8 {

	public static void main(String[] args) {

		/*
		 * Write a java program which accept a sentence as parameter, than reverses
		 * sentence by using StringBuilder and checks if sentence is palindrome or not
		 * (without case sensitivity).Use StringBuilder. Input : I love Java. Output:
		 * Reversed sentence : avaJ evol I. It is not a palindrome"
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir cumle giriniz");
		String str = scan.nextLine();

		
		
		
		
		String ters = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			ters += str.charAt(i);

		}
		System.out.println(ters);

		if (ters.equals(str)) {
			System.out.println("Palindrom");

		} else {
			System.out.println("Palindrom Degil");
		}
	}

}
