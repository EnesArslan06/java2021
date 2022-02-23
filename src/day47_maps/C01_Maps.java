package day47_maps;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JSpinner.ListEditor;

public class C01_Maps {

	public static void main(String[] args) {
		//1- bir map olusturmadan once mape koyacagimiz key ve value degerlerini incelemeliyiz.
		//tum degerleri koyabilmemiz icin key ve value icin Object, object secebiliriz.
		//Ama bu durumda map icerisindeki elemanlara ait bilgilere ulasmakta zorlaniriz.
		//Data turunu secerken hem icine koydugumuz tum elemanlari isleyebiliecek sekilde basit data turu secmeliyiz.
		
//2-Mapi olustururken mapin turunede karar vermeliyiz.Map interface tablosuna bakip oradan obje uretebilecegimiz
	//yapilardan birini secmeliyiz.
		//--TreeMap
		//---HashMap--genelde hash map tercih edilir.
		//---LinkedMap
		
	Map<Integer,String> sinif=new HashMap<>();//hasMap yazdýgýmýz yere yukarida gordugmuz 3classdan birini secmeliyiz.			
											//map interfacedir obje uretilemez
											// obje uretebilecegimiz 3 adet bagli classýýndan birini seceriz
	sinif.put(101,"Ali, Can, J.Dev" );
	sinif.put(102, "Veli, Yan, QE");
	sinif.put(103, "Ali, Yan, C#");
	
	
	int no=104;
	String isim="Ayse";
	String soyisim="Can";
	String brans="QE";//bunu eklemek istersek
	
	sinif.put(no, isim+", "+ soyisim+", "+brans);
	
	System.out.println(sinif);
	//{           101=Ali, Can, J.Dev, 102=Veli, Yan, QE, 103=Ali, Yan, C#, 104=Ayse, Can, QE}
//Map parantezi	  key1=value1		   key2=value2			key3=value^
	
	
	
	//102 nolu ogrencinin bilgilerini bana getir
	System.out.println(sinif.get(102));//Veli, Yan, QE			 olarak getirdi.
	System.out.println(sinif.get(104));//Ayse, Can, QE
	
System.out.println(sinif.keySet());//sinif.keySet() key i verdigimizde bize keyleri Set olarak dondurur.
//[101, 102, 103, 104]



//map teki tum valueleri gormek icin;  Collection olarak dondurur(Collection cok genistir.).
System.out.println(sinif.values());	
//[Ali, Can, J.Dev, Veli, Yan, QE, Ali, Yan, C#, Ayse, Can, QE]	
	
		//sýnýftaki ogrencilerin isimlerini bir listeye ekleyelim

//sinif.values() bize birsey donduruyor bunu 2 sekilde kullanabiliriz. 1 ya yazdiracaz ya baska bir variableye ekleyecez
//Liste ekleyelim

List<String> valueList=new ArrayList<>((sinif.values()));

System.out.println("value list: "+ valueList);
		//value list: [Ali, Can, J.Dev, Veli, Yan, QE, Ali, Yan, C#, Ayse, Can, QE]
// bu sekilde list e atamamizin nedeni bu eleman haline getirip string manipulation yapmamiz lazim.

System.out.println(valueList.size());// 4  olarak gosterdi. Cunku 4 ogrenci bilgisi girdik 
//herbiri 3 elemandan olusan 4 elementlik bir listimiz var sadece Ýsimlere ulasabilmek icin;
//yani Ali, Can, J.Dev  bunu bir eleman olarak goruyor yani 0. indexteki eleman

List<String> isimListesi=new ArrayList<>();//List olusturduk
String bilgiler[]=new String[3];//3 elemanli yaptik listi cunku her eleman 3 parca halinde (Ali, Can, QE)


for (int i = 0; i < valueList.size(); i++) {
	bilgiler=valueList.get(i).split(",");  //value listin 0. elemanini aldýk ilk dongude ve bu elemanlari , e gore bolup array ekledik
	isimListesi.add(bilgiler[0]);//yani her arrayin ilk once sifirinci elemanini alacaz i dersek her dongude farkli birsey getirir.
	
}

System.out.println(isimListesi);//[Ali, Veli, Ali, Ayse] isimleri yazdirdik.
//ozet olarak valuelistteki 4 elemanli (her elemanda 3 karakter var) 1.elemani arraye ekledik her dongude.
//her dongude ilk karekteri yani isimi isimListesi arrayine atadik.


//map ile biz bir database i javanin icine alabiliriz. Bu cok onemlidir.
//biz database den butun verilri alip bir mape aliriz ve oradan list array vs gibi bugune kadar ogrendigimiz 
//bilgiler ile yapabiliriz. orjinal database uzerinde calismak risklidir.



//buda farkli bir cozumu
/*for (String w : valueList) {
	for (String x : w.split(", ")) {
		valueList.add(x);
	} 
	valueList.remove(w);
}
System.out.println(valueList+"\n"+valueList.size());*/



	}

}
