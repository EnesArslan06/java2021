package day07_If;

import java.util.Scanner;

public class C02_BasitIfCumleleri {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		//Kullanýcýdan bir tamsayý isteyin ve tek mi cift mi oldugunu yazdýrýn.

		System.out.println("Lutfen bir tam sayý giriniz");
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {System.out.println("girdiginiz sayý cift sayýdýr");}
		if (sayi%2==1) {System.out.println("girdiginiz sayý tek sayýdýr");	}
		
	scan.close();
		//modulus islemi yaptýrýyoruz kalaný alabilmek icin, kalan 1 ise sayý tektir cift ise kalan sýfýr olacaktýr.
	}
}
