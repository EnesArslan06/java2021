package day05_MatematikselIslemler;

public class C01_MatematikselIslemler {

	public static void main(String[] args) {
		/*
		  Temel matematik bilgileri
		  1. i�lem ustel i�lem ve parantez i�i
		  2. carpma bolme
		  3. toplama c�karma
		  
		  8*4/2 i�lemi �nce soldan saga gider.
		  �ncek�lleri ayn� ise soldan sa�a gider
		  7-5+1= once 7-5 sonra 2+1 olur.
		  
		  38/2*(4+3)*2= 266 sonuc
		  �nce parantez i�i spnra soldan saga
			
		  8+2(14-6/2)-12= 18 sonuc
		  once parantez onun icindede once bolme
		  parantez bittikten sonra carpma 
		  
		  
		 */
		System.out.println(4*(2+5)/2); //sonuc 14
		System.out.println(4*(2+5)/3); //kusuratl� islemlerde say�lar �nt oldugu i�in kabul etmez
											//sonucu 9.333 olmas�na ragmen 9 olarak g�sterir
		//sonucu virgullu yazd�rmak i�in;
		
		double sonuc=4*(2+5)/3;
		
		System.out.println(sonuc); //9.0 oldu gene g�stermedi.
					//nedeni; esittirden sonraki k�s�m degerdir. sonucta java once degeri bulur sonra 
		//double olarak atama yapar. Yani temelde java 9 sonucunu bulup double atad�.
		//nas�l yap�lacag�;
		
		sonuc=(double)(4*(2+5)/3);
		System.out.println(sonuc); //yine olmad� 9.0 verdi.
		
		sonuc=(double)4*(2+5)/3; //bu sekilde oldu.yani sadece 4 say�s�n� double yapt�k.
								//bir say� double olursa digeri int de olsa sonuc double olarak c�kacakt�r.
		
		System.out.println(sonuc);//sonuc 9.33333333
		
		int sayi1=5;
		int sayi2=2;
		double sayi3=2;
		
		System.out.println(sayi1/sayi2);  //sonuc 2 iki say� int
		System.out.println(sayi1/sayi3);// sonuc 2.5 nedeni say�lardan biri int biri double
		System.out.println(sayi1+sayi3/sayi2); //sonuc 6.0 sayilardan biri double oldugu i�in 6.0 verir.
		
		//virgul yani ondal�k k�sm� onemli ise say�lardan biri double olmal�d�r.

	}

}
