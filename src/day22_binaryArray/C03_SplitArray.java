package day22_binaryArray;

import java.util.Arrays;

public class C03_SplitArray {

	public static void main(String[] args) {
		// "Java ogrendim,  #cok para \kazandim.," 
//cumlesinin kelimelerini, ozel karaktrerler ve noktalamalar olmadan harf s�ras�na gore yazd�ral�m.
		
String cumle="Java ogrendim,  #cok para ?kazandim.,";
String kelimeler[]=cumle.split(" ");
		
System.out.println(Arrays.toString(kelimeler));//[Java, ogrendim,, , #cok, para, ?kazandim.,] bu sekilde yazd�rd�.
		
	for (int i = 0; i < kelimeler.length; i++) {
		kelimeler[i]=kelimeler[i].replaceAll("\\W","");//harf ve rakamlari hiclik ile degistir ve yazd�r diyoruz.
		//kelimeler bir stringdir o yuzden kelimeler. dedigimizde methodlar c�kar
		System.out.println(kelimeler[i]); 
	}

	System.out.println(Arrays.toString(kelimeler));//[Java, ogrendim, , cok, para, kazandim] bu sekilde yazd�rd�k en son

	//harf s�ras�na getirmemiz laz�m
	Arrays.sort(kelimeler);
	System.out.println(Arrays.toString(kelimeler));//[, Java, cok, kazandim, ogrendim, para] bu sekilde yazd�rd�
	
	
	
	//kelimelerini yazd�rmak icin bir for loop daha yap�yoruz
	for (int i = 0; i < kelimeler.length; i++) {
	
		System.out.print(kelimeler[i]+ " "); //bu sekilde yazd�rd�k
	}
	
	
	}}
