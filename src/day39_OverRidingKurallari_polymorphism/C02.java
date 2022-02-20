package day39_OverRidingKurallari_polymorphism;

public class C02 extends C01 {

	public static void main(String[] args) {
		
		C02 obj1=new C02();//kendi clas�nda varsa calistirir yoksa parente gider
		obj1.privateMethod();//bu class calisti 
		obj1.staticMethod();//bu class calisti

		C01 obj2=new C02();//parent clas�nda varsa calistirir cunku data turu ordan olusturulmus
//obj2.privateMethod();//bu hata veriyor private oldugundan ulasamazsin private methoda sadece 
//kendi clas�ndakiler ulasabilr. Ulasamadigimiz bir classi override edemeyiz.
//dolayisi ile signature ayni olmas�na ragmen bu ikisi ayni method olarak calisir.		
		obj2.staticMethod();//Parent Class static public method Calisti
//static methodlar override edilemez.Ust classda signature ayn� olmas�na ragmen java ikisini farkli birer method olarak gordu.

		
		
	}
	

public static void staticMethod() {
		
		System.out.println("Child Class static public method Calisti");
	}	
	
	private void privateMethod() {
		System.out.println("Child class private method calisti");
	} 
	
	/*public final void finalMethod() {
		System.out.println("Child class final method calisti");
}	//final olarak tanimlanan bir method overriding edilemez.
	//yani metodda degisiklik olamaz. son hali bu demektir.
	//final methodlari override edilemez.*/
	
	
	
	
}
