package day16_forLoop;

import java.util.Scanner;

public class C05_forLoopSoru {

	public static void main(String[] args) {
		// Kullanicidan 100�den kucuk bir tamsayi isteyin. 1�den baslayarak girilen sayiya kadar
		//3�un kati olan sayilari yazdirin.
		//sayi negetifse veya tam sayi degilse uyar� versin program
		//kullan�c�n�n virgullu olmas�n�n onune gecilir.
		
		Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen 100 den kucuk bir tam sayi giriniz");
	double sayi=scan.nextDouble();
	//int sayi2= sayi dersek kabul etmez ancak k�rm�z� ustune gelip yaparsak manualnarrowing olur kabul eder
	int sayi2=(int) sayi;
	
	
		//birden itibaren baslad� kullan�c�n�n girdigi say�ya kadar olan butun 3 un kat� olan rakamlar� yazd�r�r.
	//burada sayi negatifse veya tamsayi degilse uyar� verme konusunu yapmam�z laz�m.
if (sayi<0) {
	System.out.println("Negatif sayi giremezsiniz...");	
} else if (sayi!=sayi2) {System.out.println("Lutfen Tam sayi giriniz");    //bu sekilde dersek kulla�c� 9.3 girdiginde biz bunu 9 a cevirdik yani int.
} else if(sayi>100)System.out.println("100 den buyuk bir sayi giremezsiniz");//ancak uyar� vermesi i�in sayilar�n esitiligine bakar�z esit degilse kullan�c� double girmistir.	
else{for (int i =1 ;  i<=sayi ; i++) {  					//tam sayi ve virgullu sayi girmezse cal�smas� icin diger sartlarda else cal�s�r.
		if (i%3==0) {System.out.println(i + " ");}} 

}{
}			




	
	
scan.close();	
	
	}}
