package day13_StringManipulationMethods;

import java.util.Scanner;

public class C01_EndsWithStartWith {

	public static void main(String[] args) {
		// endsWith methedu sonu bununla m� bitiyor, true false sonucu verir. 
			//parametresi String olmal�d�r.
	//StartsWith sununlam� baslar, buras� cok onemli. String olmas� laz�m sonucu true false dur.
			//bir karakterdeki indexten sonraki ilede bak�labilir.

		//Kullan�c�dan bir cumle ve bir kelime al�n Verilen cumlenin verilen kelime 
		//ile baslay�p baslamad�g�n� bitip bitmedigini kontrol edin
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Lutfen Bir cumle giriniz");
	String cumle=scan.nextLine();
	System.out.println("Lutfen Kelime giriniz");
	String kelime=scan.next();
	
	 if (cumle.startsWith(kelime)) {
         System.out.println("girilen cumle " + kelime + " ile basliyor");
     } else {
         System.out.println("girilen cumle " + kelime + " ile baslamiyor");
     }
     if (cumle.endsWith(kelime)) {
         System.out.println("girilen cumle " + kelime + " ile bitiyor");
     } else {
         System.out.println("girilen cumle " + kelime + " ile bitmiyor");
     }
     scan.close();
	
}}