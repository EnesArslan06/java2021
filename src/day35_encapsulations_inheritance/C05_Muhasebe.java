package day35_encapsulations_inheritance;

public class C05_Muhasebe extends C04_PersonelParents{

	protected int saatUcreti;
	protected String statu;
	protected int maas;
	
	public C05_Muhasebe(){
		System.out.println("Muhasebe Parametresiz Constructorı calisti");
	}
	
	public static void main(String[] args) {

		C05_Muhasebe clsn1=new C05_Muhasebe();
		clsn1.isim="Ali";
		System.out.println(clsn1.soyisim);//null yazdırır. Cunku diger classda ona bir deger atamadik
		System.out.println(clsn1.isim);//Ali Yazdirdi
		//clsn1. dedigimizde Isci clasındakileri goremeyiz cunku bu isci clasının babasidir. 
		//dolayisi ile personel clasındakilere ulasabiliriz bu classdan.
		//isciler classından hem Muhasebe clasina hem personel clasına ulasabiliriz.
		
	}

	public int maasHesapla() {//maasi cagirdigmizda hesaplayip bize dondurecek
		
		int maas=8*25*saatUcreti;
		return maas;
	
	}

	
	
	
	
}
