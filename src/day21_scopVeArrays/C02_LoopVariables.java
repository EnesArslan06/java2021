package day21_scopVeArrays;

public class C02_LoopVariables {

	public static void main(String[] args) {
		// localin de locali olarak bilinir.

		int sayi=10;
		
		for (int i = 0; i < 5; i++) {
		String isim="Ali";
		
	System.out.println(sayi); //6 kere 10 yazd�r�r. Cunku i ile ilgili hicbir islem yapmad�k sadece 6 kez cal�st�.
	System.out.println(sayi+" "+ isim);	//burada 10 bosluk ali yazd�racak.
	//cunku loopun icinde olusturdugum variableyi loopun d�s�nda kullanamay�z.
	//yani metodun icinde bile olsa kullan�lamaz sadece loopun icinde olusturulmus variableler.
	//main methodun icerisinde kullanacag�m�z veriableleri loopun icinde degil methodun icinde olusturmam�z laz�m.
	}		
		
	//System.out.println(isim);	//k�rm�z� hata verdi. cunku loopun icinde olusturdugum variableyi loopun d�s�nda kullanamay�z.
	//System.out.println(i); //k�rm�z� hata verdi. loop icinde olusturulan variableler loop d�s�nda kullan�lamazlar.
	//degeri loopdan once olusturur ve emniyette kalmak icin initialize yapariz.	
	
	for (int i = 0; i < args.length; i++) {
		
		//int sayi; // burada da hata verdi. cunku main methodda olusturdugumuz variable looplar�n icinde gecerli oldugu icin 
					//ayni isimle varible olusturulamaz. main kapsar loopu ancak loop kapsamaz methodu
	String isim="Ali";//yukar�da String isim var ancak burada da var kabul ediyor. Cunku yukar�dakinde for lopp icinde 
	//var bu da baska bir forloop o onun variablesi bu bu forloopun variablesi. Bu baska scop o baska scop
	}
	}	
		
	

}
