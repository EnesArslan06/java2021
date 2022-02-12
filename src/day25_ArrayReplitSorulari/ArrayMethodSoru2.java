package day25_ArrayReplitSorulari;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethodSoru2 {

	public static void main(String[] args) {
		/*Write a Java program that reverse a sentence by using Array (with all spaces and special characters).
		Input : Coding is greate.
		Output : .etaerg si gnidoC*/

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir cumle giriniz...");
		String isim=scan.nextLine();
		
		String arr[]=isim.split("");
		String arryeni[]=new String[arr.length];
		
		for (int i = 0; i<arr.length ; i++) {
			
			arryeni[i]=arr[arr.length-i-1];
			System.out.print(arryeni[i]);
		}
		
		
	}

}
