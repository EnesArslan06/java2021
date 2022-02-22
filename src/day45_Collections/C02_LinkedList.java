package day45_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_LinkedList {

	
	public static void main(String[] args) {
	
		List<Integer> ll1=new LinkedList<>();
		
		System.out.println(ll1);//[] bos liste
		
		ll1.add(5);
		ll1.add(7);
			System.out.println(ll1);
		//ll1. yazdýgýmýzda add first add last gibi queue clasýndan gelenleri alamayiz cunku
			//List<Integer> ll1=new LinkedList<>(); bu sekilde olusturduk.
			
			//data turunu list sectigimiz icin sadece list interfaceindeki methodlari kullanabiliriz
			//LinkList classýnda override ettigimiz icin List interface olmasýna ragmen List methodlarini kullanabildik
			
			Queue<Integer> ll2=new LinkedList<>();		
		
			ll2.add(6);
			ll2.add(8);	
			//ll2.add dedigimizde yine addfirst addlast olanlara ulasamayiz.
			//data turu queue dan secersek deuqu clasýna ait olan add firs add last methodlarini goremeyiz
			
			Deque<Integer> ll3=new LinkedList<>();		
			
			ll3.add(3);
			ll3.add(4);	
			ll3.addFirst(20);
		
			//ll3. dedigimizde deque clasýndaki ozelliklere ulasabiliriz. add first add last methodlar kullanýlabilir.
			
			ll3.addAll(ll2);
			System.out.println(ll3);
			
}
}
