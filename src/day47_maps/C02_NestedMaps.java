package day47_maps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMaps {

	public static void main(String[] args) {
		// icice map olusturacaksak en icerdekinden baslamaniz tavsiye edilir.
		
		Map<String, String> ogrenci1Map=new HashMap<>();
		ogrenci1Map.put("isim", "Ali");
		ogrenci1Map.put("soyisim", "Can");
		ogrenci1Map.put("brans", "J.Dev");
		
		
		Map<String, String> ogrenci2Map=new HashMap<>();
		ogrenci2Map.put("isim", "Veli");
		ogrenci2Map.put("soyisim", "Yan");
		ogrenci2Map.put("brans", "QA");
		
		Map<String, String> ogrenci3Map=new HashMap<>();
		ogrenci3Map.put("isim", "Ali");
		ogrenci3Map.put("soyisim", "Yan");
		ogrenci3Map.put("brans", "C#");
		
		Map<String, String> ogrenci4Map=new HashMap<>();
		ogrenci4Map.put("isim", "Ayse");
		ogrenci4Map.put("soyisim", "Can");
		ogrenci4Map.put("brans", "QA");
		
		System.out.println("1. Ogrenci: "+ ogrenci1Map);//1. Ogrenci: {soyisim=Can, brans=J.Dev, isim=Ali}
		System.out.println("2. Ogrenci: "+ ogrenci2Map);//2. Ogrenci: {soyisim=Yan, brans=QA, isim=Veli}
		System.out.println("3. Ogrenci: "+ ogrenci3Map);//3. Ogrenci: {soyisim=Yan, brans=C#, isim=Ali}
		System.out.println("4. Ogrenci: "+ ogrenci4Map);//4. Ogrenci: {soyisim=Can, brans=QA, isim=Ayse}
	
	//Alt sinifdaki mapleri olusturduk 
	//autor mapi yani disaridaki mapi olusturacaz
		
	Map<Integer, Map<String,String>> sinifMap=new HashMap<>();
	
	sinifMap.put(101, ogrenci1Map);
	sinifMap.put(102, ogrenci2Map);
	sinifMap.put(103, ogrenci3Map);
	sinifMap.put(104, ogrenci3Map);
	
	System.out.println(sinifMap);//istedigimiz sekilde yazdirdik, icice Map oldu. Ýcice array gibi.
	//{101={soyisim=Can, brans=J.Dev, isim=Ali}, 102={soyisim=Yan, brans=QA, isim=Veli}, 103={soyisim=Yan, brans=C#, isim=Ali}, 104={soyisim=Yan, brans=C#, isim=Ali}}

	
	
	}

}
