package day13_StringManipulationMethods;

import java.util.Scanner;

public class C10_Sorular {

	public static void main(String[] args) {
		/* Kullanicidan isim isteyin Eger
		-
		isim “a" harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
		-
		isim “Z" harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
		-
		ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin*/
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen bir isim giriniz");
String isim=scan.nextLine();
if (isim.contains("a")) {System.out.println("Girdiginiz isim a harfi içeriyor");
} else if(isim.contains("Z")){System.out.println("Girdiginiz isim Z harfi içeriyor");
}
else {System.out.println("Girdiginiz isim a ve Z harfi içermiyor");}
		
		
		
	scan.close();	

}}
