package day23_MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C02_ArraySoru {

	public static void main(String[] args) {
		// Kullan�c�dan bir cumle isteyin ve cumledeki kelime sayisini yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		
	String kelimeler[]=cumle.split(" ");
	System.out.println(Arrays.toString(kelimeler));//[java, ile, hayat, cok, guzel]
	System.out.println("Girilen Cumlede " + kelimeler.length + " adet kelime var");
	
	
	
}}
