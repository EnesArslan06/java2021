package day08_IfElseStatemens;

import java.util.Scanner;

public class C02_IfElse {

	public static void main(String[] args) {
		// Kullanıcıdan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadıgını yazdırın.
		//asscii tablosuna bakıp karakterin degerine bakarız.
Scanner scan=new Scanner(System.in);

System.out.println("Lutfen bir karakter giriniz:");
		
char karakter=scan.next().charAt(0);
if ((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter<='z')) {System.out.println("Girdiginiz: " + karakter +" Harftir");} 
else {System.out.println("Girdiginiz: " + karakter +" Harf degildir");}	
	
	
	scan.close();
	}

}
