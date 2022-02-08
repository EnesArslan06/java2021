package day14_MethodOlusturma;

public class C02_MethodOlusturma {

	public static void main(String[] args) {
		// verilen iki sayýnýn toplamýný ve carpýmýný yapýp yazdýran iki ayrý
		//method olusturun.
		/*method olusturmak için 4 adým takip edelim.
		1. adým: Methodcall yazalým
		toplama(); bu bir method call dur.
		2. adým: Methoda arguman yazacakmýyýz karar vermeliyiz
		int sayi1=4;  int sayi2=5; bunlarda bizim argumanlarýmýz. 
		toplama iþlemine uygun olarak bir arguman belirledik
		3 adým: 1. ve 2. adýmý yaptýktan sonra java'dan yardým alýp methodu olustururuz
		4. adým: erisim duzenleyici ve return type karar vermemiz lazým.
		axcess modifier belirleyecez public, bu methodu kimin kullanacagýna karar verme asamasý
		return type:soruda bizden sadece yazdýrma istedigi için void olarak kalabilir. 
		
		*/
int sayi1=5;
int sayi2=8;
toplama(sayi1,sayi2); //busekilde yazdýgýmýzda java altýný kýrmýzý cizerek bize method olustur der bende olusturabilir der.
bolme(sayi1,sayi2);	
carpma(sayi1,sayi2);	
cikarma(sayi1,sayi2);	
	}

	private static void cikarma(int sayi1, int sayi2) {
		System.out.println("Sayilarýn Farký: " + (sayi1-sayi2));
		
	}

	public static void bolme(int sayi1, int sayi2) {
		// TODO Auto-generated method stub
		System.out.println("Sayýlarýn bolumu: " + sayi1/sayi2);
	}

	public static void carpma(int sayi1, int sayi2) {
		// TODO Auto-generated method stub
		
    System.out.println("Sayilarýn carpýmý: " + sayi1*sayi2);
	}


	public static void toplama(int sayi1, int sayi2) {
		// TODO Auto-generated method stub
	System.out.println("sayilarýn toplamý: "  +(sayi1 + sayi2));	
	
	}	//burada methodun hangi sýrada oldugunun bir onemi yoktur. Yukarýda yazmýs oldugumuz
		//yani main method içerisinde olusturdugumuz toplama falan onlarýn sýrasý önemlidir.

		
		
		
		
		
		
}
