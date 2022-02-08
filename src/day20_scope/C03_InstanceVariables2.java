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
	//instance variable'lara main method dan direk ulasýlabilir mi? Hayýr
	//nasýl ulasabiliriz? Obje olusturarak.
		
		C03_InstanceVariables2 ali=new C03_InstanceVariables2(); //obje olusturduk olusturmasak asagýdaki sysolarý 
														//yazdýramazdý.
		
		System.out.println(ali.adres); //Ankara yazar.
		System.out.println(ali.dogumYeri);//yukarýda classýn icinde deger atamadýgýmýz icin null olarak yazar.
		System.out.println(ali.notOrtalamasi);//0.0 degeri atar. Main method icinde de bir deger atanmadýgý icin degeri yok yukarida da
		System.out.println(ali.yasOrtalamasi);//12.3 yazdýrýr
		System.out.println(ali.cinsiyet);//E yazdýrýr.
		System.out.println(ali.karakter);// " " bosluk yazdýrýr. Char oldugu icin
		System.out.println(ali.ogrenciMi);//true yazdýrýr yukarýda degeri var
		System.out.println(ali.izinliMi);//false olarak deger atar cunku yukarýda degeri yoktu.
	}

	public static void staticmethod() {
		//instance variable'lara staticmethod dan direk ulasýlabilir mi? Hayýr
		//nasýl ulasabiliriz? Obje olusturarak.	
		//static metoddan direk ulasamayýz obje olusturmamýz lazým.
		
		
	}

	public void staticOlmayanMethod() {
		//instance variable'lara staticolmayan method dan direk ulasýlabilir mi? Evet
				//nasýl ulasabiliriz? 
				//static olmayan methoddan direk ulasabiliriz.
		
		System.out.println(ogrenciMi);
		
	}	
	
	

}