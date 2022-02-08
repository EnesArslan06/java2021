package day06_Wrapper;

public class C04_IfStatements {

	public static void main(String[] args) {
		// "Eger hava guzel olursa piknige gidecegiz." Burada bir sart ve bir sonuc vardýr.
		//hava guzel degilse ne yapýlacagý ýle ýlglibir karar yoktur.
		//bunu bir kodlamaya cevirirsek "eger" burada bir sart cumlesinin ifadesidir.
		//"eger" sart cumlesinin geiecegini ifade ederi sart ve sonuc barýndýrýr.
		//Sart: Hava guzel olursa
		//sonu: Piknige gidecez

		// If(boolean sart) {sart saglanýrsa istenen kod}
		//mutlaka boolean kullanýlýr ve sart olur. ve suslu parantezle calýsacak kodlar için curly braccesses kullanacaz.
		// Ornek;
		
		/*int a=2;
		int b=3;
		
		if (a>b) {System.out.println(a+b);}  // a>b dogru olmadýgý için sonuc göstermez ama kod calýsýr.
		if (a==b) {System.out.println(a*b);}  // a==b dogru olmadýgý için gene ekranda birseyler yazmaz ancak kod calýsýr.
					//bazen kodumuz calýsýr ancak ekranda birsey gormeyiz.
		
		// if yazýp ctrl space e basarsak syso daki gibi olusturur. if (condition) {				}	*/
		
		int a=10;
		int b=20;
		
		if (a>5)  {System.out.println("a sayýsý besden buyuktur");	} //a 5 den buyuk oldugu için kod calýsýr ve asagý yazdýrýr.
		if (a>b) {System.out.println("a sayýsý b den buyuktur"); }// if yanlýþ oldugu için kod calýsýr ancak asagýda gösterilmez.
		
		//basit if cumleleri bagýmsýz calýsýr. Herbir if cumlesi kendi sartýna bakar, sonuc true ise console calýsýr.
		// sart false ise kod calýsýr ancak consolda gozukmez. 
		//TUM ÝF'LERÝN BODY SÝ CALISABÝLÝR, BAZILARI CALISABÝLÝR, HATTA HÝCBÝRÝNÝN BODY SÝ CALISMAYABÝLÝR.
		

	}

}