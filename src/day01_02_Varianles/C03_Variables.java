package day01_02_Varianles;

public class C03_Variables {

	public static void main(String[] args) {
		int sayi1= 10;
		int sayi2= 20;
		
		String sayi3="10";
		String sayi4="20";
		
		System.out.println(sayi1+sayi2);  //30 cevab�n� verir 
		System.out.println(sayi3+sayi4);  //1020 olarak yazacak ��nk� yukarda t�rnak i�areti ile yaz�lm�� ve onu kelime olarak g�r�yor.	
	 
		// farkl� data t�rleri ayn� de�eri alabilir.
		// burada onemli olan bu degiskenleri turune g�re islem yapabilecegimdir
		String harf1="A";
		char harf2= 'A';
		
		
		//yukar�daki degiskenleri kullanarak 30A yazd�r�n.
		
		System.out.println(sayi1+sayi2+harf1); //30A yazd�rd�.
		System.out.println(sayi1+sayi2+harf2); //95  yazd�rd�. �yle olmas�n�n nedeni harf 2 char ile alakal� char bazen matematiksel islemler yapabilmektedir.
		
		System.out.println(harf1+sayi1+sayi2);  // A1020 olur.Toplanan ifadelerden biri stringse hepsini yan yana yazar. 
												//harf1 stringdir yani A, say� 1 de 10 dur ve A10 olur say� 2 de 20 olduguna g�re A1020 sonucu ��kar.
		System.out.println(sayi1+harf1+sayi2);  //10A20 olur.
		
		System.out.println(harf1+(sayi1+sayi2)); //A30 sonucu al�n�r. �nce parantez i�ini yapar.
		
	}

}
