package day14_MethodOlusturma;

public class C01_MethodOlusturma {

	public static void main(String[] args) {
		// yeni meted mutlaka clasýn içinde ancak main methodun dýsýnda olacaktýr.
		//main methoddan once olabilir sonra olabilir ama icinde olmaz.
		//methodlar robotlar gibidir. Cagýrýlmadan gelmez. olusturmak calýþmasý için yeterli degildir.
		// method call yapmamýz lazým method cagýrmak için kullanýlýr.

		toplama(5,4);	
		
	}
		
	
		private static void toplama(int i, int j) {
	System.out.println(i+j);	}
		/*yukarýda gösterdigim gibi toplama methodu i  ve j harflerini toplama iþlemine tabi tuttuk o topladý
		main methodda toplama 4,5 yazdýgýmýz için topladý i harfinin degeri 5 j harfýnýn degeri 4 */
	//bana oyle bir mehtod yazki sayýlarý toplasýn getirsin, genellikle soru olarak kullanacaz.
	
	//toplama(5,4); ismi arguman olarak geccer
	//int j ve int i de parametre olarak adlandýrýlýr. Arguma ile parametrelerin degeri ayný olmalýdýr.
	// toplama iþlemi icin rakam göndermemiz lazým bunun icinde uygun olan paramaetre secmemiz lazým mesela
		//int long gibi.
		

	
}