package day05_MatematikselIslemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
		/* slayt 59 da geciyor konu
		 int a=15/4; i�leminde kalan� bulmak istersek javada modulus i�lemi kullan�l�r
		
		 */
		//int a=15%4; //dedigimizde kalan� elde ederiz modulus i�lemi yapmam�z laz�m.
		
		//kullan�c�dan 3 basamakl� bir say� al�p rakamlar toplam�n� yazd�ran bir program yaz�n?
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 3 basamakl� bir say� giriniz:");
		
		int sayi=scan.nextInt();
		
		//sayi 573 olsun. Burada iki i�lem bizim i�in cok onemli
		
		int rakamlarToplami=0;
		
		//ilk once 573 deki 3 say�s�n� almam�z laz�m.
		 //bir say�n�n 10 ile b�l�m� birler basamag�n� verir.
		
		int rakam=sayi%10; //bana birler basamag�n� verir.
		rakamlarToplami+=rakam; //say�m�z degismedi hala 573
		
		//3 den kurtulmak istiyoruz cumku 3 ile i�im bitt.
		//say� 57 elde etmemiz la�zm
		
		sayi/=10;  //573
		System.out.println(sayi); //say�m�z 57 oldu.
		
		//simdi say�dan 57 den 7 yi alacaz.
		
		rakam=sayi%10;
		System.out.println(rakam); //sayi 7 yi bulduk simdi ilk buldugumuz 3 un ustune eklemem�z laz�m
		//bizim 3 muz rakamlar toplam� variablesinde.
		
		rakamlarToplami+=rakam;
		System.out.println(rakamlarToplami);  //sayi 10a ulast�k 3 ve 7 nin toplam�.
		
		//say�m�z 57 ve 7 dende kurtulmam�z laz�m.
		
		sayi/=10; //say�m�z art�k 5 oldu
		
		System.out.println(sayi); //dolay�s� ile 5 i de toplarsak sonuca ula��r�z. onceden 3 u ve 7 y� toplam�st�k
		
		//elimizde sadece sayinin degeri 5 kald� kal�c� degerdi.
		rakamlarToplami+=sayi;
		System.out.println("Girdiginiz say�n�n rakamlar toplam�:" + rakamlarToplami); 
		
		//art�k say�lar toplam� ile ilgili formul olusmus oldu.
		
		//ancak say�m�z 3 basamakl� ise 3 kez 4 ise 4 kez
	   //bu i�lemi kac basamakl� say� varsa okadr tekrar etmemiz laz�m
		
		scan.close();
		
	}
	

}
