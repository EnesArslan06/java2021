package day12_StringManipulationMethods;

import java.util.Scanner;

public class C01_IndexOf {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen bir cumle giriniz");

String cumle=scan.nextLine(); // nextLine yapmamýzýn nedeni tek bir kelime girmeyebilir.
System.out.println("Lutfen varlýgýný kontrol etmek icin bir harf giriniz");

char karakter=scan.next().charAt(0);

int index=cumle.indexOf(karakter);//girilen karakterin cumledeki indexini verir. Aranan harf var ve index i 5 5 neyse
//eger yoksa 0 dan kucuk olacak yani -1 o zaman olmadýgý anlamýna gelir.

if (index<0) { System.out.println("Girdiginiz harf cumlede yoktur."); //index==(-1) de olabilir.
	
} else {System.out.println("Girdiginiz harf cumlede vardýr");}


scan.close();

}}

	


