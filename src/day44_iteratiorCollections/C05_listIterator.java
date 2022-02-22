package day44_iteratiorCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.JSpinner.ListEditor;

public class C05_listIterator {

	public static void main(String[] args) {
		
		List<String> liste=new ArrayList<>();
		liste.add("Ali");
		liste.add("Veli");
		liste.add("Ayse");
		liste.add("Emrah");

	
	System.out.println(liste);//[Ali, Veli, Ayse, Emrah]

	ListIterator<String> li1=liste.listIterator();
	//listin yardýmci ogesi gibidir, listi olmadan bir ise yaramaz.
	
	while (li1.hasNext()) {
		li1.set(li1.next()+"X");//li1.next() bize elemani getirdi set methoduda X i ekledi
	}
	
	System.out.println(liste);//[AliX, VeliX, AyseX, EmrahX]
	
	
	
	}

}
