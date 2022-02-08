package day12_StringManipulationMethods;

import java.util.Scanner;

public class C03_LastIndexOf {

	public static void main(String[] args) {
		// lastindex de sondan baslar aramaya ama sonucu yine rakamý bastan gibi sýrasýna göre yapar.
		
		// Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");

		String cumle=scan.nextLine(); 
		System.out.println("Lutfen varlýgýný kontrol etmek icin bir harf giriniz");

		char karakter=scan.next().charAt(0);

		int index=cumle.lastIndexOf(karakter);			
		
		if (index<0) { System.out.println("Girdiginiz harf cumlede yoktur."); //index==(-1) de olabilir.
		
		} else {System.out.println("Girdiginiz harf cumlede vardýr");}


		scan.close();
		
		
			/*String str = "Calisirsaniz, Java ogrenmek cok kolay";
			System.out.println(str.lastIndexOf('a'));
			System.out.println(str.lastIndexOf("a"));
			System.out.println(str.lastIndexOf('t'));
			System.out.println(str.lastIndexOf("Java"));
			System.out.println(str.lastIndexOf('a',11));*/
	

}}
