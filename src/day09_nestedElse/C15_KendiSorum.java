package day09_nestedElse;

import java.util.Scanner;

public class C15_KendiSorum {

	public static void main(String[] args) {
		// Kullan�c�dan cinsiyetini isteyin sonra yas�n� isteyin
Scanner scan=new Scanner(System.in);

System.out.println("Cinsiyetin Erkek ise:E Bayan ise K: \n" + "Yas�n�z:\n" + "Boyunuz");
char cinsiyet=scan.next().toUpperCase().charAt(0);
int yas=scan.nextInt();
double boy=scan.nextDouble();

if (cinsiyet=='E') {if (yas>20 && boy>1.70) {System.out.println("Polis Olabilirsiniz");
	
} else {System.out.println("Polis Olamazs�n�z");}}

 else if (cinsiyet== 'K') {if (yas>23 && boy>1.65) 
 {System.out.println("Polis Olabilirsiniz");} else {System.out.println("Polis Olamazs�n");}
	
} else {System.out.println("Lutfen gecerli Bir cinsiyet numaras� girin");}

 
scan.close();	

		
}}	

