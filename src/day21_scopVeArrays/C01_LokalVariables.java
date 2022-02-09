package day21_scopVeArrays;

public class C01_LokalVariables {
String okulIsmi;//class levelda olusturdugumuz variableleri asag�daki metodlaarda kullanabiliriz.

	public static void main(String[] args) {
		//herhangi bir method icerisinde olusturulan variablelerdir.
		//sadece icinde olusturuldugu methodda gecerlidir. 
		//baska methodlarda kullan�lacak variableleri local olusturmak yerine
		//class level'da olusturmak gerekir.
		//Local variabllalara java deger atamaz.							

	
	@SuppressWarnings("unused")
	int sayi; //int sayi=0; dersek kabul eder itiraz etmez
	//System.out.println(sayi);//dedigimizde local variable deger atamas� yap�lmam�s kullan�lamaz diyor
	
	//int sayi; //bir localde ayn� isimde birden fazla variable olusturulamaz.
	//String sayi;//bu sekildede izin vermez. bir isimden bir localde sadece bir tane olabilir. Data turu farkl� olsada java buna izin vermez.
	@SuppressWarnings("unused")
	String isim="Ali";
	
	
	}	
	
	public static void staticMethod() {
		//sayi; //dedigimizde local veriableleri sadece o methodun icinde cal�s�r. Baska methodda cal�smaz
		//iki metodda static olsa durum fark etmez cal�smaz.
	@SuppressWarnings("unused")
	String isim="Veli";//yukar�daki variabledede isim ad�nda bir variable var. ancak yerleri farkl� lokalleri farkl� oldugu icin kullan�labilir.
	//sadece isim="veli" deseydik kabul etmezdi.
	
	}
	
	
	

}
