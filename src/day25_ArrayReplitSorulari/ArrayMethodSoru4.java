package day25_ArrayReplitSorulari;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethodSoru4 {

	public static void main(String[] args) {
		/*Create a custom return type method 
		accepts a name as parameter and prints the name as a char array.
(do not use toCharArray() method)
Input : John
Output :[J, o, h, n]*/
		
Scanner scan=new Scanner(System.in)	;
System.out.println("Lutfen bir isim giriniz");
String isim=scan.nextLine();

String array[]=isim.split("");
System.out.println(Arrays.toString(array));		

scan.close();
	}

}
