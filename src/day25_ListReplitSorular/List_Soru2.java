package day25_ListReplitSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_Soru2 {

	public static void main(String[] args) {
		/*Create a 10-element list. Swap the 8th element with the 3rd element.
		INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
		Output:
		[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]*/

		
	String array[]=	{"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
		
	List<String> isim2=new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
		
	/*for (int i = 0; i < array.length; i++) {
		isim2.add(array[i]);
	}	*/

	System.out.println(isim2);
	
	
	isim2.set(2,"Furkan");
	isim2.set(7, "Kemal");
	
		System.out.println(isim2);
	}

}
