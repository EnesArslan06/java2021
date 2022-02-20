package day35_encapsulations_inheritance;

public class C05_Muhasebe extends C04_PersonelParents{

	protected int saatUcreti;
	protected String statu;
	protected int maas;
	
	public C05_Muhasebe(){
		System.out.println("Muhasebe Parametresiz Constructor� calisti");
	}
	
	public static void main(String[] args) {

		C05_Muhasebe clsn1=new C05_Muhasebe();
		clsn1.isim="Ali";
		System.out.println(clsn1.soyisim);//null yazd�r�r. Cunku diger classda ona bir deger atamadik
		System.out.println(clsn1.isim);//Ali Yazdirdi
		//clsn1. dedigimizde Isci clas�ndakileri goremeyiz cunku bu isci clas�n�n babasidir. 
		//dolayisi ile personel clas�ndakilere ulasabiliriz bu classdan.
		//isciler class�ndan hem Muhasebe clasina hem personel clas�na ulasabiliriz.
		
	}

	public int maasHesapla() {//maasi cagirdigmizda hesaplayip bize dondurecek
		
		int maas=8*25*saatUcreti;
		return maas;
	
	}

	
	
	
	
}
