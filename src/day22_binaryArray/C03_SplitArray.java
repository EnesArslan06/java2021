package day22_binaryArray;

import java.util.Arrays;

public class C03_SplitArray {

	public static void main(String[] args) {
		// "Java ogrendim,  #cok para \kazandim.," 
//cumlesinin kelimelerini, ozel karaktrerler ve noktalamalar olmadan harf sýrasýna gore yazdýralým.
		
String cumle="Java ogrendim,  #cok para ?kazandim.,";
String kelimeler[]=cumle.split(" ");
		
System.out.println(Arrays.toString(kelimeler));//[Java, ogrendim,, , #cok, para, ?kazandim.,] bu sekilde yazdýrdý.
		
	for (int i = 0; i < kelimeler.length; i++) {
		kelimeler[i]=kelimeler[i].replaceAll("\\W","");//harf ve rakamlari hiclik ile degistir ve yazdýr diyoruz.
		//kelimeler bir stringdir o yuzden kelimeler. dedigimizde methodlar cýkar
		System.out.println(kelimeler[i]); 
	}

	System.out.println(Arrays.toString(kelimeler));//[Java, ogrendim, , cok, para, kazandim] bu sekilde yazdýrdýk en son

	//harf sýrasýna getirmemiz lazým
	Arrays.sort(kelimeler);
	System.out.println(Arrays.toString(kelimeler));//[, Java, cok, kazandim, ogrendim, para] bu sekilde yazdýrdý
	
	
	
	//kelimelerini yazdýrmak icin bir for loop daha yapýyoruz
	for (int i = 0; i < kelimeler.length; i++) {
	
		System.out.print(kelimeler[i]+ " "); //bu sekilde yazdýrdýk
	}
	
	
	}}
