package day01_02_Varianles;

public class day1_odevim {

	public static void main(String[] args) {
		String ogrenciAdi="Enes";
		System.out.println(ogrenciAdi); //Enes sonucunu aliyoruz
		
		
		String ogrenciSoyAdi="ARSLAN";
		System.out.println(ogrenciSoyAdi);//ARSLAN sonucunu aliyoruz
	
		boolean evliMi=true;
		System.out.println(evliMi);//true sonucu
		
		byte yasi;
		yasi=33;
		System.out.println(yasi); // yas sonucu burada 33 cikmaktadir		
		
		char cocukSayisi='1';
		System.out.println(cocukSayisi);  // 1 sonucunu alýyoruz
		
		
		String liseOkulAdi="Nevsehir Lisesi";
		System.out.println("Okul Adi: " + liseOkulAdi);//Okul Adi: Nevsehir Lisesi
		
		short okulunOgrenciSayisi=2475;
		System.out.println(okulunOgrenciSayisi);
		
		int nevsehirNufusu=85000;
		System.out.println(nevsehirNufusu);
		
		System.out.println(nevsehirNufusu+okulunOgrenciSayisi); //87475 sonucunu alýyoruz
		
		int sayi1=42;
		byte sayi2=58;
		double sayi3=12.998;
		char sayi4='2';
		char harf1='E';
		String harf2="A";
		
		System.out.println(sayi1+sayi2); //100 sonucunu almaktayýz.
		
		System.out.println(harf2+(sayi1+sayi2)); //A100 sonucunu almaktayýz.
		
		System.out.println(sayi1+harf2+sayi2);  //42A58 sonucu cikar
		
		System.out.println(sayi2+sayi3);// 70.999 sonucu cikmaktadýr.
		
		System.out.println(sayi1+harf1); // sayi 1 ile harf1 i topladigimda 111 sonucu aliyoruz
										//charin bir degeri vardýr. o degeri verir iþlemlerde.
				
		System.out.println(sayi4+sayi2); //sayi4 un degeri 2 sayi2 nin degeri 58 ancak toplamý 108		
		
		System.out.println(sayi2-sayi1-sayi3);	//3.0020000000007 sonucu cikmaktadýr.	
		
		System.out.println(harf1+harf2);	//EA sonucu cikar

	}

}
