package day21_scopVeArrays;

public class C02_LoopVariables {

	public static void main(String[] args) {
		// localin de locali olarak bilinir.

		int sayi=10;
		
		for (int i = 0; i < 5; i++) {
		String isim="Ali";
		
	System.out.println(sayi); //6 kere 10 yazdırır. Cunku i ile ilgili hicbir islem yapmadık sadece 6 kez calıstı.
	System.out.println(sayi+" "+ isim);	//burada 10 bosluk ali yazdıracak.
	//cunku loopun icinde olusturdugum variableyi loopun dısında kullanamayız.
	//yani metodun icinde bile olsa kullanılamaz sadece loopun icinde olusturulmus variableler.
	//main methodun icerisinde kullanacagımız veriableleri loopun icinde degil methodun icinde olusturmamız lazım.
	}		
		
	//System.out.println(isim);	//kırmızı hata verdi. cunku loopun icinde olusturdugum variableyi loopun dısında kullanamayız.
	//System.out.println(i); //kırmızı hata verdi. loop icinde olusturulan variableler loop dısında kullanılamazlar.
	//degeri loopdan once olusturur ve emniyette kalmak icin initialize yapariz.	
	
	for (int i = 0; i < args.length; i++) {
		
		//int sayi; // burada da hata verdi. cunku main methodda olusturdugumuz variable loopların icinde gecerli oldugu icin 
					//ayni isimle varible olusturulamaz. main kapsar loopu ancak loop kapsamaz methodu
	String isim="Ali";//yukarıda String isim var ancak burada da var kabul ediyor. Cunku yukarıdakinde for lopp icinde 
	//var bu da baska bir forloop o onun variablesi bu bu forloopun variablesi. Bu baska scop o baska scop
	}
	}	
		
	

}
