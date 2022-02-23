package day48_maps_THEEND;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class C02_MapsSoru {

	public static void main(String[] args) {
	/*Soru 3 ) Verilen map’te istenen programlama dilini bilen kisileri list olarak donduren bir method yaziniz.
	 map { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
	 Istenen dil=java
	 Sonuc = [Ali, Veli]*/

	Map<Integer,String> soruMap= C03_MapOlustur.myMap();	
	String istenenDil="Java";
	
		System.out.println(dilBilenListesiOlustur(soruMap,istenenDil));
		
		
		
	}
			//soruda list olarak dondur dedigi icin void olan kismi List olarak degistiriyoruz
	private static List<String> dilBilenListesiOlustur(Map<Integer, String> soruMap, String istenenDil) {
		
		List<String> dilBilenListesi=new ArrayList<>();//methodun dondurecegi liste
		//soruMap.values();//bu bize collections dondurur.
		List<String> valueList=new ArrayList<>(soruMap.values());
		System.out.println(valueList);//[Ali, Can, Java, Veli,Yan, Java, Ali, Yan, C#] eleman sayisi 3 olan bir list haline geldi
		//bu uc elemani tek tek ele alýp split ile bolup dil degeri verilen inputa esit olanlarin isim degerlerini
		//dilBilenlerListesine ekleyecegim.
		String parcaliArray[]=new String[3];//uzunlugunu 3 olarak biliyoruz cunku value liste 3 eleman var. 
												//bu elemanlarin her birininde 3 er tane elemani var
		
		for (String each : valueList) {//her bir elemani split ile bolup bir arraye atamamiz lazim
			parcaliArray=each.split(", ");//[Ali,Can,Java] seklinde 3 elemanli array getirecek.
							//burada 3 elementetn son element olan "java" istenen dil esitse bu arrayin ilk elementini alacam
			if (parcaliArray[2].equalsIgnoreCase(istenenDil)) {//bu arraydeki son eleman "java ise arrayin 0. indexsini ekleyecez
				
				dilBilenListesi.add(parcaliArray[0]);
				
			}
			
 		}
		return dilBilenListesi;
	}

}
