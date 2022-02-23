package day48_maps_THEEND;

import java.util.HashMap;
import java.util.Map;

public class C01_Maps_HarfSaySorusu {

	public static void main(String[] args) {
		// Verilen bir String’deki harfleri ve harflerin kacar kez kullanildigini return eden bir method yaziniz
		  // Ornek : Input : Hellooo  output : H=1, e=1, l=2, o=3

		String input="helloooooo";
		
harfsay	(input);	
		
		Map<String, Integer> mainMap=harfsay(input);//burada metoddan donen harfSayilarMap 
													//mapi icin yeni map olusturduk ve atama yaptik 
		System.out.println(mainMap);//{e=1, h=1, l=2, o=6}
		
	}

	private static Map<String, Integer> harfsay(String input) {
		
		Map<String,Integer> harfSayilariMap=new HashMap<>();
		//kelimayi harflere ayiracaz, bunun icin array olusturacaz
		String arr[]=input.split("");
		
		for (String each : arr) {
			if (!harfSayilariMap.containsKey(each)) {//benim mapim bu harfleri icer miyorsa?
				harfSayilariMap.put(each, 1);//mape each i ve 1 i ekle diyoruz.
											//2. dongude bir kez daha tekrarliyoruz. ve iceren bir each olustugunda 
											//else komutu calisacak
		
			}else {//mesela l harfi var yukaridaki mape ekledik orada iceriyorsa alt
			//harfSayilariMap.get(each)+1 bu girilen harfin adedini yani valuesini bulup bir artirir
			//burada key si l olan elemanin valuesini getirir. onuda bir artiririz.
				harfSayilariMap.put(each, harfSayilariMap.get(each)+1);
				//burada l icin konusacak olursak l yi yazacak degeri 1 iken else calistiginda 1 daha artirirz. l=2 sonucunu alacaz
				
			}
		}
		return harfSayilariMap;
		
		
	}

}
