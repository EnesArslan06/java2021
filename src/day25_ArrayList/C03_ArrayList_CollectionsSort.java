package day25_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_ArrayList_CollectionsSort {

	public static void main(String[] args) {
		// Collections.sort methodu vard?r Arrays. methodundaki gibi

	List<String> isimler=new ArrayList<>();
	

		isimler.add("Kutlu");
		isimler.add("Emrah");
		isimler.add("Ferhat");
		
		System.out.println(isimler); //[Kutlu, Emrah, Ferhat]
		
		Collections.sort(isimler);

		System.out.println(isimler); //[Emrah, Ferhat, Kutlu] s?ralamayi yaptik
		
		
		
}
}
