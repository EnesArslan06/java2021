package day15_MethodCreation;

public class C03_MethodOverLoading {

	public static void main(String[] args) {
		/*Javada ayný isimde birden fazla method olur mu? Evet olur.
		//Ayný isimde birden fazla method olursa java hangisini calýstýracagýna nasýl karar verir?
		//3 tane basýi method olusturalým.
	//Java isim ayný olan methodlarda oncelikle parametre sayýsýna bakar 
		//sonrada parametre sayýsý ile arguman sayýsý esit olanlardan arguman data turleri ile parametre data
		turleri arasýndaki uyuma bakarak calýsýr. tamamen uyusan varsa onu kullanýr.
		Taamamen uyusan yoksa kapsayan var mý onu kullanýr. býrden fazla secenek oldugunda 
		java en optimum olaný tercih eder. */
	
		
	topla(2,4);// bu sekilde yazdýgýmýzda 2 tane argument oldugu icin 2 parametreli olan methoda gider toplar.
	topla(4,5,6);//dedigimizde 3 parametreli olaný gider calýstýrýr. 4 de olsa gidip onu calýstýracaktý.
	

	}

	private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
		System.out.println("Dort sayinin Toplamý: " + (sayi1+sayi2+sayi3+sayi4));
		
	}

	private static void topla(int sayi1, int sayi2, int sayi3) {
		System.out.println("Uc sayinin Toplamý: " + (sayi1+sayi2+sayi3));
		
	}

	private static void topla(int sayi1, int sayi2) {
		System.out.println("Ýki sayinin Toplamý: " + (sayi1+sayi2));
		
	}

	private static void topla(double sayi1, int sayi2, int sayi3, int sayi4) {
		System.out.println("Dort sayinin Toplamý: " + (sayi1+sayi2+sayi3+sayi4));}
	//4 parametre olan yularýdaki ile ayný oldugu için itiraz eder, ancak bir tanesini double yaparsak 
	//yani birinin farklý oldugunu gösterirsek itiraz etmeden tekrar kabul eder.
	//yukarýda topla isminde olan bircok method var.

}



/*bir isme birden fazla method yuklemeye overloading denir. "asýrý yukleme"
Java ayni isim ve ayni parametrelerle birden fazla method
olusturulmasina izin vermez. Ayni isimle birden fazla method olusturmak isterseniz
method signature (metot imzasi’nin) degistirilmesi gerekir
method ismi
parametre sayýsý
parametrelerin sýralanýsý... bu ucu methodun imzasýdýr. ucunden biri farklý olursa over loading olur. Java kabul eder.
ismi degistirirsek overloading olmaz bunun için parametreleri yada parametre sýralamasýný degiþtirmek gerekir.
*/