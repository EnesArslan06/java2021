package day35_encapsulations_inheritance;

public class C05_Muhasebe extends C04_PersonelParents{

	protected int saatUcreti;
	protected String statu;
	protected int maas;
	
	public C05_Muhasebe(){
		System.out.println("Muhasebe Parametresiz Constructorý calisti");
	}
	
	public static void main(String[] args) {

		C05_Muhasebe clsn1=new C05_Muhasebe();
		clsn1.isim="Ali";
		System.out.println(clsn1.soyisim);//null yazdýrýr. Cunku diger classda ona bir deger atamadik
		System.out.println(clsn1.isim);//Ali Yazdirdi
		//clsn1. dedigimizde Isci clasýndakileri goremeyiz cunku bu isci clasýnýn babasidir. 
		//dolayisi ile personel clasýndakilere ulasabiliriz bu classdan.
		//isciler classýndan hem Muhasebe clasina hem personel clasýna ulasabiliriz.
		
	}

	public int maasHesapla() {//maasi cagirdigmizda hesaplayip bize dondurecek
		
		int maas=8*25*saatUcreti;
		return maas;
	
	}

	
	
	
	
}
