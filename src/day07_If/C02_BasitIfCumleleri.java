package day07_If;

import java.util.Scanner;

public class C02_BasitIfCumleleri {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		//Kullan�c�dan bir tamsay� isteyin ve tek mi cift mi oldugunu yazd�r�n.

		System.out.println("Lutfen bir tam say� giriniz");
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {System.out.println("girdiginiz say� cift say�d�r");}
		if (sayi%2==1) {System.out.println("girdiginiz say� tek say�d�r");	}
		
	scan.close();
		//modulus islemi yapt�r�yoruz kalan� alabilmek icin, kalan 1 ise say� tektir cift ise kalan s�f�r olacakt�r.
	}
}
