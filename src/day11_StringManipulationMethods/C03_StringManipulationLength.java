package day11_StringManipulationMethods;

public class C03_StringManipulationLength {

	public static void main(String[] args) {
		// length () Verilen Stringdeki karakter sayýsýný doldurur.Son harfýn indeksi nedir
		//index nedir diye soruldugu zaman lengty()-1. Cunku karakter 0 dan baslar lengty alýrýz 1 cýkartýrýz.
		//karakterin uzunluguna bakar. Mustafa index 6 iken uzunlugu 7 dir.
		//mesela enes isminin uzunlugu 4 ama son harfin index i 4-1=3 tur.  Cok kullanýlýr.
		//index e göre derse 0 dan baslanýr uzunluk derse 1 den baslar.
		
		String isim="Ali Can";
		System.out.println(isim.length()); // sonuc 7 olur bosluguda katar oda karakter olarak ekler
	
		String isim2="";//burada uzunluk 0 verir. Bir deger atanmýs ama hiç degeri "" bu deger 
		String isim3=null; //burada hicbir deger atanmadýgý belirtilmiþ. syso ile calýstýrdýgýmýzda null yazar
		//olusturmussun null atamýssýn ama deger yok der.

	System.out.println(isim2.length()); //sonuc Sýfýr. null uzunlugu olmaz. cok kýyaslanmasý istenir. sorularda falan
	// bir degere hiclik atamak ile hiç deger atanmamýs oldugunun bilgisini veriyor.
	

	String str1="Ali Kahyaoglu";
	System.out.println(str1.length()); //u yazdýrýr. bu lengty en son harfi bulmada kullanýlýr.
	//Son harfi ogrenmek icin charla beraber kullanýrýz.
	
	System.out.println(str1.charAt(str1.length()-1)); // bununla isim ne olursa olsun son harfini buluruz.
	//cunku charAt atadýk son karakteride lengty ile bulduk. onuda yazdýrdýk
	String str3=null ;
	String str4;
	System.out.println(str3); //null yazdýrdý ancak bunu bil diye yazdýrýyorum diyor bunun farkýna cvar uzunlugunu falan alamazsýn diyor.
	//System.out.println(str3.length());//burada hata verir. deger olmadýgý için uzunlugunu hesaplamaz hata verir.
	//System.out.println(str4); //burada str4 un altýný cizer cunku sen bu veriableyi olusturmus 
	//ama deger atamamýssýn böyle kullanamazsýn der.hata verir.
	//bir String i yazdýrdýgýmýzda null cýkýyorsa bize" ben bu degisþkeni olusturdum ancak deger atamadým "
	//demek istiyordur.
	String isim1="Enes Omer Furkan";
	System.out.println(isim1.length()-5);
	}}
