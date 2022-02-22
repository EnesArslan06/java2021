package day45_Collections;

import java.util.LinkedList;

public class C01_LinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll1=new LinkedList<>();
		
	System.out.println(ll1);//[] bos liste
	
	ll1.add(5);
	ll1.add(7);
		System.out.println(ll1);//[5, 7]
//LinkedList in iki tane interface parenti vardir.
//1. List oteki Deque, Deuqe da queye ye uzanir
		
ll1.add(0, 10);	//List interfaceden gelen ozellikle basa eleman ekleme
System.out.println(ll1);//[10, 5, 7]

ll1.addFirst(3);//ilk elemanaa 3' u ekler. Queue interfaceden gelen ozellikle eleman ekleme 
System.out.println(ll1);//[3, 10, 5, 7]

//istedigimiz zaman queune den gelen ozellikleri ister listen gelen ozellikleri kullanabiliriz
//iki classada extend olmustur linkedlist.


//ll1.addAll();bu iki tane linked list var ise birbirine eklerll1. yazdigimizda cýkan methodlarin hangi class dan geldigi gozukmektedir

LinkedList<Integer> ll2=new LinkedList<>();

ll2.add(11);
ll2.add(12);

ll1.addAll(ll2);
System.out.println(ll1);//[3, 10, 5, 7, 11, 12]

ll2.addAll(2, ll1);//burada ll2 ye ll1 in 3. indexten itibaren tamamýný ekledi
System.out.println(ll2);//[11, 12, 3, 10, 5, 7, 11, 12]

	}
}
