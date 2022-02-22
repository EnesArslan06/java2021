package day44_iteratiorCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C04_Iterator {

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
		
		ListIterator<Integer> it=liste.listIterator();
		it.add(123);
		System.out.println(liste);
		it.next();
		System.out.println(it.next());
		it.previous();
		it.previous();
		it.set(0);
		System.out.println(liste);
	}

}
