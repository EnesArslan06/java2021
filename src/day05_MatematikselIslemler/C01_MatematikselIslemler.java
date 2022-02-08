package day05_MatematikselIslemler;

public class C01_MatematikselIslemler {

	public static void main(String[] args) {
		/*
		  Temel matematik bilgileri
		  1. iþlem ustel iþlem ve parantez içi
		  2. carpma bolme
		  3. toplama cýkarma
		  
		  8*4/2 iþlemi önce soldan saga gider.
		  öncekþlleri ayný ise soldan saða gider
		  7-5+1= once 7-5 sonra 2+1 olur.
		  
		  38/2*(4+3)*2= 266 sonuc
		  önce parantez içi spnra soldan saga
			
		  8+2(14-6/2)-12= 18 sonuc
		  once parantez onun icindede once bolme
		  parantez bittikten sonra carpma 
		  
		  
		 */
		System.out.println(4*(2+5)/2); //sonuc 14
		System.out.println(4*(2+5)/3); //kusuratlý islemlerde sayýlar ýnt oldugu için kabul etmez
											//sonucu 9.333 olmasýna ragmen 9 olarak gösterir
		//sonucu virgullu yazdýrmak için;
		
		double sonuc=4*(2+5)/3;
		
		System.out.println(sonuc); //9.0 oldu gene göstermedi.
					//nedeni; esittirden sonraki kýsým degerdir. sonucta java once degeri bulur sonra 
		//double olarak atama yapar. Yani temelde java 9 sonucunu bulup double atadý.
		//nasýl yapýlacagý;
		
		sonuc=(double)(4*(2+5)/3);
		System.out.println(sonuc); //yine olmadý 9.0 verdi.
		
		sonuc=(double)4*(2+5)/3; //bu sekilde oldu.yani sadece 4 sayýsýný double yaptýk.
								//bir sayý double olursa digeri int de olsa sonuc double olarak cýkacaktýr.
		
		System.out.println(sonuc);//sonuc 9.33333333
		
		int sayi1=5;
		int sayi2=2;
		double sayi3=2;
		
		System.out.println(sayi1/sayi2);  //sonuc 2 iki sayý int
		System.out.println(sayi1/sayi3);// sonuc 2.5 nedeni sayýlardan biri int biri double
		System.out.println(sayi1+sayi3/sayi2); //sonuc 6.0 sayilardan biri double oldugu için 6.0 verir.
		
		//virgul yani ondalýk kýsmý onemli ise sayýlardan biri double olmalýdýr.

	}

}
