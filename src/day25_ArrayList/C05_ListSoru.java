package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_ListSoru {

	public static void main(String[] args) {
		// verilen bir listede icinde belirli bir harf olan kelimeleri elemanlari
		//silen bir method yaziniz

	
	
	
	List<String> str=new ArrayList<>();
	
	str.add("Jeyhun");
	str.add("Yildiz");
	str.add("Mustafa");
	str.add("Tugba");
	str.add("Turgat");
	
	System.out.println(str);//[Jeyhun, Yildiz, Mustafa, Tugba, Turgut]
	
	String silinecekharf="a";//bu listede kucuk a olan elemanlardan kelimeleri silin
	
	
	silinecek(str, silinecekharf);
	
	
}	



	private static List<String> silinecek(List<String> str, String silinecekharf) {
		for (int i = 0; i < str.size(); i++) {
			if (str.get(i).contains(silinecekharf)) {
			str.remove(i);
			i--;//index kaydýgýicin i-- yaptýk.
				//cunku bunu yapmazsak index kaymasi oluyor mesela arada silmedigi a harfli elemanlar oluyor
				//i-- koymadan ve koyduktan sonra dene yazdýr.
			}
			
		}
		
		System.out.println(str);

	return str;	
		
	}}
