package day07_If;

import java.util.Scanner;

public class C03_BasitIfCumleleri {

	public static void main(String[] args) {
		/*
        * Soru 3) Kullanicidan gun ismini alin ve 
        * haftaici veya hafta sonu oldugunu yazdirin 
           Ornek:      gun=Pazar output = �Hafta sonu�
                       gun=Sali output = �Hafta ici�
        *** String icin equals method�unu kullanin
        */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir gun ismi belirtiniz");
		
		String gunismi=scan.next().toLowerCase(); //hepsini kucuk harfe cevirdik, kullan�c� buyuk yada kucuk harfede yazsa farketmez
		
		if (gunismi.equals("pazar") || gunismi.equals("cumartesi")) {System.out.println("Hafta Sonu"); }
				
		//sonuc vermedi program cunku String patametiksel bir ifade 
		// olmad�g� i�in dogru cevab� vermez, yani non primitividir == kullan�lamaz.
		//equals methodu kullanmam�z laz�m. String gunismi=scan.next().toLowerCase(); burada
		//gunismi olan yerin sonuna . koyup c�kan methodlardan equals� seciyoruz. if parantezx

		if (gunismi.equals("pazartesi") || gunismi.equals("sali") || gunismi.equals("carsamba") || gunismi.equals("cuma") || gunismi.equals("persembe"))
		{	System.out.println("Hafta ici");}

		scan.close();
	}
}


