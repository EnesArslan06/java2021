package day30_immutable;

import java.util.ArrayList;
import java.util.List;

public class C01_Immutable {

	public static void main(String[] args) {
		//String immutable bir class iken List Mutabledir.
		
		String str="Ali";
		str.toUpperCase();
		System.out.println(str);//Ali yazd�r�r buyuk harf yapmadi. ayn� komutu syso icerisinde yazdirsak,
		System.out.println(str.toUpperCase());//AL� yazd�r�r.
		System.out.println(str);//Ali yazd�r�r.

		
		
		List<String> isimler=new ArrayList<>();
		System.out.println(isimler);//koseli parentezde hiclik
		
		isimler.add("Ali");
		System.out.println(isimler);//[Ali] ali yazd�r�r.
		
		isimler.set(0, "Veli"); //0. index i Veli yap dedik
		
		System.out.println(isimler);//[Veli]
		
		isimler.remove(0);//stringde boyle yazd�g�m�zda degeri havada tutuyordu cunku string immutable
		//bu mutable 
		System.out.println(isimler);//[] bu sekilde yazd�rd�
		
		
	}

}
