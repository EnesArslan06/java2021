package day04_IncrementDecrement;

public class C04_PreincrementPostincrement {

	public static void main(String[] args) {
		
		//preIncrement ve Post Incremen sadece sayi+++ veya sayi-- yazýmýnda gecerlidir.
		
		int sayi=10;
		sayi++;
		sayi++;
		sayi++;
		
		System.out.println(sayi++); //13 sonucunu alýrýz. ilk uc islem sayýyý artýr
								//4. islem yazdýrma islemidir.
		
		System.out.println(sayi++); // bu islemin degeri 13 dur. Ancak sayýnýn bundan sonraki degerleri 14 dur.
									//cunku once yazdýrdýk sonra artýrdýk.
		
		//once artýrmak sonra yazdýrmak isterseniz ++sayi yazdýrmalýyýz.
		//once yazdýrmak sonra artýrmak isterseniz sayi++ yazýlmasý lazým.
		
		System.out.println(++sayi); //sonuc 15 olur. nedeni ise sayýnýn degeri 14 olmustu zaten.
									//once artý koydugumuz için sayýyý artýrýp sonra yazdýrýr.
		
		
		
	}

}
