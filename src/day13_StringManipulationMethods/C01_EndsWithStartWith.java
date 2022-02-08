package day13_StringManipulationMethods;

import java.util.Scanner;

public class C01_EndsWithStartWith {

	public static void main(String[] args) {
		// endsWith methedu sonu bununla mý bitiyor, true false sonucu verir. 
			//parametresi String olmalýdýr.
	//StartsWith sununlamý baslar, burasý cok onemli. String olmasý lazým sonucu true false dur.
			//bir karakterdeki indexten sonraki ilede bakýlabilir.

		//Kullanýcýdan bir cumle ve bir kelime alýn Verilen cumlenin verilen kelime 
		//ile baslayýp baslamadýgýný bitip bitmedigini kontrol edin
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