package day09_nestedElse;

import java.util.Scanner;

public class C05_OdevTernaryTekCiftSayý {

	public static void main(String[] args) {
		// Soru:2 Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin.
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen Bir tam sayý girin");
		int sayi=scan.nextInt();

		System.out.println(sayi%2==1 ? "Girmis oldugunuz sayi Tek Sayýdýr: " + sayi : 
			"Girmis oldugunuz sayý Cift Sayýdýr" + sayi );
		
		
		//	String tekcift=sayi%2==0 ? "Cift sayý" : "Tek sayi";

		//System.out.println("Girmis oldugunuz sayý " + tekcift +" dir");
scan.close();
	}

}
