package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrayList {

	public static void main(String[] args) {
		List <String> isimler=new ArrayList<>();
		System.out.println("Bos liste : " + isimler);
		isimler.add("Ali");
		System.out.println("Bir Eleman: " + isimler);
		
		isimler.add("Veli");
		System.out.println("iki eleman : " + isimler); //add methodu listenin sonuna ekleme yapar.
	
		isimler.add("Can");
		System.out.println("Uc eleman: "+ isimler );// bunun tamamý sona ekler
		
		isimler.add(1, " ömer");// BURADA 1. ÝNDEX E YAZDIK
		System.out.println(isimler);
		
		//isimler.add(5); declare ederken belirttigimiz data turunun dýsýnda bir data turu ekleyemeyiz 
		 
	List <String> liste2=new ArrayList <>(); 
	liste2.add("Gunter");
	liste2.add("Emrah");
	
	// Liste 1 in sonuna liste ikiyi ekleyebilir miyiz?
	isimler.addAll(4, liste2); //ilk indexin index i 3 te bitiyor. 1. indexin sonuna ekledik
	System.out.println("liste 2 yi ekledik: "+ isimler);
	
	isimler.addAll(liste2);//nu sekilde de ekleyebilir indexini yazmadan
	System.out.println(isimler);
	
	
	System.out.println(isimler.size());//length sini verir
	System.out.println(isimler.isEmpty());//bos mu dolumu diye true false cevabi verir
	}}
