package day13_StringManipulationMethods;

import java.util.Scanner;

public class C11_Sorular {

	public static void main(String[] args) {
		// Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin
		
Scanner scan=new Scanner(System.in);
System.out.println("Isminizi Giriniz:");
String isim=scan.nextLine();
String soyisim=scan.nextLine();

System.out.println(isim.length()>soyisim.length() ? isim : soyisim);




scan.close();
	

}}
