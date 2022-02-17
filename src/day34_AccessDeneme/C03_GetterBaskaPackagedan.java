package day34_AccessDeneme;

import day34_AccessModifier_encapsulation.C05;

public class C03_GetterBaskaPackagedan {

	public static void main(String[] args) {
		
		C05 obj007=new C05();
		System.out.println(obj007.getAsgariMaasPrivate());//5000 ini gorduk
	//bunu istedigimiz packageden yapabiliriz. Get asgari methodunu cagiriyoruz
	//o methodun acess madifieri public oldugu icin package siniri yoktur. Child olma sarti yoktur.
	//bu methoda herkes ulasabilir. Ancak degistirilemez Private oldugu icin.	

	}

}
