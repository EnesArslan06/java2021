package day15_MethodCreation;

public class C03_MethodOverLoading {

	public static void main(String[] args) {
		/*Javada ayn� isimde birden fazla method olur mu? Evet olur.
		//Ayn� isimde birden fazla method olursa java hangisini cal�st�racag�na nas�l karar verir?
		//3 tane bas�i method olustural�m.
	//Java isim ayn� olan methodlarda oncelikle parametre say�s�na bakar 
		//sonrada parametre say�s� ile arguman say�s� esit olanlardan arguman data turleri ile parametre data
		turleri aras�ndaki uyuma bakarak cal�s�r. tamamen uyusan varsa onu kullan�r.
		Taamamen uyusan yoksa kapsayan var m� onu kullan�r. b�rden fazla secenek oldugunda 
		java en optimum olan� tercih eder. */
	
		
	topla(2,4);// bu sekilde yazd�g�m�zda 2 tane argument oldugu icin 2 parametreli olan methoda gider toplar.
	topla(4,5,6);//dedigimizde 3 parametreli olan� gider cal�st�r�r. 4 de olsa gidip onu cal�st�racakt�.
	

	}

	private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
		System.out.println("Dort sayinin Toplam�: " + (sayi1+sayi2+sayi3+sayi4));
		
	}

	private static void topla(int sayi1, int sayi2, int sayi3) {
		System.out.println("Uc sayinin Toplam�: " + (sayi1+sayi2+sayi3));
		
	}

	private static void topla(int sayi1, int sayi2) {
		System.out.println("�ki sayinin Toplam�: " + (sayi1+sayi2));
		
	}

	private static void topla(double sayi1, int sayi2, int sayi3, int sayi4) {
		System.out.println("Dort sayinin Toplam�: " + (sayi1+sayi2+sayi3+sayi4));}
	//4 parametre olan yular�daki ile ayn� oldugu i�in itiraz eder, ancak bir tanesini double yaparsak 
	//yani birinin farkl� oldugunu g�sterirsek itiraz etmeden tekrar kabul eder.
	//yukar�da topla isminde olan bircok method var.

}



/*bir isme birden fazla method yuklemeye overloading denir. "as�r� yukleme"
Java ayni isim ve ayni parametrelerle birden fazla method
olusturulmasina izin vermez. Ayni isimle birden fazla method olusturmak isterseniz
method signature (metot imzasi�nin) degistirilmesi gerekir
method ismi
parametre say�s�
parametrelerin s�ralan�s�... bu ucu methodun imzas�d�r. ucunden biri farkl� olursa over loading olur. Java kabul eder.
ismi degistirirsek overloading olmaz bunun i�in parametreleri yada parametre s�ralamas�n� degi�tirmek gerekir.
*/