package day30_immutable;

public class C02_Immutable {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str="Ali";
		
		for (int i = 0; i < 100; i++) {
			str+=" ";
		}
		
	//bu kod calistiginda java kac obje olusturur?
		
	//bir obje basta olusturuldu loo da ise 100 obje daha olusturuldu. dolayisi ile bu kod calistiginda 
		//biz ekranda hicbirsey gormeyiz
	//Java 101 obje olusturmus olur. 
	//str ýn son degeri ise "Ali (yaninda 100 tane bosluk yazdýrýlmýs hali olan bir durum olusur.
		

	}

}
