package day06_Wrapper;

public class C04_IfStatements {

	public static void main(String[] args) {
		// "Eger hava guzel olursa piknige gidecegiz." Burada bir sart ve bir sonuc vard�r.
		//hava guzel degilse ne yap�lacag� �le �lglibir karar yoktur.
		//bunu bir kodlamaya cevirirsek "eger" burada bir sart cumlesinin ifadesidir.
		//"eger" sart cumlesinin geiecegini ifade ederi sart ve sonuc bar�nd�r�r.
		//Sart: Hava guzel olursa
		//sonu: Piknige gidecez

		// If(boolean sart) {sart saglan�rsa istenen kod}
		//mutlaka boolean kullan�l�r ve sart olur. ve suslu parantezle cal�sacak kodlar i�in curly braccesses kullanacaz.
		// Ornek;
		
		/*int a=2;
		int b=3;
		
		if (a>b) {System.out.println(a+b);}  // a>b dogru olmad�g� i�in sonuc g�stermez ama kod cal�s�r.
		if (a==b) {System.out.println(a*b);}  // a==b dogru olmad�g� i�in gene ekranda birseyler yazmaz ancak kod cal�s�r.
					//bazen kodumuz cal�s�r ancak ekranda birsey gormeyiz.
		
		// if yaz�p ctrl space e basarsak syso daki gibi olusturur. if (condition) {				}	*/
		
		int a=10;
		int b=20;
		
		if (a>5)  {System.out.println("a say�s� besden buyuktur");	} //a 5 den buyuk oldugu i�in kod cal�s�r ve asag� yazd�r�r.
		if (a>b) {System.out.println("a say�s� b den buyuktur"); }// if yanl�� oldugu i�in kod cal�s�r ancak asag�da g�sterilmez.
		
		//basit if cumleleri bag�ms�z cal�s�r. Herbir if cumlesi kendi sart�na bakar, sonuc true ise console cal�s�r.
		// sart false ise kod cal�s�r ancak consolda gozukmez. 
		//TUM �F'LER�N BODY S� CALISAB�L�R, BAZILARI CALISAB�L�R, HATTA H�CB�R�N�N BODY S� CALISMAYAB�L�R.
		

	}

}