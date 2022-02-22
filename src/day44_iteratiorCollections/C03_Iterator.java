package day44_iteratiorCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {

public static void main(String[] args) {

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
		
		System.out.println(liste);//[5, 3, 2, 9, 7, 8, 6, 1, 4]
		
		Iterator ite2=liste.iterator();
		ite2.next();//bir sonrakine gecti
		ite2.next();//bir sonrakine daha gecti
		ite2.next();//bir sonrakine gecti	
		
		System.out.println(ite2.next());//9 yazdýrýr. imlet gibidir 3 saga kaydi 9 sonucunu verdi. o indexteki eleman
		
		ite2.remove();//burada 9 u sildi cunku en son 9 a kadar gelmistik
		//yani 4. sýradaki 9 a ulasmistik en son cunku syso icinde bile next yazsak bir sonrakine kayar
		
		//System.out.println(ite2.remove());remove methodu birsey dondurmedigi icin syso icinde yazilamaz
		
		System.out.println(liste);
		
		
		
		

}

}
