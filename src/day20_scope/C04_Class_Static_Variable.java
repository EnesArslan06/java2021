package day20_scope;

public class C04_Class_Static_Variable {
	// Classýn icinde ancak main methodun dýsýnda olmalýdýr.
			//Static olmalýdýr.
			//Olusturulmasý yeterlidir, deger atanmasýna gerek yoktur.
			//static oldugu icin main methoddan direk cagýrýlabilir.
			//basýna static yazýlmalýdýr. 
	
	
	static int no=20;
    static int sayi;
	static String adres="Ankara";
	static String cadde;
	static boolean aktifMi=true;
	static boolean tatildeMi;
	
	public static void main(String[] args) {
		//static variable'lara main method dan direk ulasýlabilir mi?  Evet
		
		System.out.println(no); //20 yazdýrýr. dikkat obje olusturmadýk
		no++; //yaparsak once yazdýrýr sonra artýrýr.
		System.out.println(no); //21 yazdýrdýk			//static se okulun adý daire numarasý gibi butun seyleri degistirir
												//ve kalýcý olarak yazdýrýr
		
		staticMethod();
		System.out.println(no); //bunu yazdýrýrsak 22 olarak yazdýrýr. artýrýmý asagýdaki methodda yaptýk ama artýrýmý stattic
									//oldugu icin heryerde gecerli kýldý
		
}		
		
		public static void staticMethod() {
			//static variable'lara main method dan direk ulasýlabilir mi?  Evet	
		no++;
		System.out.println("static methodda sayi: " + no);
		}

		public void staticOlmayanMethod() {
			//static variable'lara main method dan direk ulasýlabilir mi?  Evet	
			//statik variablelera static olan veya olmayan tum methodlardan ulasýlabilir.
			//bu yuzden static veriablelara Class Variable denilir. Clasýn icindeki variableler ulasabilir.
			
			no++;
			System.out.println();
			
		}
		
		
}
