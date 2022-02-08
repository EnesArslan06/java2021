package day11_StringManipulationMethods;

public class C03_StringManipulationLength {

	public static void main(String[] args) {
		// length () Verilen Stringdeki karakter say�s�n� doldurur.Son harf�n indeksi nedir
		//index nedir diye soruldugu zaman lengty()-1. Cunku karakter 0 dan baslar lengty al�r�z 1 c�kart�r�z.
		//karakterin uzunluguna bakar. Mustafa index 6 iken uzunlugu 7 dir.
		//mesela enes isminin uzunlugu 4 ama son harfin index i 4-1=3 tur.  Cok kullan�l�r.
		//index e g�re derse 0 dan baslan�r uzunluk derse 1 den baslar.
		
		String isim="Ali Can";
		System.out.println(isim.length()); // sonuc 7 olur bosluguda katar oda karakter olarak ekler
	
		String isim2="";//burada uzunluk 0 verir. Bir deger atanm�s ama hi� degeri "" bu deger 
		String isim3=null; //burada hicbir deger atanmad�g� belirtilmi�. syso ile cal�st�rd�g�m�zda null yazar
		//olusturmussun null atam�ss�n ama deger yok der.

	System.out.println(isim2.length()); //sonuc S�f�r. null uzunlugu olmaz. cok k�yaslanmas� istenir. sorularda falan
	// bir degere hiclik atamak ile hi� deger atanmam�s oldugunun bilgisini veriyor.
	

	String str1="Ali Kahyaoglu";
	System.out.println(str1.length()); //u yazd�r�r. bu lengty en son harfi bulmada kullan�l�r.
	//Son harfi ogrenmek icin charla beraber kullan�r�z.
	
	System.out.println(str1.charAt(str1.length()-1)); // bununla isim ne olursa olsun son harfini buluruz.
	//cunku charAt atad�k son karakteride lengty ile bulduk. onuda yazd�rd�k
	String str3=null ;
	String str4;
	System.out.println(str3); //null yazd�rd� ancak bunu bil diye yazd�r�yorum diyor bunun fark�na cvar uzunlugunu falan alamazs�n diyor.
	//System.out.println(str3.length());//burada hata verir. deger olmad�g� i�in uzunlugunu hesaplamaz hata verir.
	//System.out.println(str4); //burada str4 un alt�n� cizer cunku sen bu veriableyi olusturmus 
	//ama deger atamam�ss�n b�yle kullanamazs�n der.hata verir.
	//bir String i yazd�rd�g�m�zda null c�k�yorsa bize" ben bu degis�keni olusturdum ancak deger atamad�m "
	//demek istiyordur.
	String isim1="Enes Omer Furkan";
	System.out.println(isim1.length()-5);
	}}
