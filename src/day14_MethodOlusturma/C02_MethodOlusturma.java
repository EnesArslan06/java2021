package day14_MethodOlusturma;

public class C02_MethodOlusturma {

	public static void main(String[] args) {
		// verilen iki say�n�n toplam�n� ve carp�m�n� yap�p yazd�ran iki ayr�
		//method olusturun.
		/*method olusturmak i�in 4 ad�m takip edelim.
		1. ad�m: Methodcall yazal�m
		toplama(); bu bir method call dur.
		2. ad�m: Methoda arguman yazacakm�y�z karar vermeliyiz
		int sayi1=4;  int sayi2=5; bunlarda bizim argumanlar�m�z. 
		toplama i�lemine uygun olarak bir arguman belirledik
		3 ad�m: 1. ve 2. ad�m� yapt�ktan sonra java'dan yard�m al�p methodu olustururuz
		4. ad�m: erisim duzenleyici ve return type karar vermemiz laz�m.
		axcess modifier belirleyecez public, bu methodu kimin kullanacag�na karar verme asamas�
		return type:soruda bizden sadece yazd�rma istedigi i�in void olarak kalabilir. 
		
		*/
int sayi1=5;
int sayi2=8;
toplama(sayi1,sayi2); //busekilde yazd�g�m�zda java alt�n� k�rm�z� cizerek bize method olustur der bende olusturabilir der.
bolme(sayi1,sayi2);	
carpma(sayi1,sayi2);	
cikarma(sayi1,sayi2);	
	}

	private static void cikarma(int sayi1, int sayi2) {
		System.out.println("Sayilar�n Fark�: " + (sayi1-sayi2));
		
	}

	public static void bolme(int sayi1, int sayi2) {
		// TODO Auto-generated method stub
		System.out.println("Say�lar�n bolumu: " + sayi1/sayi2);
	}

	public static void carpma(int sayi1, int sayi2) {
		// TODO Auto-generated method stub
		
    System.out.println("Sayilar�n carp�m�: " + sayi1*sayi2);
	}


	public static void toplama(int sayi1, int sayi2) {
		// TODO Auto-generated method stub
	System.out.println("sayilar�n toplam�: "  +(sayi1 + sayi2));	
	
	}	//burada methodun hangi s�rada oldugunun bir onemi yoktur. Yukar�da yazm�s oldugumuz
		//yani main method i�erisinde olusturdugumuz toplama falan onlar�n s�ras� �nemlidir.

		
		
		
		
		
		
}
