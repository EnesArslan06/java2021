package day34_AccessDeneme;

import day34_AccessModifier_encapsulation.C01;

public class C02_BaskaPackageChildClass extends C01{

	public static void main(String[] args) {
		//bir class� nas�l child class yapariz.
//yukarida extends C01 yanina gelip yazd�g�m�zda 
		
		C01 obj=new C01();

		//System.out.println(obj.sayiPrivate);
		
		//System.out.println(obj.sayiDefault);
		
		//System.out.println(obj.sayiProtected);
		
		System.out.println(obj.sayiPublic);
		
		
	}
		
	public void staticOlmayanMethod() {
	
		C01 obj=new C01();

		//System.out.println(obj.sayiPrivate);
		
		//System.out.println(obj.sayiDefault);
		
		System.out.println(sayiProtected);//bu classda sayi protected diye bir variable yok
		//C01 e gider bakar orada bulunan variableyi al�r Protected olmas�na ragmen child class oldugu icin ulasabiliriz
		
		System.out.println(obj.sayiPublic);//
		
		
		
	}	
	}


