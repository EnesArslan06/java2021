package day08_IfElseStatemens;

import java.util.Scanner;

public class C02_IfElse {

	public static void main(String[] args) {
		// Kullan�c�dan bir karakter girmesini isteyin ve girilen karakterin harf olup olmad�g�n� yazd�r�n.
		//asscii tablosuna bak�p karakterin degerine bakar�z.
Scanner scan=new Scanner(System.in);

System.out.println("Lutfen bir karakter giriniz:");
		
char karakter=scan.next().charAt(0);
if ((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter<='z')) {System.out.println("Girdiginiz: " + karakter +" Harftir");} 
else {System.out.println("Girdiginiz: " + karakter +" Harf degildir");}	
	
	
	scan.close();
	}

}
