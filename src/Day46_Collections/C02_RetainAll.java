package Day46_Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class C02_RetainAll {

	public static void main(String[] args) {
		
		Set<String> set1=new LinkedHashSet<>();
		
		set1.add("Ali");
		set1.add("Veli");
		set1.add("Ayse");
		set1.add("Fatma");
		set1.add("Omer");

	Set<String> set2=new LinkedHashSet<>();
	
	set2.add("Ali");
	set2.add("Veli");
	
	
	System.out.println(set1.retainAll(set2));
	System.out.println(set1);//[Ali, Veli] kaldi
	System.out.println(set2);//[Ali, Veli] bu zaten ayni idi ayni kaldi
	
	}
}
