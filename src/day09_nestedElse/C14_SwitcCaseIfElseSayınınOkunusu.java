package day09_nestedElse;

import java.util.Scanner;

public class C14_SwitcCaseIfElseSayınınOkunusu {

	public static void main(String[] args) {
		/* SORU 2
		 * 
		 * Kullanicidan 3 basamakli bir sayi alip sayinin okunusunu yazdirin
		 * 
		 * Input : 356 Output : Ucyuzellialti*/
		  
Scanner scan=new Scanner(System.in);		
System.out.println("Lutfen 2 basamaklı bir sayı belirtiniz");		
int sayi=scan.nextInt();
int  birler=sayi%10;
int onlar=(sayi/10);

if (sayi>9 && sayi<100) {
	
switch(onlar) {
case 1:System.out.println("on");break;
case 2:System.out.println("yirmi");break;
case 3:System.out.println("otuz");break;
case 4:System.out.println("kırk");break;
case 5:System.out.println("elli");break;
case 6:System.out.println("altmıs");break;
case 7:System.out.println("yetmiş");break;
case 8:System.out.println("seksen");break;
case 9:System.out.println("doksan");break;}

switch (birler) {
case 1:System.out.println("Bir");break;
case 2:System.out.println("iki");break;
case 3:System.out.println("Uc");break;
case 4:System.out.println("Dort");break;
case 5:System.out.println("Bes");break;
case 6:System.out.println("Altı");break;
case 7:System.out.println("Yedi");break;
case 8:System.out.println("Sekiz");break;
case 9:System.out.println("Dokuz");break;}} 
else {System.out.println("Lutfen Gecerli bir sayı giriniz");}


scan.close();

/*Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Üç basamaklı bir sayı girin");
		int sayi = scan.nextInt();
		
		int yüzlerBasamagı = (sayi / 100);
		int onlarBasamagı = (sayi % 100)/10;
		int bırlerBasamagı =(sayi % 10);			
		
		if (sayi >=100 && sayi <=999) {
			switch (yüzlerBasamagı) {
			case 1:
				System.out.print("yüz");
				break;
			case 2:
				System.out.print("ikiyüz");
				break;
			case 3:
				System.out.print("üçyüz");
				break;
			case 4:					
				System.out.print("dörtyüz");
				break;
			case 5:
				System.out.print("beşyüz");
				break;
			case 6:
				System.out.print("altıyüz");
				break;
			case 7:
				System.out.print("yediyüz");
				break;
			case 8:
				System.out.print("sekizyüz");
				break;
			case 9:
				System.out.print("dokuzyüz");
				break;
			}
			
			switch (onlarBasamagı) {
			case 1:
				System.out.print("on");
				break;
			case 2:
				System.out.print("yirmi");
				break;
			case 3:
				System.out.print("otuz");
				break;
			case 4:
				System.out.print("kırk");
				break;
			case 5:
				System.out.print("elli");
​
			case 6:
				System.out.print("altımş");
				break;
			case 7:
				System.out.print("yetmiş");
				break;
			case 8:
				System.out.print("seksen");
				break;
			case 9:
				System.out.print("doksan");
				break;
			}
			
			switch (bırlerBasamagı) {
			case 1:
				System.out.print("bir");
				break;
			case 2:
				System.out.print("iki");
				break;
			case 3:
				System.out.print("üç");
				break;
			case 4:
				System.out.print("dört");
				break;
			case 5:
				System.out.print("beş");
​
			case 6:
				System.out.print("altı");
				break;
			case 7:
				System.out.print("yedi");
				break;
			case 8:
				System.out.print("sekiz");
				break;
			case 9:
				System.out.print("dokuz");
				break;
			}
				
			
		}else {
				System.out.println("Lütfen üç basamaklı bir sayı giriniz");}}
*/
}}
