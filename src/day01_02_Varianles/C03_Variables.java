package day01_02_Varianles;

public class C03_Variables {

	public static void main(String[] args) {
		int sayi1= 10;
		int sayi2= 20;
		
		String sayi3="10";
		String sayi4="20";
		
		System.out.println(sayi1+sayi2);  //30 cevabýný verir 
		System.out.println(sayi3+sayi4);  //1020 olarak yazacak çünkü yukarda týrnak iþareti ile yazýlmýþ ve onu kelime olarak görüyor.	
	 
		// farklý data türleri ayný deðeri alabilir.
		// burada onemli olan bu degiskenleri turune göre islem yapabilecegimdir
		String harf1="A";
		char harf2= 'A';
		
		
		//yukarýdaki degiskenleri kullanarak 30A yazdýrýn.
		
		System.out.println(sayi1+sayi2+harf1); //30A yazdýrdý.
		System.out.println(sayi1+sayi2+harf2); //95  yazdýrdý. öyle olmasýnýn nedeni harf 2 char ile alakalý char bazen matematiksel islemler yapabilmektedir.
		
		System.out.println(harf1+sayi1+sayi2);  // A1020 olur.Toplanan ifadelerden biri stringse hepsini yan yana yazar. 
												//harf1 stringdir yani A, sayý 1 de 10 dur ve A10 olur sayý 2 de 20 olduguna göre A1020 sonucu çýkar.
		System.out.println(sayi1+harf1+sayi2);  //10A20 olur.
		
		System.out.println(harf1+(sayi1+sayi2)); //A30 sonucu alýnýr. Önce parantez içini yapar.
		
	}

}
