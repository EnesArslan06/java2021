package day03_Scanner;

public class C02_SwapVariables {

	public static void main(String[] args) {
		
		//baslang�cta sayi1=10 ve sayi2=10
		
		/*int sayi1=10;
		int sayi2=20;
		
		System.out.println("baslang�cta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
		
		int bos;      //1. ad�m  bo� kova
		// 2. ad�m say� 2 yi bos variableya atamak laz�m
		bos=sayi2;
		//3. ad�m sayi2 kovas�na (bo� kald�g� i�in) sayi 1 de�erini at�yorum
		sayi2=sayi1;
		//bo� veriabledeki de�eri say� 1 e atayal�m
		sayi1=bos;
		
		System.out.println("sonucta sayi1=" + sayi1 + " ve sayi2=" + sayi2); */
		
		
		/*
		 interview sorusu
		 degisken olmadan say�lar�n de�erlerini degistirme?
		
		 sayi1=10		say�1=20
		 sayi2=20		say�2=10
		 
		 2 adet kovam�z var biri kum biri su dolu. 3 ad�mda kova ile su kovas�n�n yerlerini de�i�tirmek.
		 1. ad�m bos bir kova laz�m
		 
		 */
		
		//baslang�cta sayi1=20	sayi2=30
		
		int sayi1=20;
		int sayi2=30;
		
		System.out.println("Baslangicta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
		
		int bos;
		bos=sayi2;
		sayi2=sayi1;
		sayi1=bos;
		
		System.out.println("sonucta sayi1=" + sayi1 + " ve sayi2= " + sayi2);
				
		
		int sayi3=45;
		int sayi4;
		sayi4=90;
		
		System.out.println("baslang�cta sayi3: "+ sayi3 + " ve sayi4: " +sayi4);
		
		int bos2;
		bos2=sayi4;
		sayi4=sayi3;
		sayi3=bos2;
		
		System.out.println("Sonucta sayi3=" +sayi3+ " ve sayi4=" + sayi4);
	}

}
