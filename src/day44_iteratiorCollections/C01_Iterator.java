package day44_iteratiorCollections;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {

	public static void main(String[] args) {
		//ýterator interface dir.
		//iterator iteratordur.
		
		List<Integer> liste=new ArrayList<>();
		
		liste.add(5);
		liste.add(3);
		liste.add(2);
		liste.add(9);
		liste.add(7);
		liste.add(8);
		liste.add(6);
		liste.add(1);
		liste.add(4);
		
		System.out.println(liste);
		
		//index kullanmadan tum elemanlari 3 eklenmis sekilde yazdirin
		
		for (Integer i : liste) {
			System.out.print(i+3+" ");//8 6 5 12 10 11 9 4 7 yazdirdi	
			//ancak for each icinde atama olmaz gecici olarak yazdirir.
		
			//for each ile index kullanmadan tum elemanlara ulasabiliyoruz ama kalici degisiklik yapamiyoruz
		}
		
		System.out.println(liste);//[5, 3, 2, 9, 7, 8, 6, 1, 4]
		
		
	}

}
