package day12_StringManipulationMethods;

public class C05_Contains {

	public static void main(String[] args) {
		// contain-i�ermek anlam�na gelir. Bir string de var m� yok mu anlam�na gelir
		//Char aratabiliyorduk lastindexofda ve indexofda. bunda aratam�yoruz sadece String olmas� laz�m.
		//contains degierleri false veya truedur
		//var m� yok mu nun cevab�d�r. kackere var ona bakm�yor contains.
		
String cumle="Calisirsaniz, java ogrenmek cok kolay";

System.out.println(cumle.contains(" ")); //cumlede bosluk var m� sorusunu sorduk. True diye cvp verdi.
System.out.println(cumle.contains("iz, j"));//buda true dur
System.out.println(cumle.contains("hasan")); //false cunku hasan kelimesi yoktur.

		
}}
