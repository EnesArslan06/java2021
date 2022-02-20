package day34_AccessModifier_encapsulation;

public class C01 {

	private int sayiPrivate=10;
	//private class uyelerine (method veya variable) sadece icinde bulundugu classdan ulasabiliriz.
	int sayiDefault=20;
	//bunun access modifier i defaulttur. cunku herhangibir sey belirtilmemis basinda
	//default degerlere sadece icinde bulundugumuz packageden ulasýlabilir.
	//default access modifierin diger ismide package aceess modifierdir.
	protected int sayiProtected=30;
	//protected class uyelerine icinde bulundugu package daki tüm classlar 
	//ve baska packagelardaki child classlar ulasabilir
	public int sayiPublic=40;
	//public class uyelerine baska package veya classlardan heryerden ulasilabilir.
	
	public static void main(String[] args) {

//yukaridaki variableler static olmadýklarý icin main methoddan ulasamayiz direk
		//obje olusturmaliyiz
		
C01 obj=new C01();

System.out.println(obj.sayiPrivate);
System.out.println(obj.sayiDefault);
System.out.println(obj.sayiProtected);
System.out.println(obj.sayiPublic);
	}

	public void staticolmayanMethod() {

		C01 obj=new C01();
		System.out.println(obj.sayiPrivate);//privete sadece olusturuldugu classda kullanýlabilir.
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);	
		
	
	
	
	}
}
