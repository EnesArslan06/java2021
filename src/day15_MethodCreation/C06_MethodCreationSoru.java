package day15_MethodCreation;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class C06_MethodCreationSoru {

	public static void main(String[] args) {
		/* Soru 1 ) Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, sifirdan buyuk mu
		kucuk mu oldugunu, ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki
		rakamlarin toplamini,100’den kucukse sadece 1’ler basamagini yazdiran 3 method
		olusturun.*/

		Scanner scan=new Scanner(System.in);	
	
System.out.println("Lutfen bir sayi belirtiniz...");
int sayi=scan.nextInt();

yuzdenbuyukmu(sayi);
buyukmu(sayi);
tekmi(sayi);
}

	private static void yuzdenbuyukmu(int sayi) {
		if (sayi>=100) {System.out.println("Girmis oldugunuz sayınin basamaklari toplamı: "
				+ ((sayi/100)%10 + (sayi/10)%10 + sayi%10));
			
		} else {System.out.println("Girmis oldugunuz sayi 100 den Kucuktur");

		}
		
	}

	private static void buyukmu(int sayi) {
		if (sayi>0) {System.out.println("Girmis oldugunuz sayi pozitiftir");
			
		} else if(sayi==0){System.out.println("Girdiginiz sayi Sıfırdır");}
		else {System.out.println("Girmis oldugunuz sayi negatiftir");}
		
		
	}

	private static void tekmi(int sayi) {
		if (sayi%2==0) {System.out.println("Girmis oldugunuz sayi cift sayidir");
			
		} else {System.out.println("Girmis oldugunuz sayi tek sayidir");

		}
		
	}  
	
	
		
	
	
}
