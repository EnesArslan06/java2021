package day12_StringManipulationMethods;

public class C05_Contains {

	public static void main(String[] args) {
		// contain-içermek anlamýna gelir. Bir string de var mý yok mu anlamýna gelir
		//Char aratabiliyorduk lastindexofda ve indexofda. bunda aratamýyoruz sadece String olmasý lazým.
		//contains degierleri false veya truedur
		//var mý yok mu nun cevabýdýr. kackere var ona bakmýyor contains.
		
String cumle="Calisirsaniz, java ogrenmek cok kolay";

System.out.println(cumle.contains(" ")); //cumlede bosluk var mý sorusunu sorduk. True diye cvp verdi.
System.out.println(cumle.contains("iz, j"));//buda true dur
System.out.println(cumle.contains("hasan")); //false cunku hasan kelimesi yoktur.

		
}}
