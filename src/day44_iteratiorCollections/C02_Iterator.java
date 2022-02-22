package day44_iteratiorCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {

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
		
		System.out.println(liste);// [5,  3,  2,  9,  7,  8,  6,  1,  4]

		Iterator ite1=liste.iterator();
		
		for (int i = 0; i < liste.size(); i++) {
			
			System.out.println(ite1.hasNext()+"===="+ite1.next()); 
			//iterator yani basinda bir eleman varmi diye sorarsak hasnext() methodu
			//delil olarakda gostermesi icin next();
			
		}
		System.out.println(ite1.hasNext());//false verir
		//zaten 2 ye kadar calismıstı. 2 den sonra elenemt yok diyor
		System.out.println(ite1.next());//altını cizmiyor ancak calistirinca exception verir. cunku 2 den sonra eleman yok
		
	}

}
