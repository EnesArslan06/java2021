package day34_AccessModifier_encapsulation;

import javax.imageio.stream.ImageInputStreamImpl;

@SuppressWarnings("unused")
public class C04_PublicVeriPaylasimi {

	public static void main(String[] args) {
		//C03 classindan bir obje olusturalim
		
		C03 obj=new C03();
		
		System.out.println(obj.isim);//Ali yazdýrdý. c03 clasindan ismi okuyabildik
		System.out.println(obj.maas);//10000 okuyabildirk
		
		obj.isim="Veli";
		obj.maas=15000;
		
		System.out.println(obj.isim);//Veli yazdýrdý
		System.out.println(obj.maas);//15000 yazdýrdý
		
		//benim C03 deki variablelerim public ise ben buna obje ile hem ulasabilirim 
		//hem degistirrebilirim. ama bu objeye has degisikliktir. obj2 olustursak Veli ve 15000 
		//degisikligi oraya yansimaz. 
	
		
		C03 obj2=new C03();
		System.out.println(obj2.maas);//burada 10000 ile tekrar basladi.
		
	}
	
	
}
