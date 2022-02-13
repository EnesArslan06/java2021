package day26_forEachLoopConstructor;

import java.util.Arrays;

public class C04_forEachLoopSoru2 {

	public static void main(String[] args) {
		/*Bir String olusturunuz, bu String’deki character’leri for
		each loop kullanarak
		yazdiriniz. ipucu: split()*/

		
		String cumle="Java ogrenmek biraz zor";
		String array[]=cumle.split("");
		System.out.println(Arrays.toString(array));
			for (String string : array) {
				
				System.out.print(string+ " ");
			}
	
	}

}
