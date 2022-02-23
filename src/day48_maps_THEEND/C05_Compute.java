package day48_maps_THEEND;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C05_Compute {

	public static void main(String[] args) {
		
		
		Map<String, Integer> ornekMap=new HashMap<>();
		
		ornekMap.put("A", 2);
		ornekMap.put("B", 5);
		ornekMap.put("C", 1);
		ornekMap.put("Z", 3);
		ornekMap.put("K", 10);
		
		System.out.println(ornekMap);
		
		ornekMap.compute("A", (key,value) -> 10);//A keyinin degeri 2 iken 10 yapmak icin kullandýk value degistirmek icin kullanilir.
		System.out.println(ornekMap);
		ornekMap.compute("B", (key,value) -> 2*value+5);
		System.out.println(ornekMap);//{A=10, B=15, C=1, Z=3, K=10}  B keyinin degerini bu sekilde de artirabiliriz
		
		ornekMap.computeIfAbsent("D", v->20);
		ornekMap.computeIfAbsent("C", v->11);//degisiklik yapmadi, cunku C var
		ornekMap.computeIfAbsent("L", k->12);//k da yazsak degisiklik olmadi, L yi yeni olusturdu ve degerini 12 atadi
		System.out.println(ornekMap);//{A=10, B=15, C=1, D=20, Z=3, K=10} yeni D keyi ile degerini ekledik.
		
		ornekMap.computeIfPresent("L", (key,value) -> 2*value+5);
		System.out.println(ornekMap);//L nin degerini degistirdi bu sekilde de.
		
		
		
	}
}
