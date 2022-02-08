package day04_IncrementDecrement;

public class C03_IncrementDecrement {

	public static void main(String[] args) {
		// int numA=2; numA=numA+3 dersek acemi oluruz.
		// numA+=3 numA yý 3 artýr demek olur.
		
		//bunun adý incrementtir.
		
		//azaltmada Decrementtir.
		// int numA=2;   numA=numA-3 demeyiz  numA-=3 deriz bu sayýdan azaltma anlamýna gelir.
		// numA--=  dersekde 1 eksiltir ayný sekilde artý yazarsak 1 artýrýr.
	
	int sayi1=10;
	System.out.println(sayi1+=5); //15 olur sonuc. sayý1+=5 dedigimizde sayýyý yaný sayý 1 in degerinide 
								//kalýcý olarak 15 olarak degistirir, arada esittir kullandýgýmýz icin.
	
	System.out.println(sayi1+12); //  Sonuc 27. bu sekilde yazdýrýrsak sayi 1 in uzerine 12 ekler atama yapmaz 
									// sadece islem yapar deger degistirmez.
	
	sayi1++;
	System.out.println(sayi1++); //sonuc 16 olur ve kalýcý olarak ++ artýrmada sayýnýn degerini kalýcý olarak artýrýr.
							// esittir gibi.
		
		System.out.println(sayi1);
		

	}

}
