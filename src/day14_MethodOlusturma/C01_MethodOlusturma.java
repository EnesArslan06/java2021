package day14_MethodOlusturma;

public class C01_MethodOlusturma {

	public static void main(String[] args) {
		// yeni meted mutlaka clas�n i�inde ancak main methodun d�s�nda olacakt�r.
		//main methoddan once olabilir sonra olabilir ama icinde olmaz.
		//methodlar robotlar gibidir. Cag�r�lmadan gelmez. olusturmak cal��mas� i�in yeterli degildir.
		// method call yapmam�z laz�m method cag�rmak i�in kullan�l�r.

		toplama(5,4);	
		
	}
		
	
		private static void toplama(int i, int j) {
	System.out.println(i+j);	}
		/*yukar�da g�sterdigim gibi toplama methodu i  ve j harflerini toplama i�lemine tabi tuttuk o toplad�
		main methodda toplama 4,5 yazd�g�m�z i�in toplad� i harfinin degeri 5 j harf�n�n degeri 4 */
	//bana oyle bir mehtod yazki say�lar� toplas�n getirsin, genellikle soru olarak kullanacaz.
	
	//toplama(5,4); ismi arguman olarak geccer
	//int j ve int i de parametre olarak adland�r�l�r. Arguma ile parametrelerin degeri ayn� olmal�d�r.
	// toplama i�lemi icin rakam g�ndermemiz laz�m bunun icinde uygun olan paramaetre secmemiz laz�m mesela
		//int long gibi.
		

	
}