package day34_AccessDeneme;

import day34_AccessModifier_encapsulation.C01;

public class C01_BaskaPackage {

	public static void main(String[] args) {
		
		C01 obj=new C01();

		//System.out.println(obj.sayiPrivate); sadece kendi classýndan ulasilabilir
		//System.out.println(obj.sayiDefault);//sadece ayni package dakiler ulasilabilir
		//System.out.println(obj.sayiProtected);//ayni package daki classlar ve childclasslar ulasabilir.
		System.out.println(obj.sayiPublic);	//heryerden ulasilabilir

	}

}
