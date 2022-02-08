package day04_IncrementDecrement;

public class C04_PreincrementPostincrement {

	public static void main(String[] args) {
		
		//preIncrement ve Post Incremen sadece sayi+++ veya sayi-- yaz�m�nda gecerlidir.
		
		int sayi=10;
		sayi++;
		sayi++;
		sayi++;
		
		System.out.println(sayi++); //13 sonucunu al�r�z. ilk uc islem say�y� art�r
								//4. islem yazd�rma islemidir.
		
		System.out.println(sayi++); // bu islemin degeri 13 dur. Ancak say�n�n bundan sonraki degerleri 14 dur.
									//cunku once yazd�rd�k sonra art�rd�k.
		
		//once art�rmak sonra yazd�rmak isterseniz ++sayi yazd�rmal�y�z.
		//once yazd�rmak sonra art�rmak isterseniz sayi++ yaz�lmas� laz�m.
		
		System.out.println(++sayi); //sonuc 15 olur. nedeni ise say�n�n degeri 14 olmustu zaten.
									//once art� koydugumuz i�in say�y� art�r�p sonra yazd�r�r.
		
		
		
	}

}
