package day35_encapsulations_inheritance;

public class C02_Getter {

	public static void main(String[] args) {
		
		C01 ogrenci1=new C01();
		
		//System.out.println(ogrenci1.);//C01 clasýndaki private oldugu icin buradan ulasamiyoruz
		
		System.out.println(ogrenci1.isGecerMi());//false gorduk sadece gorebiliriz suan sadece get methodu olarak uyguladik
		//ogrenci1.isGecerMi()=true; //bu sekilde calistiramayiz is gecermi C01 clasýnda bir methoddur.
		
		
		

	}

}
