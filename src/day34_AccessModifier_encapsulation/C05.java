package day34_AccessModifier_encapsulation;

public class C05 {

	 int asgariMaasDefault=4000;
	
	
	private int asgariMaasPrivate=5000;
	//biz bu maasin baska classlarda obje ile degistirlmesini istemiyoruz.
	//public oldugunda herkes ulasabiliyor ve degistirebiliyordu
	
	 public static void main(String[] args) {

	}
	public int getAsgariMaasPrivate() {
		return asgariMaasPrivate;
	}

	//bir class daki herhangibir class uyesine ulasilabilsin ama degistirelemesin diyorsak
	//1-Class uyesini private yapin. (Private yapinca hic ulasamiyorum
	//2-Private class uyelerine hicbir sekilde ulasim olmayacagi icin sadece görebilme yetkisi verin
	//getter() methodu olusturun
	//sourche gidiyoruz Generate and Setters a gidiyoruz orada geti secitoruz
	//biz bu methodu cagirdigimizda bize bu private asgarimaasi getirecek.

}
