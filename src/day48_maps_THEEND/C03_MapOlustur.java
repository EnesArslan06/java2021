package day48_maps_THEEND;

import java.util.HashMap;
import java.util.Map;

public class C03_MapOlustur {

	public static Map<Integer, String> myMap() {
		
		Map<Integer,String> ornekMap=new HashMap<>();
		
		//map { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		
		ornekMap.put(101, "Ali, Can, Java");
		ornekMap.put(102, "Veli, Yan, Java");
		ornekMap.put(103, "Ali, Yan, C#");
		ornekMap.put(104, "Mustafa, Kan, Java");
		//bu bizim ornek mapimiz. Biz bunu istedigimiz package den veya classdan class ismi ile ulasabiliriz.
		return ornekMap;
		
		
		
	}

}
