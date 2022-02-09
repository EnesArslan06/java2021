package day21_scopVeArrays;

public class C02_LoopVariables {

	public static void main(String[] args) {
		// localin de locali olarak bilinir.

		int sayi=10;
		
		for (int i = 0; i < 5; i++) {
		String isim="Ali";
		
	System.out.println(sayi); //6 kere 10 yazdýrýr. Cunku i ile ilgili hicbir islem yapmadýk sadece 6 kez calýstý.
	System.out.println(sayi+" "+ isim);	//burada 10 bosluk ali yazdýracak.
	//cunku loopun icinde olusturdugum variableyi loopun dýsýnda kullanamayýz.
	//yani metodun icinde bile olsa kullanýlamaz sadece loopun icinde olusturulmus variableler.
	//main methodun icerisinde kullanacagýmýz veriableleri loopun icinde degil methodun icinde olusturmamýz lazým.
	}		
		
	//System.out.println(isim);	//kýrmýzý hata verdi. cunku loopun icinde olusturdugum variableyi loopun dýsýnda kullanamayýz.
	//System.out.println(i); //kýrmýzý hata verdi. loop icinde olusturulan variableler loop dýsýnda kullanýlamazlar.
	//degeri loopdan once olusturur ve emniyette kalmak icin initialize yapariz.	
	
	for (int i = 0; i < args.length; i++) {
		
		//int sayi; // burada da hata verdi. cunku main methodda olusturdugumuz variable looplarýn icinde gecerli oldugu icin 
					//ayni isimle varible olusturulamaz. main kapsar loopu ancak loop kapsamaz methodu
	String isim="Ali";//yukarýda String isim var ancak burada da var kabul ediyor. Cunku yukarýdakinde for lopp icinde 
	//var bu da baska bir forloop o onun variablesi bu bu forloopun variablesi. Bu baska scop o baska scop
	}
	}	
		
	

}
