package day09_nestedElse;

import java.util.Scanner;

public class C05_OdevTernaryTekCiftSay� {

	public static void main(String[] args) {
		// Soru:2 Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin.
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen Bir tam say� girin");
		int sayi=scan.nextInt();

		System.out.println(sayi%2==1 ? "Girmis oldugunuz sayi Tek Say�d�r: " + sayi : 
			"Girmis oldugunuz say� Cift Say�d�r" + sayi );
		
		
		//	String tekcift=sayi%2==0 ? "Cift say�" : "Tek sayi";

		//System.out.println("Girmis oldugunuz say� " + tekcift +" dir");
scan.close();
	}

}
