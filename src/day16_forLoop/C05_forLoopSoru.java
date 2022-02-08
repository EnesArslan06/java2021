package day16_forLoop;

import java.util.Scanner;

public class C05_forLoopSoru {

	public static void main(String[] args) {
		// Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar
		//3’un kati olan sayilari yazdirin.
		//sayi negetifse veya tam sayi degilse uyarý versin program
		//kullanýcýnýn virgullu olmasýnýn onune gecilir.
		
		Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen 100 den kucuk bir tam sayi giriniz");
	double sayi=scan.nextDouble();
	//int sayi2= sayi dersek kabul etmez ancak kýrmýzý ustune gelip yaparsak manualnarrowing olur kabul eder
	int sayi2=(int) sayi;
	
	
		//birden itibaren basladý kullanýcýnýn girdigi sayýya kadar olan butun 3 un katý olan rakamlarý yazdýrýr.
	//burada sayi negatifse veya tamsayi degilse uyarý verme konusunu yapmamýz lazým.
if (sayi<0) {
	System.out.println("Negatif sayi giremezsiniz...");	
} else if (sayi!=sayi2) {System.out.println("Lutfen Tam sayi giriniz");    //bu sekilde dersek kullaýcý 9.3 girdiginde biz bunu 9 a cevirdik yani int.
} else if(sayi>100)System.out.println("100 den buyuk bir sayi giremezsiniz");//ancak uyarý vermesi için sayilarýn esitiligine bakarýz esit degilse kullanýcý double girmistir.	
else{for (int i =1 ;  i<=sayi ; i++) {  					//tam sayi ve virgullu sayi girmezse calýsmasý icin diger sartlarda else calýsýr.
		if (i%3==0) {System.out.println(i + " ");}} 

}{
}			




	
	
scan.close();	
	
	}}
