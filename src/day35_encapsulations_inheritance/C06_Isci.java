package day35_encapsulations_inheritance;

public class C06_Isci extends C05_Muhasebe{

	protected String statu;
	protected String meslegi;
	protected String sendika;
	
	public C06_Isci () {
		System.out.println("Isc� Parametresiz Constructor� calisti");
	}
	
	public static void main(String[] args) {
		
		C06_Isci isci1=new C06_Isci();
		
		isci1.meslegi="Kaynakci"; //yazd�gimizda herseye ulasabiliyoruz.
		isci1.isim="Emine";//personel clas�ndaki isime de ulasabildik
		isci1.saatUcreti=20;
		isci1.maas=isci1.maasHesapla();//muhasebedeki methodda 
		System.out.println(isci1.isim+ "'in maasi : "+ isci1.maas);//gitti muhasebe clas�na
		//orada methodda calisti ve hesabi yapti burada yazdirdi
		
		
	}

}
