package day18_NestedForLoop_whileLoop;

public class C05_WhileLoop {

	public static void main(String[] args) {
		// Soru 2 )
		//For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90�na tam
		//bolunebilen sayilari yazdirin.

		for (int i = 100; i < 1000; i++) { //3 basamakl� oldugu icin 100 ve 1000 aras� sayilar.
			if (i%15==0 && i%20==0 && i%90==0) {
				System.out.println(i);}
			 }  // buras� for loop ile yap�lacak k�s�m
		
		int sayi=100;//bu 100 baslang�c degeri
		
		while (sayi<1000) {
			if (sayi%15==0 && sayi%20==0 && sayi%90==0) {
				System.out.print(sayi); }
		sayi++; //bunu yapmaz isek sayi sonsuza kadar art�rarak cal�s�r.
			}
		
		//eger baslang�c ve bitis sarti bir say�n�n art�s�na bagli ise veya tekrar edilecek islem adedi belli ise,
		//for loop tercih edilir.
		
			

}}
