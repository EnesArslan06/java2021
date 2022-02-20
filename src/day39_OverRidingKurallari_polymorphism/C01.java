package day39_OverRidingKurallari_polymorphism;



public class C01 {

	public static void staticMethod() {
		
		System.out.println("Parent Class static public method Calisti");
	}	
	
	private void privateMethod() {
		System.out.println("Parent class private method calisti");
	} 

	public final void finalMethod() {
		System.out.println("Parent class final method calisti");
}
	//Child class ile parent class ayný package de olduklarindan methodlarin access modifierleri 
	//public protected veya default olsaydi hic bir sorun olmazdi
	
}