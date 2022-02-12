package day25_ListReplitSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class List_Soru3 {
/*Get a sentence from the user. Accept the sentence received from the user as a parameter, 
 * Invert sentence using Array and write a Method that returns the result as a String to the main
 *  method.
Note: Upper and lower case letters, spaces and special characters will not be changed.
Input :
It is very nice to write code.
Output :
.edoc etirw ot ecin yrev si tI */
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir cumle giriniz");
		String str=scan.nextLine();
		String arr[]=str.split("");
		
		List<String> ters=new ArrayList();
		
		for (int i = 0; i < arr.length; i++) {
			ters.add(arr[arr.length-1-i]);
		}
		
		
		for (int i = 0; i < ters.size(); i++) {
			System.out.print(ters.get(i));
		}
		
	}

}
