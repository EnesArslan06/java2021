package day17_forLoop;

import java.util.Scanner;

public class C07_forLoopSoruFaktoriyel {

	public static void main(String[] args) {
		/* Soru 11 ) Interview Question
		Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
		sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)  */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen  bir sayi giriniz");
		
		int sayi=scan.nextInt();
	System.out.print(sayi+"!=");
int faktoryel=1; //buraya 0 girersek carpýmda yutan eleman oldugu için herseyi siler

for (int i =sayi; i >1 ; i--) {  //sayidan basladý bire kadar eksilterek gidecek
	faktoryel*=i;  //her i degerini carp diyoruz
System.out.print(i+"*");
}
				
		
	System.out.println("1="+ faktoryel);	
	
scan.close();	
}
}
