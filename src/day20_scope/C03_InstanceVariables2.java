package day20_scope;

public class C03_InstanceVariables2 {

	String adres="Ankara";
	String dogumYeri;
	Double notOrtalamasi;
	Double yasOrtalamasi=12.3;
	char cinsiyet='#';
	char karakter;
	boolean ogrenciMi=true;
	boolean izinliMi;
	
	
	public static void main(String[] args) {
	//instance variable'lara main method dan direk ulas�labilir mi? Hay�r
	//nas�l ulasabiliriz? Obje olusturarak.
		
		C03_InstanceVariables2 ali=new C03_InstanceVariables2(); //obje olusturduk olusturmasak asag�daki sysolar� 
														//yazd�ramazd�.
		
		System.out.println(ali.adres); //Ankara yazar.
		System.out.println(ali.dogumYeri);//yukar�da class�n icinde deger atamad�g�m�z icin null olarak yazar.
		System.out.println(ali.notOrtalamasi);//0.0 degeri atar. Main method icinde de bir deger atanmad�g� icin degeri yok yukarida da
		System.out.println(ali.yasOrtalamasi);//12.3 yazd�r�r
		System.out.println(ali.cinsiyet);//E yazd�r�r.
		System.out.println(ali.karakter);// " " bosluk yazd�r�r. Char oldugu icin
		System.out.println(ali.ogrenciMi);//true yazd�r�r yukar�da degeri var
		System.out.println(ali.izinliMi);//false olarak deger atar cunku yukar�da degeri yoktu.
	}

	public static void staticmethod() {
		//instance variable'lara staticmethod dan direk ulas�labilir mi? Hay�r
		//nas�l ulasabiliriz? Obje olusturarak.	
		//static metoddan direk ulasamay�z obje olusturmam�z laz�m.
		
		
	}

	public void staticOlmayanMethod() {
		//instance variable'lara staticolmayan method dan direk ulas�labilir mi? Evet
				//nas�l ulasabiliriz? 
				//static olmayan methoddan direk ulasabiliriz.
		
		System.out.println(ogrenciMi);
		
	}	
	
	

}