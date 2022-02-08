package day18_NestedForLoop_whileLoop;

import java.util.Scanner;

public class C07_WhileLoopSorular {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		// While loop kullanarak 3 den 13 e kadar tum tek tamsayilari ekrana yazdiriniz.

		
			/*int sayi=3;
			while (sayi<=13) {
			if (sayi%2==1) {
			System.out.print(sayi+ " ");};
			sayi++;}	

			/*	int sayi=3;
			for (int i = 3;  i<=13 ; i+=2) {
			System.out.print(i+ " ");} */
		

//For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na tam
		//bolunebilen sayilari yazdirin.

			/*int sayi1=100;
			while (sayi1<1000) {
			if (sayi1%15==0 && sayi1%20==0 && sayi1%90==0) {
			System.out.print(sayi1+ " ");}
			sayi1++;	*/

			/*for (int sayi1 =100; sayi1 < 1000; sayi1++) {
			if (sayi1%15==0 && sayi1%20==0 && sayi1%90==0) {
			System.out.print(sayi1+ " ");}}*/
	
	
//Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis degeri
//dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.	

			/*System.out.println("Lutfen 2 adet sayi belirtin:");	
			int baslangic=scan.nextInt();
			int bitis=scan.nextInt();
	
			while (baslangic<=bitis) {
			if (baslangic%2==0) {System.out.print(baslangic+" ");}
			else if (baslangic%2==1) {System.out.print(++baslangic+" ");}
			baslangic+=2;	
				 }			*/
		
		
		/* for (int i = baslangic; i <= bitis; i+=2) {
			if (i%2==0) {System.out.print(i+" ");}
			else if(i%2==1) {System.out.print(++i +" ");}	}*/
			
			
/*Kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana
yazdirin. Kullanicinin hata yapmadigini farz edin.
Ornegin kullanici 3 girerse;
3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30	*/	

			/*System.out.println("Lutfen bir rakam giriniz.(0-9)");
			​		int rakam = scan.nextInt();
			​
			int carpim = 1;
			int sonuc = 1;
			​
			while (carpim <= 10) {
			​
				sonuc = rakam * carpim;
			​
				System.out.print(rakam + "x" + carpim + "=" + sonuc + " ");
			​
				carpim++;				}			*/



/*Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane
olduklarini ekranda yazdirin	*/	

				/*System.out.println("Lutfen bir sayi giriniz");
				int sayi =scan.nextInt();
				
				int bolen=1;
				int sayac=0;
				while (bolen<=sayi) {
						if (sayi%bolen==0) {
						System.out.print(bolen+" ");
						sayac++;
								}					
					bolen++;		}
						System.out.println("");
						System.out.println("Toplam "+ sayac+ " tane pozitif tam boleni var.");*/


/*Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
		
		System.out.println("Rakam degerleri toplanacak sayiyi giriniz:");
		
		int sayi = scan.nextInt();
		int toplam =0;
		int rakam =0;
		
		while (sayi>0) {
			rakam = sayi%10;
			toplam+=rakam;
			sayi/=10;				}
		System.out.println("Girdiginiz sayinin rakamlar toplami: "+toplam);	*/
		
		
	
scan.close();	
	
}}
	
	

		
