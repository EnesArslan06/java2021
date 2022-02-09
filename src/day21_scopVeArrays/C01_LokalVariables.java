package day21_scopVeArrays;

public class C01_LokalVariables {
String okulIsmi;//class levelda olusturdugumuz variableleri asagýdaki metodlaarda kullanabiliriz.

	public static void main(String[] args) {
		//herhangi bir method icerisinde olusturulan variablelerdir.
		//sadece icinde olusturuldugu methodda gecerlidir. 
		//baska methodlarda kullanýlacak variableleri local olusturmak yerine
		//class level'da olusturmak gerekir.
		//Local variabllalara java deger atamaz.							

	
	@SuppressWarnings("unused")
	int sayi; //int sayi=0; dersek kabul eder itiraz etmez
	//System.out.println(sayi);//dedigimizde local variable deger atamasý yapýlmamýs kullanýlamaz diyor
	
	//int sayi; //bir localde ayný isimde birden fazla variable olusturulamaz.
	//String sayi;//bu sekildede izin vermez. bir isimden bir localde sadece bir tane olabilir. Data turu farklý olsada java buna izin vermez.
	@SuppressWarnings("unused")
	String isim="Ali";
	
	
	}	
	
	public static void staticMethod() {
		//sayi; //dedigimizde local veriableleri sadece o methodun icinde calýsýr. Baska methodda calýsmaz
		//iki metodda static olsa durum fark etmez calýsmaz.
	@SuppressWarnings("unused")
	String isim="Veli";//yukarýdaki variabledede isim adýnda bir variable var. ancak yerleri farklý lokalleri farklý oldugu icin kullanýlabilir.
	//sadece isim="veli" deseydik kabul etmezdi.
	
	}
	
	
	

}
