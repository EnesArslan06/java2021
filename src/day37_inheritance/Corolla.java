package day37_inheritance;

public class Corolla extends Toyota{

	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi=4;
	String uretimYeri="Turkiye";
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Corolla araba1=new Corolla();
	//ilk yazdi�imiz Corolla class adi ayn� zamanda data t�r�d�r.
	//araba1 obje ismi
	// = assigment isareti
	//new keyword
	//Corolla(); constructor. Constructor calismadan obje olusmaz.
		
		
	//Javada obje olusturdugumuz her class ismi ayni zamanda bir data t�r�d�r
	//bu ornegimiz icin corolla hem class adi, hem de olusturdugumuz arb1 objesinin data type' dir.
		
	String str1=new String("Filiz");//burada oldugu gibi...
	//burada ilk yazilan String data turudur ayni zamanda String arkada calisan bir class ismidir.
		
		
	Toyota araba2=new Corolla();
	
	Araba araba3=new Corolla();
	
	System.out.println(araba1.calisiyorMu);//true
	
	//teker sayisina bakalim araba1. teker sayisi dersek Araba clas�ndan mi alacak yoksa bu classtan mi alacak
	System.out.println(araba1.tekerSayisi);//4 yazd�rd� once bu classa bakar burda yoksa babasi veya dedesine gider
	System.out.println(araba1.uretimYeri);//turkiye yazdirdi. Cunku kendi clas�na bakti orda deger var Araba clas�na gidip 
										//oradaki japonya degereini almadi.
	
	System.out.println(araba2.calisiyorMu);//true yazdirdi.
	System.out.println(araba2.tekerSayisi);//O yazdirdi. buradaki classdaki 4 degerini gidip almadi.  Cunku objeji olusturuken
									//basina Corolla degil Toyota yazdik bu demekki toyota ve onun ustundeki classlara bak dedik.
							//Corolla clas�ndaki ozellikleri goremeyiz corolladakileri goremeyiz Cunku data turu olarak toyotayi sectik
						//Toyota araba2=new Corolla(); bu sekilde yazd�g�m�z icin ilk bakacagi yer toyota classi sonra ustu.
	
	System.out.println(araba3.tekerSayisi);//0 yazdirir sadece araba clas�n�n ozelliklerini gorur. yani direk olarak araba clas�na gider
	 						//veya ustu varsa ona ustu olmadigi icin burada araba clas�na bakar sadece
							//Araba araba3=new Corolla(); bu sekilde olusturdugumuz icin...
	
	
	
	
	
	}

}
