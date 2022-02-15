package day28_constructorCall_staticKeyword;

import javax.sound.midi.InvalidMidiDataException;
import javax.tools.Diagnostic;

public class C02 {

	int x=5;
	static int y=10;
	
	public static void main(String[] args) {
		// 3 tane obje olusturalim ve degisimleri gozlemleyelim

		C02 obje1=new C02();
		//bir classta hem instance hemde statik variable var ise obje uzerinde bir daha y isaretlemem gerek yok
		//cunku static classýn malidir. 
		
		System.out.println("obje1 icin x : "+ obje1.x+ " obje1 icin y: " + obje1.y);
						//obje1 icin x : 5 obje1 icin y: 10
		//x++;
		//y++; //dedigimizde x icin olaninda hata verir cunku x e direk ulasamayiz
		
		obje1.x++;
		obje1.y++;
		System.out.println("obje1 icin x : "+ obje1.x+ " obje1 icin y: " + obje1.y);
					//obje1 icin x : 6 obje1 icin y: 11 ikisinide 1 artirdi. x++ desek olmuyor ama obje1.x dememiz lazim
					//burada y nin degeride 11 oldu. Ancak x in degeri degismedi 5 olarak kaldi.
		
		C02 obje2=new C02();
		System.out.println("obje2 icin x : "+ obje2.x+ " obje2 icin y: " + obje2.y);
					//obje2 icin x : 5 obje2 icin y: 11
		
		obje2.x++;// x i 5 den 1 aartirdi
		obje2.y++; // y ise zaten 11 olmustu yukarida ona ++ ekledi ve 12 oldu
		
		System.out.println("obje2 icin x : "+ obje2.x+ " obje2 icin y: " + obje2.y);
		//obje2 icin x : 6 obje2 icin y: 12
		
		System.out.println("obje 2 olusturuldak sonra ve islemden sonra obje1'in"
				+" x: " +obje1.x+ " y: "+ obje1.y);
		//obje 2 olusturuldak sonra ve islemden sonra obje1'in x: 6 y: 12
	//obje1 1 de x in degeri x icin 6di   y icin 11 idi. obje 2 icinde y yi 12 yaptik,
		//y static oldugu icin bu class boyunca degeri her yapilan obje icin etkili olur.
		
		C02 obje3=new C02();
		
		obje3.x=20; //obje x=20 demek istedik
		y=40;//ayni classýn icindeyken static variablelere ulasmak icin obje yazmaya  ihtiyac yoktur
		//kullanýrsak Java CTE vermez fakat "static variablelere static yoldan ulas diye bizi uyarir.
		
		System.out.println("obje 3 den sonra obje1'in x : " + obje1.x);//6 olur obje 1 de 6 idi burada da 6
		System.out.println("obje 3 den sonra obje2'in x : " + obje2.x);//6 olur obje 2 de 6 idi burada da 6
		System.out.println("obje 3 den sonra obje3'un x : " + obje3.x);//20 olur bu objeye ozel 20 ye esitlemistik.
		
		System.out.println("obje 3 den sonra obje1'in y : " + obje1.y);//40 olur 
		System.out.println("obje 3 den sonra obje2'in y : " + obje2.y);//40 olur 
		System.out.println("obje 3 den sonra obje3'un y : " + obje3.y);//40 olur cunku y static bir degisiklik bu classdaki her
																	// ye degerini degistirir.
		
		
		
		
	
	}

}
