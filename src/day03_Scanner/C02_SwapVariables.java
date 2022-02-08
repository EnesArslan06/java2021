package day03_Scanner;

public class C02_SwapVariables {

	public static void main(String[] args) {
		
		//baslangýcta sayi1=10 ve sayi2=10
		
		/*int sayi1=10;
		int sayi2=20;
		
		System.out.println("baslangýcta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
		
		int bos;      //1. adým  boþ kova
		// 2. adým sayý 2 yi bos variableya atamak lazým
		bos=sayi2;
		//3. adým sayi2 kovasýna (boþ kaldýgý için) sayi 1 deðerini atýyorum
		sayi2=sayi1;
		//boþ veriabledeki deðeri sayý 1 e atayalým
		sayi1=bos;
		
		System.out.println("sonucta sayi1=" + sayi1 + " ve sayi2=" + sayi2); */
		
		
		/*
		 interview sorusu
		 degisken olmadan sayýlarýn deðerlerini degistirme?
		
		 sayi1=10		sayý1=20
		 sayi2=20		sayý2=10
		 
		 2 adet kovamýz var biri kum biri su dolu. 3 adýmda kova ile su kovasýnýn yerlerini deðiþtirmek.
		 1. adým bos bir kova lazým
		 
		 */
		
		//baslangýcta sayi1=20	sayi2=30
		
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
		
		System.out.println("baslangýcta sayi3: "+ sayi3 + " ve sayi4: " +sayi4);
		
		int bos2;
		bos2=sayi4;
		sayi4=sayi3;
		sayi3=bos2;
		
		System.out.println("Sonucta sayi3=" +sayi3+ " ve sayi4=" + sayi4);
	}

}
