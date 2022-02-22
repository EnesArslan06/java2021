package day44_iteratiorCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ListIterators_PDF_Soru {
	  /*Soru 3)
  Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz …
  (2. liste olusturmadan, gecerli liste uzerinde islem
  Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
  output: [23,40]	 */ 
  
	public static void main(String[] args) {
	 
	  List<Integer> liste=new ArrayList<>();
		liste.add(23);
		liste.add(22);
		liste.add(8);
		liste.add(5);
		liste.add(39);
		liste.add(41);
		liste.add(33);
		liste.add(20);
		
		System.out.println(liste);
		ListIterator<Integer> it=liste.listIterator();
		
		while (it.hasNext()) {
			int sayi=it.next();
			
			if (sayi<20 || sayi>40) {
				it.remove();
			}
		}
  System.out.println(liste);
  }   
}