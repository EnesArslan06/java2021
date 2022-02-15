package day29_staticBlock_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		//main methoddan diger methodlara veya diger methodlardan main methoda bir variable gonderirseniz
		// Java orjinal variable' lari degil onlarin degerlerini (value ) g�turur.
		//Orjinal variable'nin  degeri degismez.
		
int fiyat=100;
		
		
		indirimYap25(fiyat);
		System.out.println(indirimYap25(fiyat));//75 yazdirdi.Ancak maindeki ana deger yine 100.
		//buraya bir atama yapmadik. fiyat degerine bir atama yapmadik
		
	
System.out.println("Methoddan sonra Main Methoddaki fiyat: " + fiyat);//100 yazd� indirimli methodda 75 yazd�rd�.
fiyat=indirimYap10(fiyat);   //burada atama yapt�k fiyata dolayisi ile indirimi kalici olarak yapmis olduk.
		
		
System.out.println("Methoddan sonra Main Methoddaki fiyat: " + fiyat);//90 yazd�rd�	
//burada olusturdugumuz scapolar yani methodlardaki fiyatlari degistirdi. Ana fiyattaki 100 olan degere dokunmaz
//scope fiyattir methoddakiler.

	}

	private static int indirimYap25(int fiyat) {
		fiyat*=0.75;//burada yazd�rmay�p bize dondurmesini istiyoruz methodun ancak yukarida yazd�rmamiz laz�m.
		
		return fiyat;		
		
	}

	private static int indirimYap10(int fiyat) {
		fiyat*=0.90;
		
		return fiyat;
	}

}
