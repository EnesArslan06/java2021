package day13_StringManipulationMethods;

import java.util.Scanner;

public class C12_Sorular {

	public static void main(String[] args) {
		// Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

		Scanner scan=new Scanner(System.in)	;		
	System.out.println("Lutfen 4 harfli bir kelime giriniz");	
	String kelime=scan.next();
	System.out.println("Girdiginiz kelimenin tersi: " + kelime.substring(3,4)+kelime.substring(2,3)+
	kelime.substring(1,2) + kelime.substring(0,1)) ;

	
	scan.close();
}}
