package day26_forEachLoopConstructor;

public class JeepRunner {

	public static void main(String[] args) {
		//Jeep clasindan bir obje olusturalim ve ozelliklerini yazdiralim
		
		
		
		Jeep jeep1=new Jeep();
		System.out.println(jeep1.fiyat+ " "+ jeep1.ilanNo+ " "+ jeep1.marka+ 
				" "+ jeep1.model+" "+ jeep1.yil); //yazd�rd�gi sonuc "10000 1001 null null 2020"

		
		//jeep clas�ndaki variableler instance variableler olduklarindan atad�g�m degerler
		//sadece benim objem icin degerleri degistirir.
		//jeep clas�ndaki degerlere hicbirsey yapmaz.
		jeep1.fiyat=15000;
		jeep1.ilanNo=1002;
		jeep1.marka="Toyota";
		jeep1.model="Corolla";
		jeep1.yil=2005;
		
		System.out.println(jeep1.fiyat+ " "+ jeep1.ilanNo+ " "+ jeep1.marka+ 
				" "+ jeep1.model+" "+ jeep1.yil);		
		
		
		
		
		
		jeep1.hiz(150);			//araba saatte 150 km yapar
		jeep1.yakit("dizel");		//Araba yakit olarak dizel kullanir
		
	}

}
