package day04_IncrementDecrement;

public class C03_IncrementDecrement {

	public static void main(String[] args) {
		// int numA=2; numA=numA+3 dersek acemi oluruz.
		// numA+=3 numA y� 3 art�r demek olur.
		
		//bunun ad� incrementtir.
		
		//azaltmada Decrementtir.
		// int numA=2;   numA=numA-3 demeyiz  numA-=3 deriz bu say�dan azaltma anlam�na gelir.
		// numA--=  dersekde 1 eksiltir ayn� sekilde art� yazarsak 1 art�r�r.
	
	int sayi1=10;
	System.out.println(sayi1+=5); //15 olur sonuc. say�1+=5 dedigimizde say�y� yan� say� 1 in degerinide 
								//kal�c� olarak 15 olarak degistirir, arada esittir kulland�g�m�z icin.
	
	System.out.println(sayi1+12); //  Sonuc 27. bu sekilde yazd�r�rsak sayi 1 in uzerine 12 ekler atama yapmaz 
									// sadece islem yapar deger degistirmez.
	
	sayi1++;
	System.out.println(sayi1++); //sonuc 16 olur ve kal�c� olarak ++ art�rmada say�n�n degerini kal�c� olarak art�r�r.
							// esittir gibi.
		
		System.out.println(sayi1);
		

	}

}
