package day48_maps_THEEND;

import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class C04_MapMethodlari {

	public static void main(String[] args) {
		
		Map<Integer,String> ornek=C03_MapOlustur.myMap();//map olusustur clasindaki methodlari alýyoruz
System.out.println(ornek);
		//{101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan, C#, 104=Mustafa, Kan, Java}

System.out.println(ornek.containsKey(110));//false keyler 110 ýceriyor mu
System.out.println(ornek.containsValue("java"));//false dondurur. tek basina bir java diye value yok o yuzden yok der.
System.out.println(ornek.containsValue("Mustafa, Kan, Java"));//true dondurur. value bir butundur.
											//java var mi falan gibi seyler yapacaksak array list falan parcalamamiz lazim

/*Set<Entry<Integer, String>> entrySet = ornek.entrySet(); // herbir eleman entry 101=Ali, Can, java  gibi... // herbir eleman entry 101=Ali, Can, java  gibi...

int sayac=1;

for (Entry<Integer, String> each : entrySet) {
	
	System.out.println(sayac +".entry : " + each);
	sayac++;
}*/

System.out.println(ornek.getOrDefault(110, "Girilen key map'de yok"));//Girilen key map'de yok
System.out.println(ornek.getOrDefault(103, "Girilen key map'de yok"));//Ali, Yan, C#

ornek.putIfAbsent(103, "Ali, Yan, C#");//eklemeyecek
ornek.put(110, "Fikri, Yan, Qa");//ekleyecek


	}
}
