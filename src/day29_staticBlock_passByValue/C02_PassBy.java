package day29_staticBlock_passByValue;

public class C02_PassBy {

	public static void main(String[] args) {
		//biz 100 tlye satilan bir urun icin 2 farkli indirim uygulayan 2 method olusturalim
		
		int fiyat=100;
		
		
		indirimYap25(fiyat);//75 yazdirdi.
System.out.println("Methoddan sonra Main Methoddaki fiyat: " + fiyat);//100 yazdý indirimli methodda 75 yazdýrdý.
		indirimYap10(fiyat);   //bu methodda 90 yazdýrdý
System.out.println("Methoddan sonra Main Methoddaki fiyat: " + fiyat);//100 yazdýrdý	
//burada olusturdugumuz scopolar yani methodlardaki fiyatlari degistirdi. Ana fiyattaki 100 olan degere dokunmaz
//scope fiyattir methoddakiler.

	}

	private static void indirimYap25(int fiyat) {
		fiyat*=0.75;
		System.out.println("%25 indirimli fiyat: "+ fiyat);		
		
	}

	private static void indirimYap10(int fiyat) {
		fiyat*=0.90;
		System.out.println("%10 indirimli fiyat: "+ fiyat);
		
	}

}
